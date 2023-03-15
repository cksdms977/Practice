package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void print() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str=sc.nextLine();
		System.out.println("첫번째 문자열 : "+str.charAt(0));
		System.out.println("두번째 문자열 : "+str.charAt(1));
		System.out.println("세번째 문자열 : "+str.charAt(2));
		
	}
}
