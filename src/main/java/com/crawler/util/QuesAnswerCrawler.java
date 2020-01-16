package com.crawler.util;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class QuesAnswerCrawler {

	public String URI;
	protected Document doc;
	
	public void connect() throws IOException {
		this.doc = Jsoup.connect(this.URI).get();	
	}
	
	public abstract String getQuestionHeader();
	
	public abstract String getQuestion();
	
	public abstract Integer getAnswerCount();
	
	// TODO replace string with answer class
	public abstract List<String> getAnswers();

}
