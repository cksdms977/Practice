package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practiceProblem3() {
	 // 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 
	 //	사각형의 면적과 둘레를 계산하여 출력하세요. 
	 // 계산 공식 ) 면적 : 가로 * 세로 
	 // 둘레 : (가로 + 세로) * 2
		Scanner sc = new Scanner(System.in);
		
		double transverse;
		double length;
		
		System.out.print("가로를 입력하세요 : ");
		transverse = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		length = sc.nextDouble();
		
		double area = transverse * length;
		double circumference = (transverse + length) * 2;
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + circumference);
		
		
	}

}
