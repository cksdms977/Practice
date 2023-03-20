package com.inherit.model.vo;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Teacher extends Person{
		// 이름, 나이 , 성별, 전화번호, 주소
	   // 과목, 경력 연봉 
	
	private String subject;
	private int career;
	private int salary;
	
	public Teacher() {
		
	}
	
	// alt + s + a
	public Teacher(String name, int age, char gender, String phone, String address, String subject, int career, int salary) {
		super(name, age, gender, phone, address);
		this.subject = subject;
		this.career = career;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String infoTeacher() {
		return super.infoPerson() + career + " " + salary + " " + subject;
	}
	
	@Override
	public String info() {
		return infoTeacher();
	}
	
	@Override
	public boolean equals(Object o) {
		Teacher t = (Teacher) o;
		if (getName().equals(t.getName())
				&& getAge() == t.getAge()
				&& getSubject().equals(t.subject)
				&& getCareer() == t.career) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return getName() + " " + getAge() + " " + getGender() + " " 
		+ getPhone() + " " + getAddress() + " " + getSubject() + " " 
		+ getCareer() + " " + getSalary();
	}
	
	
	
	
}
