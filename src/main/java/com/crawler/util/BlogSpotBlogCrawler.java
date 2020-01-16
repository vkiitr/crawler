package com.crawler.util;

import java.util.List;

public class BlogSpotBlogCrawler extends BlogCrawler {

	public BlogSpotBlogCrawler(String uRI) {
		this.URI = uRI;
	}

	@Override
	public String getBlogTitle() {
		System.out.println("BlogSpotBlogCrawler: getBlogTitle " + URI);
		return null;
	}

	@Override
	public String getBlogContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
