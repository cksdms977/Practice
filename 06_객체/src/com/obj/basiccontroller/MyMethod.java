package com.obj.basiccontroller;

import java.util.*;

import com.obj.model.vo.Employee;




public class MyMethod {
	
	public MyMethod() {}
	
	
	public void luch() {
		System.out.println("월요일 점심 맛있게 먹어요");
		// 월요일 점심 맛있게 먹어요 출력하는 메소드 작성하기
	}
	
	public int puls() {
	//숫자르 1~5까지 더한수를 반환하는 메소드 작성하기
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}	
		 return sum;
	}
	
	//사용자한테 5번 메세지를 입력받고 입력받은 메세지를 반환하는 메소드 만들기
	//public String msg() {
	public String msg() {	
	
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "메세지 입력");
			msg += sc.nextLine();
			
		}
		return msg;
	} 
	public void twonumber(int su, int su2, char op) {
		// 정수2개 연산자 한개를 전달받아 계산하는 계산결과를 출력하는 메소드 만들기.
		switch (op) {
		case '+' : System.out.println("" + su + op + su2 + "=" + (su+su2));break;
		case '-' : System.out.println("" + su + op + su2 + "=" + (su-su2));break;
		case '/' : System.out.println("" + su + op + su2 + "=" + (su/su2));break;
		case '*' : System.out.println("" + su + op + su2 + "=" + (su*su2));break;

		}
	}
		
		public double calculator(int su, int su2, char op) {
			double result = 0;
					switch (op) {
					case '+' : result = su + su2; break;
					case '-' : result = su - su2;break;
					case '/' : result = su / (double)su2;break;
					case '*' : result = su*su2;break;

		}
		return result;
		
		}
	
	

		
		
	public boolean msg2(String str) {
		boolean flag = false;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					//return true;
					flag =true ; 
					break;
				}
				
			}
		}
		return flag;
		
	}
	

	// Employee 객체를 생성해주는 메소드 만들기(2가지 방법 처음 반환형없는 메소드, 반환형 있는메소드)
	
	public void makeEmployee(Employee e, String name, String department, int salary, double bonus) {
		e.setName(name);
		e.setBonus(bonus);
		e.setDepartment(department);
		e.setSalary(salary);
	}
	
	public Employee makeEmployee2(String name, String departement, int salary, double bonus) {
		Employee e = new Employee(); // 생성자 만들어준다.
		e.setName(name);
		e.setDepartment(departement);
		e.setSalary(salary);
		e.setBonus(bonus);
		return e;
	}
	
	
	
}

	
	