package com.bs.mod.vo;


public class Employee {
//	클래스 생성 실습
//	1. 사원클래스를 생성하여 사용자에게 입력받은 데이터로 생성하기
//	  - 이름, 부서명, 급여, 전화번호, 인센티브(0.00) 
//	  - 외부에서 수정할 수 있게 선언
//	  - 5명의 사원을 사용자가 입력한 값으로 생성하여 출력할 것
//	  - 생성 후 입력 순으로 데이터 출력할 것
	
	private String name;
	private String department;
	private int salary;
	private String phonenumber;
	private double incentive;
	
	
	public Employee() {}
	
	public Employee(String name, String department, int salary, String phonenumber, double incentive) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.phonenumber = phonenumber;
		this.incentive = incentive;
		
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public double getIncentive() {
		return incentive;
	}


	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public String infoEmployee() {
		return this.name + " " + this.department + " " + this.salary + " " + this.phonenumber + " " + this.incentive;
	}

	
	
	

}
