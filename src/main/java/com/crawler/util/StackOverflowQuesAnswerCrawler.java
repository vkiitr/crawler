package com.crawler.util;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StackOverflowQuesAnswerCrawler extends QuesAnswerCrawler {

	public StackOverflowQuesAnswerCrawler(String uRI) {
		this.URI = uRI;
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
}
