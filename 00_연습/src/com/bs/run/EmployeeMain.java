package com.bs.run;


import com.bs.mod.vo.Employee;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
		
//		1. 사원클래스를 생성하여 사용자에게 입력받은 데이터로 생성하기
//		  - 이름, 부서명, 급여, 전화번호, 인센티브(0.00) 
//		  - 외부에서 수정할 수 있게 선언
//		  - 5명의 사원을 사용자가 입력한 값으로 생성하여 출력할 것
//		  - 생성 후 입력 순으로 데이터 출력할 것
//		
		Employee employee[] = new Employee[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < employee.length; i++) {
		employee[i] = new Employee();
		
		System.out.println("==== 사원정보 입력 ====");
		System.out.print("사원 이름 : ");
		employee[i].setName(sc.next());
		System.out.print("사원 부서명 : ");
		employee[i].setDepartment(sc.nextLine());
		sc.nextLine();
		System.out.print("사원 급여 : ");
		employee[i].setSalary(sc.nextInt());
		System.out.print("사원 전화번호 : ");
		employee[i].setPhonenumber(sc.nextLine());
		sc.nextLine();
		System.out.print("사원 인센티브 : ");
		employee[i].setIncentive(sc.nextDouble());
		
		}

		for (Employee employee2 : employee) {
			System.out.println(employee2.getName() + " " + employee2.getDepartment() + " " + employee2.getSalary() + " " + employee2.getPhonenumber() + " " + employee2.getIncentive());
		}
	
	}
	
}
