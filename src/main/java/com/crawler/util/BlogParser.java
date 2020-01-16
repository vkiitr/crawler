package com.crawler.util;

import java.util.List;

public abstract class BlogParser extends Parser {
	
	public abstract String getBlogTitle();
	
	public abstract String getBlog();
	
	// TODO replace string with comment class
	public abstract List<String> getComment();

}
