package com.bs.variable;

import java.util.Scanner;

//학생정보를 입력(입력나오면 무조건 Scanner사용하기)받고 출력하는 기능 구현하기
	// 이름, 나이, 성별(남/여), 학년, 반, 번호, 키, 주소, 이메일입력받고 
	// 입력받은 내용을 출력하기
	// com.bs.variavle.StudentInfo클래스를 생성해서 구현할것.
	// 1. 입력받은 값을 출력 바로바로 출력해보기
	// 2. 한번에 출력하기
	// 출력 결과 예시 : 유병승 19 남 1 3 3 180.5 teacherdev09@gmail.com
	
public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println(name);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);

		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.println(grade);
		
		System.out.print("반 : "); 
		int calss = sc.nextInt();
		System.out.println(calss);
		
		System.out.print("번호 : "); 
		int numer = sc.nextInt();
		System.out.println(numer);
		
		System.out.print("키 : "); 
		double height = sc.nextDouble();
		System.out.println(height);
		
		sc.nextLine(); // 비워주기 !!!
	
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.print("이메일 : "); 
		String email = sc.nextLine();
		System.out.println(email);
		
		System.out.print(name +  age +  gender + grade + calss + numer + height + address + email);
		
		
	}

}
