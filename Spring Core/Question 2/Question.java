package com.springassignment;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question{
	int questionId;
	String question;
	  List<String> answer1;
	  Set<String>  answer2;
	  Map<Integer, String> answer3;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(List<String> answer1) {
		this.answer1 = answer1;
	}
	public Set<String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Set<String> answer2) {
		this.answer2 = answer2;
	}
	public Map<Integer, String> getAnswer3() {
		return answer3;
	}
	public void setAnswer3(Map<Integer, String> answer3) {
		this.answer3 = answer3;
	}
	
}