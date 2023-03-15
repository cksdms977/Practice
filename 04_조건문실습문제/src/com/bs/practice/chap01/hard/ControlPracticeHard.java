package com.bs.practice.chap01.hard;

import java.util.Scanner;

public class ControlPracticeHard {

	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int intPw=sc.nextInt();
		String str="";
		if(1000<=intPw&&intPw<=9999) {
			int one=intPw%10;
			int two=(intPw%100-(intPw%10))/10;
			int three=(intPw%1000-(intPw%100))/100;
			int four=(intPw%10000-(intPw%1000))/1000;
			if(one==two||one==three||one==four||two==three||two==four||three==four) {
				str="중복값이 있음";
			}else {
				str="성공";
			}
		}else {
			str="자리수 안맞음";
		}
		System.out.println(str);
		
		//문자열로 풀기
//		System.out.print("비밀번호 입력(1000~9999) : ");
//		String pw=sc.next();
//		if(pw.length()!=4) {
//			System.out.println("자리수 안맞음.");
//		}else {
//			boolean flag=false;
//			check:
//			for(int i=0;i<pw.length();i++) {
//				for(int j=0;j<pw.length();j++) {
//					if(i!=j&&pw.charAt(i)==pw.charAt(j)) {
//						flag=true;
//						break check;
//					}
//				}
//			}
//			System.out.println(flag?"중복값 있음":"성공");
//			
//		}
	}
	
}
