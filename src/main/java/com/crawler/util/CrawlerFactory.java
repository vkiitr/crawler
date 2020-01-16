package com.crawler.util;

public class CrawlerFactory {

	public Parser getParser(ParserType parserType) {
		switch (parserType) {
			case BLOGSPOT:
				return new BlogSpotBlogParser();
			case MEDIUM :
				return new MediumBlogParser();
			case STACKOVERFLOW:
				return new StackOverflowQuesAnswerParser();
			case QUORA:
				return new QuoraQuesAnswerParser();
			default:	
				break;
		}
		return null;
	}
}
