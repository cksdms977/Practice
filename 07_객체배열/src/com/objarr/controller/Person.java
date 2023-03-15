package com.objarr.controller;

public class Person {
	// com.objarr.controller.Person만들기
				// 이름 나이 주소 전화번호
//				Person을 5명 저장할 수 있는 공간을 확보하고
//				-> 생성자는 기본 생성자만 생성
//				사용자가 입력한 값으로 Person을 생성 및 저장소에 저장 후
				// 저장된 사용자 모두를 출력하기
				// getter/setter사용하기
	private String name;
	private int age;
	private String address;
	private String phonenumber;
	
	
	public Person() {}
	
	public Person(String name, int age, String address, String phonenumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phonenumber = phonenumber;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhonenumber() {
		return this.phonenumber;
	}
	public String infoPerson() {
		return this.name + " " + this.age + " " + this.address + " " + this.phonenumber;
	}
	
}
