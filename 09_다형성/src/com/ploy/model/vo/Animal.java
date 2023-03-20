package com.ploy.model.vo;



public abstract class Animal { // 여기에서 abstract를 써야한다.
	
	private String name;
	private String type;
	private int age;

	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	// 자식클래스에서 반드시 구현해야할 메소드가 있다면
	// abstaract예약어를 사용해서 처리한다.
	// 1. 메소드의 선언문만 작성함.
	// 2. 구현부는 자식클래스에서 구현을 한다. -> 자식클래스가 Override에서 구현한다.
	
//	public void bark() {
//		System.out.println("울음소리!");
//	}
	
	public abstract void bark();
	
	
	
}
