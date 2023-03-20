package com.inherit.model.vo;


// 상속이 불가능한 클래스(이클래스가 상속이 불가능하다는 뜻)
public final class FinalTestClass {
	private String test;
	
	public void setTest(String test) {
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}

}
