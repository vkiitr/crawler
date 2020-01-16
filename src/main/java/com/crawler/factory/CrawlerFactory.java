package com.crawler.factory;

import com.crawler.parser.Parser;
import com.crawler.parser.ParserType;
import com.crawler.parser.blog.BlogSpotBlogParser;
import com.crawler.parser.blog.MkYongBlogParser;
import com.crawler.parser.quesanswer.QuoraQuesAnswerParser;
import com.crawler.parser.quesanswer.StackOverflowQuesAnswerParser;

public class CrawlerFactory {

	public Parser getParser(ParserType parserType) {
		switch (parserType) {
			case BLOGSPOT:
				return new BlogSpotBlogParser();
			case MKYONG :
				return new MkYongBlogParser();
			case QUORA:
				return new QuoraQuesAnswerParser();
			case STACKOVERFLOW:
				return new StackOverflowQuesAnswerParser();
			default:	
				break;
		}
		return null;
	}
}
