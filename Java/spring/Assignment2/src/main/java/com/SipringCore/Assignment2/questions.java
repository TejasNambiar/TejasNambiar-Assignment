package com.SipringCore.Assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class questions {
	private int questionId;
	private String question;
	private List<ListAnswers> l;
	private Set<SetAnswers> s;
	private Map<Integer, String> m;

	// getters
	public Map<Integer, String> getM() {
		return m;
	}

	public int getQuestionId() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public List<ListAnswers> getL() {
		return l;
	}

	public Set<SetAnswers> getS() {
		return s;
	}

	public void setS(Set<SetAnswers> s) {
		this.s = s;
	}

	// setters
	public void setM(Map<Integer, String> m) {
		this.m = m;
	}

	public void setL(List<ListAnswers> l) {
		this.l = l;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void displayList() {
		System.out.println("-------List Based Output-------");
		System.out.println("Que: " + getQuestion());
		System.out.println("Ans:");
		for (ListAnswers a : l) {
			System.out.println(a.getListanswers());
		}
	}

	public void displaySet() {
		System.out.println("\n-------Set Based Output-------");
		System.out.println("Que: " + getQuestion());
		System.out.println("Ans:");
		for (SetAnswers s1 : s) {
			System.out.println(s1.getSetanswers());
		}
	}

	public void displayMap() {
		System.out.println("\n-------Map Based Output-------");
		System.out.println("Que: " + getQuestion());
		System.out.println("Ans:");
		for (Map.Entry<Integer, String> set : m.entrySet()) {
			System.out.println(set.getKey() + " = " + set.getValue());

		}
	}
}
