package com.crawler.util;

public class CrawlerRunner {

	public static void main(String[] args) {
		String[] urlList = {
				"https://stackoverflow.com/questions",
				"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
				"https://stackoverflow.com/questions/29953245/configure-viewresolver-with-spring-boot-and-annotations-gives-no-mapping-found-f",
				"https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated?noredirect=1&lq=1",
				"https://blender.stackexchange.com/questions/163760/is-there-a-way-to-change-the-edge-from-auto-smooth-mode-to-a-complete-curve",
				"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
				"https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j?rq=1"
		};
				
		Crawler crwlRunner1 = new Crawler(new CrawlerFactory().getParser(ParserType.STACKOVERFLOW));
		crwlRunner1.crawlAndStore(urlList[2], 0, "C:/DataDrive/crawl-store/stackoverflow1.txt");

//		Crawler crwlRunner2 = new Crawler(new CrawlerFactory().getParser(ParserType.BLOGSPOT));
//		crwlRunner2.crawlAndStore(urlList[5], 1, "C:/DataDrive/stackoverflow1.txt");

	}
}
