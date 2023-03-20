package com.inherit.model.vo;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String address;
	
	// 생성자 바로 만들기 
	// ctrl + space + enter 바로 만들어짐
	public Person() {

	}
	//매개변수 있는 생성자
		// alt + s + a + g 눌르면 바로 만들어짐
	public Person(String name, int age, char gender, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	//멤버변수별 setter/getter 있는 생성자
	// alt + s + r + a + r 눌르면 바로 만들어짐
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String infoPerson() {
		return name + " " + age + " " + gender + " " + phone + " " + address;
	}
	
	public String info() {
		return infoPerson();
	}
	
}
