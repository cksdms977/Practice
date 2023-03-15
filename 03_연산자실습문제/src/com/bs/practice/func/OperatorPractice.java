package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int su=sc.nextInt();
		String msg=su>0?"양수다":"양수가 아니다";
		System.out.println(msg);
		//한번에 처리하려면
		//System.out.println(su>0?"양수다":"양수가 아니다");
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int su=sc.nextInt();
		String msg=su>0?"양수다":su==0?"0이다":"음수다";
		System.out.println(msg);
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int su=sc.nextInt();
		String result=su%2==0?"짝수다":"홀수다";
		System.out.println(result);
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수 : " );
		int personCount=sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy=sc.nextInt();
		System.out.println("1인당 사탕 개수 : "+candy/personCount);
		System.out.println("남은 사탕 개수 : "+candy%personCount);
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년(숫자만) : ");
		int grade=sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNumber=sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number=sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender=sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double gradePoint=sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.\n",
				grade,classNumber,number,name,(gender=='M'?'남':'여'),gradePoint);		
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 : ");
		int age=sc.nextInt();
		String result=age<=13?"어린이":13<age&&age<=19?"청소년":"성인";
		System.out.println(result);
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		int kor=sc.nextInt();
		System.out.print("영어 : ");
		int eng=sc.nextInt();
		System.out.print("수학 : ");
		int math=sc.nextInt();
		int total=(kor+eng+math);
		double avg=(kor+eng+math)/3.0;
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);
		String result=kor>=40&&eng>=40&&math>=40&&avg>=60?"합격":"불합격";
		System.out.println(result);
		//한번에 출력
		//System.out.println(kor>=40&&eng>=40&&math>=40&&avg>60?"합격":"불합격");
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		String personNum=sc.nextLine();
		String result=personNum.charAt(7)=='1'?"남자":"여자";
		System.out.println(result);
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1 : ");
		int su=sc.nextInt();
		System.out.print("정수2 : ");
		int su2=sc.nextInt();
		System.out.print("입력 : ");
		int inputSu=sc.nextInt();
		
		System.out.println(inputSu<=su||inputSu>su2);
		
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력1 : ");
		int su=sc.nextInt();
		System.out.print("입력2 : ");
		int su2=sc.nextInt();
		System.out.print("입력3 : ");
		int su3=sc.nextInt();
		
		System.out.println(su==su2&&su2==su3&&su3==su);
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int salaryA=sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int salaryB=sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int salaryC=sc.nextInt();
		
		double totalA=salaryA+(salaryA*0.4);
		double totalB=salaryB;
		double totalC=salaryC+(salaryC*0.15);

		System.out.println("A사원 연봉/연봉+a : "+salaryA+"/"+totalA);
		System.out.println(totalA>3000?"3000이상":"3000미만");
		System.out.println("B사원 연봉/연봉+a : "+salaryB+"/"+totalB);
		System.out.println(totalB>3000?"3000이상":"3000미만");
		System.out.println("C사원 연봉/연봉+a : "+salaryC+"/"+totalC);
		System.out.println(totalC>3000?"3000이상":"3000미만");
		
		
				
	}
	
}
