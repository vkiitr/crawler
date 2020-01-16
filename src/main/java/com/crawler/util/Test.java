package com.crawler.util;

import java.io.IOException;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String[] urlList = {
				"https://stackoverflow.com/questions",
				"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
				"https://stackoverflow.com/questions/29953245/configure-viewresolver-with-spring-boot-and-annotations-gives-no-mapping-found-f",
				"https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated?noredirect=1&lq=1",
				"https://blender.stackexchange.com/questions/163760/is-there-a-way-to-change-the-edge-from-auto-smooth-mode-to-a-complete-curve",
				"https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j?rq=1"
		};
				
		QuesAnsCrawlerFactory qaFactory = new QuesAnsCrawlerFactory();
		QuesAnswerCrawler qaCrawler = qaFactory.getCrawler(CrawlerType.STACKOVERFLOW, urlList[5]);
		try {
			qaCrawler.connect();
			System.out.println("========Header=============");
			System.out.println(qaCrawler.getQuestionHeader());
			System.out.println("\n========Question=============\n");
			System.out.println(qaCrawler.getQuestion());
			System.out.println("\n========Answers Count =============\n");
			System.out.println(qaCrawler.getAnswerCount());
			System.out.println("\n========Answers =============\n");
			List<String> answers = qaCrawler.getAnswers();	
			for (String answer : answers) {
				System.out.println(answer);
				System.out.println("====================\n");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		BlogCrawlerFactory blogCrawlerFactory = new BlogCrawlerFactory();
//		BlogCrawler blogCrawler = blogCrawlerFactory.getCrawler("BLOGSPOT", "https://blog");
//		blogCrawler.getBlogTitle();
	}
}
