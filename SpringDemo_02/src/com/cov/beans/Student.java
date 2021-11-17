package com.cov.beans;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("invoking parameter constructor");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("invoking no parameter constructor");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;

	}

}
