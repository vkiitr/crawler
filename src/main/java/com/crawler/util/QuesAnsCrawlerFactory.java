package com.crawler.util;

public class QuesAnsCrawlerFactory {

	public QuesAnswerCrawler getCrawler(CrawlerType crawlerType, String uri) {
		switch (crawlerType) {
			case STACKOVERFLOW:
				return new StackOverflowQuesAnswerCrawler(uri);
			case QUORA:
				return new QuoraQuesAnswerCrawler(uri);
			default:
				break;
		}
		return null;
	}
}
