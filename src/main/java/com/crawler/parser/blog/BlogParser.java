package com.crawler.parser.blog;

import java.util.List;

import com.crawler.parser.Parser;

public abstract class BlogParser extends Parser {
	
	public abstract String getBlogTitle();
	
	public abstract String getBlog();
	
	// TODO replace string with comment class
	public abstract List<String> getComment();

}
