package com.covalense.beans;

import java.util.Map;

public class Question {
	private int id;
	private String name;
	private String username;
	private Map<String,String> answers;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", username=" + username + ", answers=" + answers + "]";
	}
	public Question() {
		super();
	}
	public Question(String name, String username, Map<String, String> answers) {
		super();
		this.name = name;
		this.username = username;
		this.answers = answers;
	}
	
	

}
