package com.crawler.util;

import java.util.List;

public class MediumBlogCrawler extends BlogCrawler {

	public MediumBlogCrawler(String uRI) {
		this.URI = uRI;
	}

	@Override
	public List<String> getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBlogTitle() {
		System.out.println("MediumBlogCrawler: getBlogTitle " + URI);
		return null;
	}

	@Override
	public String getBlogContent() {
		// TODO Auto-generated method stub
		return null;
	}

}
