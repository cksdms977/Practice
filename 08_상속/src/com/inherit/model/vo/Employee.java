package com.inherit.model.vo;

public class Employee extends Person {
	// 이름, 나이 , 성별, 전화번호, 주소
	// 부서, 연봉, 연차
	
	private String department;
	private int salary;
	private int yearMinus;
	
	public Employee() {
	}

	public Employee(String department, int salary, int yearMinus) {
		super();
		this.department = department;
		this.salary = salary;
		this.yearMinus = yearMinus;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	int getYearMinus() {
		return yearMinus;
	}

	void setYearMinus(int yearMinus) {
		this.yearMinus = yearMinus;
	}
	
	public String infoEmployee() {
		return super.infoPerson() + " " + department + " " + salary + " " + yearMinus;
		
	}
	
	@Override
	public String info() {
		return infoEmployee();
	}
	

	
}
