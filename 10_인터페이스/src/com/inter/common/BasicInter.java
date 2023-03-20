package com.inter.common;

public interface BasicInter {
	// 인터페이스 내부에는 추상메소드만 선언이 가능
//	public void test() { // 이렇게 선언 할수 없음 인터페이스에서는
//		System.out.println("하하하 메소드 선언하기");
//	
//	}

	public abstract void test();
	// 메소드 선언부는 무조건 추상메소드이기 때문에 public abstract 예약어는 생략이 가능하다.
	int calc(int a, int b); // 이거랑 같음 public abstract int calc(int a, int b)
	
	public static final int AGE = 0; // 이런식으로 고정값을 넣어줌
	String NAME = "홍길동";
	
	
	
	
}
