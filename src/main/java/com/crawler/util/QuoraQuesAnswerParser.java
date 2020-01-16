package com.crawler.util;

import java.util.List;

import org.jsoup.nodes.Document;

public class QuoraQuesAnswerParser extends QuesAnswerParser {

	public QuoraQuesAnswerParser() {
		
	}

	@Override
	public String getQuestionHeader() {
		System.out.println("QuoraQuesAnswerCrawler: getQuestionHeader ");
		return null;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAnswerCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAnswers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getContents(Document doc, String uRL) {
		System.out.println("QuoraQuesAnswerCrawler: getContents " );
		return null;
	}

	@Override
	protected void store(String filename) {
		System.out.println("QuoraQuesAnswerCrawler: store " );
		
	}


}
