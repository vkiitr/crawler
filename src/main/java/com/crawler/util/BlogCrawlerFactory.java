package com.crawler.util;

public class BlogCrawlerFactory {

	public BlogCrawler getCrawler(CrawlerType crawlerType, String uri) {
		switch (crawlerType) {
			case BLOGSPOT:
				return new BlogSpotBlogCrawler(uri);
			case MEDIUM :
				return new MediumBlogCrawler(uri);
			default:	
				break;
		}
		return null;
	}
}
