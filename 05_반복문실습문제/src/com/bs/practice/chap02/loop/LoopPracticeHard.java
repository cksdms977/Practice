package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPracticeHard {

	public void practice15() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 : ");
		int su=sc.nextInt();
		if(su<=1) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			int count=0;
			for(int i=2;i<=su;i++) {
				if(su%i==0) {
					count++;
				}
			}
			System.out.println(count>1?"소수가 아닙니다":"소수입니다.");
		}
	}
	
	public void practice16() {
		Scanner sc=new Scanner(System.in);
		int su=1;
		while(su<=1) {
			System.out.print("숫자 : ");
			su=sc.nextInt();
			if(su<=1) {
				System.out.println("잘못입력하셨습니다.");
			}
		}		
		int count=0;
		for(int i=2;i<=su;i++) {
			if(su%i==0) {
				count++;
			}
		}
		System.out.println(count>1?"소수가 아닙니다":"소수입니다.");
	}
	public void practice17() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 : ");
		int su=sc.nextInt();
		if(su<=1) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			int total=0;
			for(int i=2;i<=su;i++) {
				int count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.print(i+" ");
					total++;
				}
			}
			System.out.println();
			System.out.println("2부터 "+su+"까지 소수의 개수는 "+total+"개 입니다.");
		}
	}
	public void practice18() {
		Scanner sc=new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int su=sc.nextInt();
		int count=0;
		for(int i=1;i<=su;i++) {
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
			}
			if(i%2==0&&i%3==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : "+count);
	}
	
	public void practice19() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++) {
			for(int j=1;j<=su;j++) {
				if(su-i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void practice20() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		int size=0;
		for(int i=0;i<su*2-1;i++) {
			size=i<su?i:size-1;
			for(int j=0;j<=size;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
	public void practice21() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++) {
			for(int j=0;j<su*2-1;j++) {
				if(su-(i+1)<=j&&j<su+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void practice22() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++) {
			for(int j=0;j<su;j++) {
				if(i==0||i==su-1) {
					System.out.print("*");
				}else if(j==0||j==su-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
