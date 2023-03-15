package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su=sc.nextInt();
		if(su>0) {
			for(int i=1;i<=su;i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요");
		}
		System.out.println();
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		int su=-1;
		while(su<=0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			su=sc.nextInt();
			if(su<=0) {
				System.out.println("1이상의 숫자를 입력하세요");				
			}
		}
		for(int i=1;i<=su;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su=sc.nextInt();
		if(su>0) {
			for(int i=su;i>0;i--) {
				System.out.print(i+" ");
			}
			//while을 이용하는 방법
			while(su>0) {
				System.out.print(su--+" ");
			}
		}else {
			System.out.println("1이상의 수를 입력해주세요");
		}
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		int su=-1;
		while(su<=0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			su=sc.nextInt();
			if(su<=0) {
				System.out.println("1이상의 수를 입력해주세요");
			}
		}
		for(int i=su;i>0;i--) {
			System.out.print(i+" ");
		}
		//while을 이용하는 방법
		while(su>0) {
			System.out.print(su--+" ");
		}		
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수하나 입력하세요 : ");
		int su=sc.nextInt();
		int sum=0;
		for(int i=1;i<=su;i++) {
			System.out.print(i+" + ");
			sum+=i;
		}
		System.out.println("= "+sum);
		System.out.println();
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int su=sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int su1=sc.nextInt();
		if(su<1||su1<1) {
			System.out.println("1이상의 수를 입력해 주세요");
		}else {
			for(int i=(su<su1?su:su1);i<=(su<su1?su1:su);i++) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		int su=-1;
		int su1=-1;
		while(su<1||su1<1) {
			System.out.print("첫번째 숫자 : ");
			su=sc.nextInt();
			System.out.print("두번째 숫자 : ");
			su1=sc.nextInt();
			if(su<1||su1<1) {
				System.out.println("1이상의 수를 입력하세요.");
			}
		}
		if(su<1||su1<1) {
			System.out.println("1이상의 수를 입력해 주세요");
		}else {
			for(int i=(su<su1?su:su1);i<=(su<su1?su1:su);i++) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan=sc.nextInt();
		System.out.println("===== "+dan+"단 =====");
		for(int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan=sc.nextInt();
		if(0<dan&&dan<9) {
			for(int i=dan;i<10;i++) {
				System.out.println("===== "+i+"단 =====");
				for(int j=1;j<10;j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		}else {
			System.out.println("1이상 9이하의 숫자를 입력하세요");
		}
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		int dan=-1;
		while(!(dan>0&&dan<10)) {
			System.out.print("숫자 : ");
			dan=sc.nextInt();
			if(dan>0||dan<10) {
				System.out.println("1이상 9이하의 숫자를 입력하세요");
			}
		}
		for(int i=dan;i<10;i++) {
			System.out.println("===== "+i+"단 =====");
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start=sc.nextInt();
		System.out.print("공차 : ");
		int gap=sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.print((i==0?start:(start+=gap))+" ");
		}
	}
	public void practice12() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+,-,*,/,%) : ");
			String op=sc.next();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int su=sc.nextInt();
			System.out.print("정수2 : ");
			int su1=sc.nextInt();
			switch(op) {
				case "+" : System.out.println(su+" + "+su1+" = "+(su+su1));break;
				case "-" : System.out.println(su+" - "+su1+" = "+(su-su1));break;
				case "*" : System.out.println(su+" * "+su1+" = "+(su*su1));break;
				case "/" : System.out.println(su1==0?"0으로 나눌수 없습니다. 다시 입력해주세요"
							:su+" / "+su1+" = "+(su/(double)su1));break;
				case "%" : System.out.println(su+" % "+su1+" = "+(su%su1));break;
				default : System.out.println("없는 연산자입니다. 다시 입력해주세요");break;
			}
		}
	}
	public void practice13() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++) {
			for(int j=0;j<su-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
