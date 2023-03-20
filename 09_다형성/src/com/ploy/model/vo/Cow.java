package com.ploy.model.vo;

public class Cow extends Animal{

	public Cow() {
		// TODO Auto-generated constructor stub
	}
	
	public Cow(String name, String type, int age) {
		super(name, type, age);
	}
	
	
	public String cowbark() {
		return "음매";
	}
	
	@Override
	public void bark() {
		System.out.println(cowbark());
	}
}
