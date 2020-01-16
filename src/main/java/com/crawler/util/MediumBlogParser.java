package com.crawler.util;

import java.util.List;

import org.jsoup.nodes.Document;

public class MediumBlogParser extends BlogParser {

	public MediumBlogParser() {
	}

	@Override
	public List<String> getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBlogTitle() {
		System.out.println("MediumBlogCrawler: getBlogTitle ");
		return null;
	}

	@Override
	public String getBlog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getContents(Document doc, String uRL) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void store(String filename) {
		// TODO Auto-generated method stub
		
	}

}
