package com.lti.online.exam;

public class Option {
	private String options;
	private boolean isRightAnswer;

	public Option(String option, boolean isRightAnswer) {
		super();
		this.options = option;
		this.isRightAnswer = isRightAnswer;
	}

	public String getOption() {
		return options;
	}

	public void setOption(String option) {
		this.options = option;
	}

	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}

}
