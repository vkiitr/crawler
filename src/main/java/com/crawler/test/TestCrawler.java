package com.crawler.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class TestCrawler {

	public static void main(String[] args) {
		String[] urlList = {
				"",
				"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
				"https://stackoverflow.com/questions/29953245/configure-viewresolver-with-spring-boot-and-annotations-gives-no-mapping-found-f",
				"https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated?noredirect=1&lq=1",
				"https://blender.stackexchange.com/questions/163760/is-there-a-way-to-change-the-edge-from-auto-smooth-mode-to-a-complete-curve"
		};

		// new TestCrawler().getPageLinks(URL, 0);
		try {
			Document doc = Jsoup.connect(urlList[4]).get();
			System.out.println("========Title=============");
			System.out.println(doc.getElementById("question-header").getElementsByClass("question-hyperlink").text());
			System.out.println("\n========Question=============\n");
			System.out.println(doc.getElementById("question").getElementsByClass("post-text").text());
			
			System.out.println("\n========Answers =============\n");
			Elements answerList = doc.getElementsByAttributeValueStarting("id", "answer-");
			System.out.println(answerList.size());
			for (Element answer : answerList) {
				System.out.println("\n=================================\n");
				System.out.println(answer.getElementsByClass("post-text").text());
			}
			//System.out.println(doc.getElementsByClass("comments"));
			// System.out.println(doc.html());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		String fileName = "src\\main\\samples\\sample2.html";
//
//        try {
//			Document doc = Jsoup.parse(new File(fileName), "utf-8");
//			//System.out.println("Title: " + doc.title());
//			System.out.println(doc.getElementsByClass("comments"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	}
	
}