package com.obj.run;

import com.obj.model.vo.InitblockTest;

//2. 초기화 블럭을 이용해서 초기화 할수 있다.
		// 인스턴스 초기화블록 -> 클래스를 생성(객체화)할때마다 실행
		// static 초기화블록 -> 최초 생성할때 한번만 실행!!
public class InitMain {
	public static void main(String[] args) {
		InitblockTest ibt = new InitblockTest();
		
		System.out.println(ibt.test);
		System.out.println(ibt.testnum);
		
		for (int i = 0; i < 5; i++) {
			InitblockTest t = new  InitblockTest();
			System.out.println(t.test);
		
		}
		
	}

}
