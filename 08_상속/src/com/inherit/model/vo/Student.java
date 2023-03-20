package com.inherit.model.vo;

import java.util.Objects;

public class Student extends Person {
	// 이름 나이 성별 전화번호 주소
	// 수강과목 특이사항, 수준
	
	private String joinclass;
	private String issue;
	private char level;
	
	public Student() {

	}

	public Student(String name, int age, char gender, String phone, String address, String joinclass, String issue, char level) {
		super(name, age, gender, phone, address);
		this.joinclass = joinclass;
		this.issue = issue;
		this.level = level;
	}

	public String getJoinclass() {
		return joinclass;
	}

	public void setJoinclass(String joinclass) {
		this.joinclass = joinclass;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char level) {
		this.level = level;
	}
	public String infoStudent() {
		return getName() + " " + getAge() + " " +
				getGender() + " " + getJoinclass() 
				+ " " + getLevel() + " " + getIssue();
	}
	
	@Override
	public String info() {
		return infoStudent();
	}
	
	@Override
	public boolean equals(Object o) {
		// 객체의 동등성비교를 하기위해 재정의 설정을 한다.
		// 필드의 값을 가지고 생성된 값이 같은지 비교하기 위해 //여기서 자기것을 실행하면서 비교함
		Student s = (Student)o;
		if (getName().equals(s.getName())
				&& getAge() == s.getAge() 
				&& getGender() == s.getGender()
				&& getAddress().equals(s.getAddress())
				&& getPhone().equals(s.getPhone())
				&& joinclass.equals(s.joinclass)) {
			return true;
		}
		return false;
	}
	
	// toString Override하기
	@Override
	public String toString() {
		return getName() + " " + getAge() + " " + getAddress() + " " 
				+ getGender() + " " + getPhone() + " "
				+ getAddress() + " " + joinclass + " " +
				issue + " " + level;
		
	}
	@Override
	public int hashCode() {
		// equals에서 동등비교의 기준이 된 필드를 매개변수로 넣으면 
		return Objects.hash(getName(), getAge(), getGender(),
				getPhone(), getAddress(), joinclass);
	}
	
	//clone : 객체복사 메소드
	// 깊은 복사를 구현
	@Override
	public Student clone() {
		return new Student(getName(), getAge(), getGender(), getPhone(), getAddress(),
				 joinclass, issue, level);
	}
	
}
