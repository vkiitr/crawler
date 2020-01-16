package com.crawler.util;

import java.io.IOException;
import java.util.HashSet;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {

	private static final int MAX_DEPTH = 3;
	
	// make a graph of links and mark them as processed if already processed.
    private HashSet<String> processedLinks;
    private Parser parser;
    
    public Crawler(Parser parser) {
        processedLinks = new HashSet<>();
        this.parser = parser;
    }
    
    public void crawlAndStore(String URL, int depth, String filename) {
    	this.crawlWithDepth(URL, depth);
    	this.parser.store(filename);
    }
    
    private void crawlWithDepth(String URL, int depth) {
        if ((!processedLinks.contains(URL) && (depth < MAX_DEPTH))) {
            System.out.println(">> Depth: " + depth + " [" + URL + "]");
            try {
                Document document = this.parser.connect(URL);
                this.parser.getContents(document, URL);
                
                Elements linksOnPage = this.parser.getAllLinksOnCurrentDocument(document);
                depth++;
                processedLinks.add(URL);
                for (Element link : linksOnPage) {
                	crawlWithDepth(this.parser.getAbsoluteURIOfCurrentPage(link), depth);
                }
            } catch (IOException e) {
                System.err.println("For '" + URL + "': " + e.getMessage());
            }
        }
    }    
}
