package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	// 키보드로 정수 두 개를 입력 받아 
	// 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요
	public void practiceProblem2() {
		Scanner sc = new Scanner(System.in);
		
		int Num;
		int Num2;
		
		System.out.print("첫번째 정수입력 : ");
		Num = sc.nextInt();
		System.out.print("두번째 정수입력 : ");
		Num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (Num + Num2));
		System.out.println("뺀 결과 : " + (Num - Num2));
		System.out.println("곱하기 결과 : " + (Num * Num2));
		System.out.println("나누기 결과 : " + (Num / Num2));
	}
	
	}
	
