package com.ploy.model.vo;

// 추상클래스
// 일반클래스와 동일하게 선언할수 있다 -> 필드, 메소드, 생성자 모두 가질수 있다.
// 차이는 추상클래스는 생성이 불가능하다. -> 추상클래스만 가지고 기본적으로는 이용할수 없다.
// 무조건 상속받아서 이용한다.

public abstract class AbstarctClassTest {

	private String title;
	private String writter;
	
	public AbstarctClassTest() {
		// TODO Auto-generated constructor stub
	}

	public AbstarctClassTest(String title, String writter) {
		super();
		this.title = title;
		this.writter = writter;
	}
	
	public void testPrint() {
		System.out.println("추상클래스 메소드");
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}
	
	
	
	
}
