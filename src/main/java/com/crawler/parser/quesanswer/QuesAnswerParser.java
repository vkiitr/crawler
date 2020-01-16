package com.crawler.parser.quesanswer;

import java.util.List;

import com.crawler.parser.Parser;

public abstract class QuesAnswerParser extends Parser {
	
	public abstract String getQuestionHeader();
	
	public abstract String getQuestion();
	
	public abstract Integer getAnswerCount();
	
	// TODO replace string with answer class
	public abstract List<String> getAnswers();

}
