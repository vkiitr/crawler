package com.crawler.util;

import java.util.List;

public abstract class QuesAnswerParser extends Parser {
	
	public abstract String getQuestionHeader();
	
	public abstract String getQuestion();
	
	public abstract Integer getAnswerCount();
	
	// TODO replace string with answer class
	public abstract List<String> getAnswers();

}
