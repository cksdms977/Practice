package com.ploy.model.vo;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	void setAge(int age) {
		this.age = age;
	}
	
	
	
}
