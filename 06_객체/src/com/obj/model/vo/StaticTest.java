package com.obj.model.vo;

public class StaticTest {
	// static 예약어를 사용한 필드는 클래스를 생성 (객체화)하지 않고 
	// 사용할 수 있는 저장공간(클래스 변수)
	public static String test; // 클래스 생성
	
	private static int count; 
	
	private static final String ERROR_404; // 필드에서 final선언했을때 무조건 초기화 해야함.
	static {
		ERROR_404 = "페이지 없음";
	} // 초기화 블록으로 이용해서 final에 대입해줌 
	
	private String member;
	
	// 메소드에 static 사용하기
	public static void testMethod() {
		System.out.println("static 메소드");
		
	}
	
	public static void setCount(int count) {
		StaticTest.count = count;
		// 필드안에 있는 멤버변수는 static 메소드에서 이용하지 못함. 
		// 왜냐하면 static은 처음 만들어질때부터 시작하고,
		// 필드에 있는 멤버변수는 객체를 생성하고 시작되기때문이다.
//		member = "김찬은";
//		memberMethod(); // 이거 둘다 실행하지 못함.
	}
	
	public static int getCount() {
		return StaticTest.count;
	}
	
}
