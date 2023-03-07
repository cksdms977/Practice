package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	// 이름, 성별, 나이, 키를 사용자에게 
	// 입력 받아 각각의 값을 변수에 담고 출력하세요
		public void practiceProblem() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("성별을 입력하세요(남/여) : ");
			char gender = sc.next().charAt(0);
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();
			System.out.print("키를 입력하세요(cm) : ");
			double height = sc.nextDouble();
			
			System.out.println("name : " + name + " gender : " + gender + " age : " + age + " height : " + height);
			
		
		
		} 
	
	

}
