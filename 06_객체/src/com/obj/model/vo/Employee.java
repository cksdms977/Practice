package com.obj.model.vo;

import com.obj.run.*;

public class Employee {
	// 필드선언
	private static int  count;
	private int empNo;
	private String name;
	private String department;
	private int salary;
	private double bonus;
	
	{
		empNo = ++count;// 이렇게 실행하면 초기화블록은 new라는 empno가 만들어질때마다, 계속출력되어야한다.
				// 초기화블록 먼저 생성되면서 그다음 밑에 있는 employee가 생성된다.
				// static 은 setter/getter 필요없이 초기화블록을 이용해서 수정할수 있다.
	}
	
	
	//생성자
	public Employee() {}
	
	//메개변수 있는 생성자
	public Employee(String name, String department, int salary, double bonus) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.bonus = bonus;
		
	}
	
	public String infoEmp() {
		return this.empNo + " " + this.name + 
				" " + this.department+ " " 
				+ this.salary + " " + this.bonus;
	}
	
	
	// 필드를 조작할 수 있는 setter/getter선언하기
	// name필드
	public void setName(String name) {
		if (name.length() >= 2) {			
		
		this.name = name;
		}
	} 
	// getter만들기
	public String getName() {
		return this.name;
		
	}
	public int getEmpNo() {
		return this.empNo;
	}
	
	// department setter/getter 만들기
	public void setDepartment(String department) {
		this.department = department;
		
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
		
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getBonus() {
		return this.bonus;
		
	}
	
//	public void makeEmployee(Employee e, String name, String department, int salary, double bonus) {
//		e.setName(name);
//		e.setBonus(bonus);
//		e.setDepartment(department);
//		e.setSalary(salary);
//	}
//	
//	public Employee makeEmployee2(String name, String departement, int salary, double bonus) {
//		Employee e = new Employee(); // 생성자 만들어준다.
//		e.setName(name);
//		e.setDepartment(departement);
//		e.setSalary(salary);
//		e.setBonus(bonus);
//		return e;
//	}
	
}
