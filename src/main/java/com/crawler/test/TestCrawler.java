package com.crawler.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class TestCrawler {
	private static final int MAX_DEPTH = 2;
	private HashSet<String> links;

	public TestCrawler() {
		links = new HashSet<>();
	}

	public void getPageLinks(String URL, int depth) {
		if ((!links.contains(URL) && (depth < MAX_DEPTH))) {
			System.out.println(">> Depth: " + depth + " [" + URL + "]");
			try {
				links.add(URL);

				Document document = Jsoup.connect(URL).get();

				Elements linksOnPage = document.select("a[href]");

				depth++;
				for (Element page : linksOnPage) {
					getPageLinks(page.attr("abs:href"), depth);
				}
			} catch (IOException e) {
				System.err.println("For '" + URL + "': " + e.getMessage());
			}
		}
	}

//	public static void main(String[] args) {
//		String[] urlList = { 
//				"https://javarevisited.blogspot.com/2018/09/the-2018-devops-roadmap-your-guide-to-become-DevOps-Engineer.html",
//				"https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/",
//				"https://www.geeksforgeeks.org/minimum-number-of-fibonacci-jumps-to-reach-end/",
//				"",
//				"",
//				""
//		};
//
//		// new TestCrawler().getPageLinks(URL, 0);
//		try {
//			Document doc = Jsoup.connect(urlList[2]).get();
//			System.out.println(doc);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		String fileName = "src\\main\\samples\\sample1.html";

        try {
			Document doc = Jsoup.parse(new File(fileName), "utf-8");
			System.out.println("Title: " + doc.title());
			System.out.println(doc.wholeText());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}