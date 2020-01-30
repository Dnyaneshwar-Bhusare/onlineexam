package com.lti.online.exam;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public List<Question> loadQuestionOnJava() {
		QuestionBank questionBank = new QuestionBank();
		questionBank.addSubject("java");

		Question q = new Question("What is java");
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("Java is an Os", false));
		options.add(new Option("Java is a Database", false));
		options.add(new Option("Java is a PL", true));
		options.add(new Option("Java is a browser", false));
		q.setOption(options);
		questionBank.addQuestion("java", q);
		
		q = new Question("What is class");
		options = new ArrayList<Option>();
		options.add(new Option("class is a instance of object", false));
		options.add(new Option("class is a object", false));
		options.add(new Option("class is a Blueprint of object", true));
		options.add(new Option("None of these", false));
		q.setOption(options);
		questionBank.addQuestion("java", q);

		q = new Question("What is Object");
		options = new ArrayList<Option>();
		options.add(new Option("Object is a instance of class", true));
		options.add(new Option("Object is a class", false));
		options.add(new Option("Object is a Blueprint of class", false));
		options.add(new Option("None of these", false));
		q.setOption(options);
		questionBank.addQuestion("java", q);
		
		return questionBank.getQuestionFor("java");

	}

	public List<Question> loadQuestionOnC() {
		QuestionBank questionBank = new QuestionBank();
	
		questionBank.addSubject("c");

		Question q = new Question("What is C");
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("c is an Os", false));
		options.add(new Option("c is a Database", false));
		options.add(new Option("c is a PL", true));
		options.add(new Option("c is a browser", false));
		q.setOption(options);
		questionBank.addQuestion("c", q);
		
		return questionBank.getQuestionFor("c");

	}
}
