package com.crawler;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.crawler.parser.Parser;

public class Crawler {

	private static final int MAX_DEPTH = 100000;
	
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
        if (isValid(URL) && (!processedLinks.contains(URL) && depth < MAX_DEPTH)) {
            System.out.println(">> Depth: " + depth + " [" + URL + "]");
            try {
                Document document = this.parser.connect(URL);
                this.parser.getContents(document, URL);
                
                Elements linksOnPage = this.parser.getAllLinksOnCurrentDocument(document);
                depth++;
                // processedLinks.add(URL);
                for (Element link : linksOnPage) {
                	if (processedLinks.add(URL)) {
                        //Remove the comment from the line below if you want to see it running on your editor
                        System.out.println(URL);
                    }
                	crawlWithDepth(this.parser.getAbsoluteURIOfCurrentPage(link), depth);
                }
            } catch (IOException e) {
                System.err.println("For '" + URL + "': " + e.getMessage());
            }
        }
    }   
    
    /* Returns true if url is valid */
    public static boolean isValid(String url) 
    { 
        /* Try creating a valid URL */
        try { 
            new URL(url).toURI(); 
            return true; 
        } 
          
        // If there was an Exception 
        // while creating URL object 
        catch (Exception e) { 
            return false; 
        } 
    } 
}
