package com.bs.variable;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		
		// 사용자가 키보드로 입력한 값을 가져오기
		// java.util.Scanner클래스를 이용한다.
		
	// 1. Scanner클래스를 import해주기 -> import java.until.Scanner;
		
	// 2. Scanner클래스를 생성해주기 -> Scanner sc = new Scanner (System.in);
	Scanner sc = new Scanner(System.in);
	
	// 3. Scanner클래스가 제공하는 기능을 이용해서 데이터를 받아오기
	// 자료형에 따라 기능제공 
	// 정수형 : nextInt()
	// 실수형 : nextDouble()
	// 문자열 : nest(), or nextLine()
	// Scanner로 입력을 하기 전에 입력값에 대한 정보를 출력 해줘야 한다.
	System.out.print("나이 : ");
	int age = sc.nextInt(); // 키보드로 입력한 값을 가져올수 있음
	System.out.println(age); // 여기부분은 next안비워져도 됨
	
	System.out.print("당신의 이름은 : ");
	String name = sc.next(); // 띄어쓰기 없는것은 next쓰면 됨 입력한 문자열의 띄어쓰기를 기준으로 값을 가져옴
	System.out.println("입력한 이름 : " + name);
	sc.nextLine(); // 버퍼를 비워주는 역할 (next 사이에 반드시 nextLine은 무조건 비워주기)   
	System.out.print("당신의 주소는 : ");
	String address = sc.nextLine(); // 띄어쓰기 있는문자열은 nextLine 쓰기 입력한 문자열의 개행(흔이 말하는 enter쳐서 밑으로 오는것)을 기준으로 값을 가져옴 *단 위에 라인에서 nextLine을 한번써줘서 비워져야 한다.
	System.out.println(address); // -> 안그러면 enter값이 계속 남아 있어서 출력을 넘어가지 않음 
	
	
	System.out.print("키 : ");
	double height = sc.nextDouble();
	System.out.println("입력키 : " + height);
	
	// char 타입 입력받기
	// 성적등급, 성별 
	System.out.print("성별(M/F) : ");
	char gender = sc.next().charAt(0); //
	System.out.println("입력한 성별 : " + gender);
	
	
	// 학생정보를 입력받고 출력하는 기능 구현하기
	// 이름, 나이, 성별(남/여), 학년, 반, 번호, 키, 주소, 이메일입력받고 
	// 입력받은 내용을 출력하기
	// com.bs.variavle.StudentInfo클래스를 생성해서 구현할것.
	// 1. 입력받은 값을 출력 바로바로 출력해보기
	// 2. 한번에 출력하기
	// 출력 결과 예시 : 유병승 19 남 1 3 3 180.5 teacherdev09@gmail.com
	
	
	
	
	}
}
