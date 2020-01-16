package com.crawler.parser.blog;

import java.util.List;

import org.jsoup.nodes.Document;

public class BlogSpotBlogParser extends BlogParser {

	public BlogSpotBlogParser() {
		
	}

	@Override
	public String getBlogTitle() {
		System.out.println("BlogSpotBlogCrawler: getBlogTitle ");
		return null;
	}

	@Override
	public String getBlog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getContents(Document doc, String uRL) {
		System.out.println("BlogSpotBlogCrawler: getBlogTitle ");
		return null;
	}

	@Override
	public void store(String filename) {
		// TODO Auto-generated method stub
		
	}

	
}
