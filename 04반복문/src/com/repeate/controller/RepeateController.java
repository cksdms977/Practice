package com.repeate.controller;

import java.util.Scanner;

public class RepeateController {
	public void basicRepeat() {
		// 기본 for문 이용하기
		// 특정코드는 원하는 만큼 반복해서 실행하게 하는 명령어
		// for(초기식;조건식;증감식) { 반복할 코드를 작성 }
		// 초기식 : 변수선언, 반복한 횟수에 대해 저장하는 공간
		// 조건식 : 반복을 더 실행할지말지 결정하는 조건 (true 실행, false 중단)
		// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산 -> 조건식의 결과가 변경
		// 안녕하세요를 10번 출력하기
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		// 반갑습니다. 100개 출력
//		for (int i = 1; i <= 100; i++) {
//			System.out.println("반갑습니다.");
//		}
		
		// 1~10까지 수를 출력하기
//		for (int i = 1; i < 11; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("-----------");
//		// for문 {}내부에는 변수선언, 연산자, 조건문 다 사용이 가능
//		// {}내부에서 선언한 것들은 내부에서만 사용이 가능함.
//		// 5번 실행하는 for문 만들기
//		for (int i = 0; i < 5; i++) {
//			int temp = 10 + i;
//			if (temp % 2 == 0) {
//				System.out.print(temp);
//			}
//		}
		// System.out.println(temp); 외부에서는 실행할수 없다.
		
		// 1부터 100까지의 수를 출력하기
		// 1부터 100까지의 수에서 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		for (int i = 1; i <= 100; i++) {
			int su = i;
			if (su % 2 == 0) {
				System.out.println(su);
			}
		}
//		for (int i = 2; i <= 100; i+=2) { // 위의 결과와 같다
//				System.out.println(i);
			
		// 100~1까지 수 출력하기
		for (int i = 100; i < 0 ; i--) {
			System.out.print(i + " ");
		}
		int count = 100;
//		for (int i = 1; i <= 100; i++) { // 위의 식과 똑같이 출력한다.
//			System.out.println(count--);
//		}
		
		// 친구 5명의 이름을 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
//		String name = "";
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("친구이름 : " );
//			name += sc.next();			
//		}
//		System.out.println(name);

		// 숫자 4개를 입력받아 총합을 구하는 기능 구현하기
//		
//		int su = 0;
//		for (int i = 1; i <= 4; i++) {
//			System.out.print("숫자 입력 : ");
//			su += sc.nextInt();
//			}
//		System.out.println(su);
//	
//		
		
		
//		count = 0;
//		for (; count < 10; count++) {
//			System.out.println(count);
//		}
//	
//		for (;; count++) {
//			System.out.println(count);
//		}
		
		//String msg = "";
//		for (; !msg.equals("exit");) {
//				System.out.println("메세지입력 : ");
//				msg = sc.next();
//				System.out.println(msg);
		
		// 사용자에게 메세지를 입력받고 출력하는 기능
		// 사용자가 "끝" 이라는 메세지를 입력할때까지 입력받고 
		// 입력받은 내용 모두 출력하기 *단 끝메세지는 포함하지 않기!!
		
		String msg1 = "";
		sc.nextLine();
		String m = "";
		for (; !m.equals("끝");) {
			System.out.print("메세지 입력 : ");
			m =  sc.nextLine();
			if (!m.equals("끝")) {
				msg1 += m;
			}
		}; 
		System.out.println(msg1); 
	      
	
	}
		
	
	
	}
	
	
	
	
		
		
		
		
	

