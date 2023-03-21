package com.inter.common;

public interface ParentInterface {
	
	int add(int su, int su2);
	
	String addStr(String str, String str1);
	
	default public void test() { // 이렇게 추가적으로 발전사항이 있어서 넣으려면 이렇게 선언해야함.
		System.out.println("default 메소드 추가");
	}
	
	
}	
