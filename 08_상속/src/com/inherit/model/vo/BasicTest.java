package com.inherit.model.vo;

public class BasicTest extends Parent {
	private int number;
	
	// 생성자 활용하기
	public BasicTest() {
//		super("기본", 100); 이렇게 선언가능
		super(); // 이렇게 그냥 기본 생성자 호출하도록 쓸수있다.
	}
	
	public BasicTest(String title, int number, double weight) {
		super(title, weight);
		this.number = number;
//		super(title, weight); 이렇게 this밑에 선언하면 안됨, 무조건 위에 super를 써야함.
	//	setTitle(title);
	//	super.weight = weight;
		
	}
	
	
	
	
	public void seNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	
	
	// 부모클래스에 선언된 필드에 접근하기
	// 부모클래스에 필드 메소드에 접근하기 위해서
	// 필드, 메소드는 접근제한자의 영향을 받는다.
	public String infoBasicTest() {
		return getTitle() + number + weight; // 이렇게 접근할수 있는데, 
									// 부모클래스에 private이라고 접근제한자되어있어서 안됨, 
									// getter/setter를 이용해서 접근해야함 그냥 title클래스명을 적으면 안됨
	}
	
	
}