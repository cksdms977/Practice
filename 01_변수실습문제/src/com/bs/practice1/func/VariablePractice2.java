package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void print() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int su=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int su2=sc.nextInt();
		
		System.out.println("더하기 결과 : "+(su+su2));
		System.out.println("빼기 결과 : "+(su-su2));
		System.out.println("곱하기 결과 : "+(su*su2));
		System.out.println("나누기 결과 : "+(su/su2));//잘못된값이 나옴.
		//System.out.println("나누기 결과 : "+((double)su/su2));//정확한값은 형변환을 해야함.
	}
}
