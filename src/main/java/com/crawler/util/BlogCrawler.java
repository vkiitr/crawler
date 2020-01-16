package com.crawler.util;

import java.util.List;

public abstract class BlogCrawler {

	public String URI;
	
	public abstract String getBlogTitle();
	
	public abstract String getBlogContent();
	
	// TODO replace string with comment class
	public abstract List<String> getComment();

}
