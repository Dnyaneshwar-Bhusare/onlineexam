package com.lti.online.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Question>> questionBank;

	public QuestionBank() {
		questionBank = new HashMap<>();
	}

	public void addSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<>());

	}

	public void addQuestion(String subjectName, Question question) {
		List<Question> questions = questionBank.get(subjectName);
		questions.add(question);
	}

	public List<Question> getQuestionFor(String subjectName) {
		return questionBank.get(subjectName);
	}

}
