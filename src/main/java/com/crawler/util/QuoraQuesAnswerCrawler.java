package com.crawler.util;

import java.util.List;

public class QuoraQuesAnswerCrawler extends QuesAnswerCrawler {

	public QuoraQuesAnswerCrawler(String uRI) {
		this.URI = uRI;
	}

	@Override
	public String getQuestionHeader() {
		System.out.println("QuoraQuesAnswerCrawler: getQuestionHeader " + URI);
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


}
