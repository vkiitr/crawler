package com.crawler.test;

import com.crawler.Crawler;
import com.crawler.factory.CrawlerFactory;
import com.crawler.parser.ParserType;

public class CrawlerTest {

	public static void main(String[] args) {
		String[] urlList = {
			"https://stackoverflow.com/questions",
			"https://stackoverflow.com/questions/29953245/configure-viewresolver-with-spring-boot-and-annotations-gives-no-mapping-found-f",
			"https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated?noredirect=1&lq=1",
			"https://stackoverflow.com/questions/59764049/set-operation-in-cupdate-existing-value",
			"https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j?rq=1",
			"https://blender.stackexchange.com/questions/163760/is-there-a-way-to-change-the-edge-from-auto-smooth-mode-to-a-complete-curve",
			
			"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
			"",
			
			"https://mkyong.com/misc/java-how-to-split-string-by-new-line/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=footer-left&utm_content=link0",
			"https://mkyong.com/tutorials/spring-boot-tutorials/",
			
			"http://www.mkyong.com/",
			""

		};
				
		Crawler crawlerObj1 = new Crawler(new CrawlerFactory().getParser(ParserType.STACKOVERFLOW));
		crawlerObj1.crawlAndStore(urlList[0], 0, "C:/DataDrive/crawl-store/stackoverflow1.txt");

//		Crawler crawlerObj2 = new Crawler(new CrawlerFactory().getParser(ParserType.BLOGSPOT));
//		crawlerObj2.crawlAndStore(urlList[5], 1, "C:/DataDrive/crawl-store/blogspot1.txt");

	}
}
