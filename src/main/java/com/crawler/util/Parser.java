package com.crawler.util;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class Parser {

	public Document connect(String URI) throws IOException {
		return Jsoup.connect(URI).get();	
	}
	
	public String getAbsoluteURIOfCurrentPage(Element link) {
		return link.attr("abs:href");	
	}
	
	public Elements getAllLinksOnCurrentDocument(Document doc) {
		return doc.select("a[href]");	
	}
	
	protected abstract List<String> getContents(Document doc, String uRL);

	protected abstract void store(String filename);
}
