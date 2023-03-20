package com.inherit.model.vo;

public class OverrideChild extends OverrideParent {
	// 기능 제공용으로 일단 만들어 놈
	// override는 메소드선언부를 부모에 선언된 메소드와 동일하게 선언해야한다.
//	public void printMsg() {
//		System.out.println("Override Child");
//		
//	}
	// 메소드 오버라이드를 할대는 어노테이션으로 표시해서 관리를 해줌.
	// 어노테이션 : @어노테이션명
	public void printMsg(String msg) {
		System.out.println("어노테이션으로 오버라이드");
	}
	
//	public void printMsg() {
//		System.out.println("자식클래스 final을 사용못함");
//	}
	
	
	
}
