package com.crawler.parser.quesanswer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StackOverflowQuesAnswerParser extends QuesAnswerParser {

	private Document doc;
	private List<List<String>> contents;
	
	public StackOverflowQuesAnswerParser() {
		contents = new ArrayList<>();
	}

	@Override
	public String getQuestionHeader() {
		return doc.getElementById("question-header").getElementsByClass("question-hyperlink").text();
	}

	@Override
	public String getQuestion() {
		return doc.getElementById("question").getElementsByClass("post-text").text();
	}

	@Override
	public Integer getAnswerCount() {
		return doc.getElementsByAttributeValueStarting("id", "answer-").size();
	}

	@Override
	public List<String> getAnswers() {
		Elements answers = doc.getElementsByAttributeValueStarting("id", "answer-");
		List<String> answerList = new ArrayList<>();
		for (Element answer : answers) {
			answerList.add(answer.getElementsByClass("post-text").text());
		}
		return answerList;
	}

	@Override
	public Elements getAllLinksOnCurrentDocument(Document doc) {
		// return doc.select("a[href^=\"https://stackoverflow.com/questions/\"]");	
		 return doc.select("a[href]");
		// return doc.select("a[href^=\"/questions/\"]");	
		
	}
	
	@Override
	public List<String> getContents(Document doc, String uRL) {
		if (uRL.contains("https://stackoverflow.com/questions/")) {
			this.doc = doc;
			List<String> content = new ArrayList<>();
			try {
			content.add(uRL);
			content.add(getQuestionHeader());
			content.add(getAnswerCount()+"");
			content.add(getQuestion());
//			List<String> answers = getAnswers();	
//			for (String answer : answers) {
//				System.out.println(answer);
//				System.out.println("====================\n");
//			}
			this.contents.add(content);
			} catch(Exception e) {
				System.out.println("Error Ignore!");
			}	
			return content;
		}
		return null;
	}

	@Override
	public void store(String filename ) {
        FileWriter writer;
        String QUES_SEPRATOR = "\n\n\n=====================================================================\n\n";
        String INTERNAL_SEPRATOR = "\n---------------------------------------------------\n";
        try {
            writer = new FileWriter(filename);
            this.contents.forEach(a -> {
                try {
                    String temp = 
                    		"Link: \n" + a.get(0) + INTERNAL_SEPRATOR + 
                    		"Title: \n" + a.get(1) + INTERNAL_SEPRATOR + 
                    		"AnswerCount: \n" + a.get(2) + INTERNAL_SEPRATOR +
                    		"Question: \n" + a.get(3) + QUES_SEPRATOR;
                    // display to console
                    // System.out.println(temp);
                    // save to file
                    writer.write(temp);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            });
            writer.close();
            System.out.println("StackOverflowQuesAnswerCrawler:: DONE");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
	}
}
