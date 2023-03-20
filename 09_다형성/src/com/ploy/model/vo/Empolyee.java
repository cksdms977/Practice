package com.ploy.model.vo;



public class Empolyee extends Person{

	private String department;
	private String job;
	
	public Empolyee() {
		// TODO Auto-generated constructor stub
	}

//	public Empolyee(String department, String job) {
//		super();
//		this.department = department;
//		this.job = job;
//	}

	String getDepartment() {
		return department;
	}

	
	public Empolyee(String name, int age, String department, String job) {
	super(name, age);
	this.department = department;
	this.job = job;
}

	void setDepartment(String department) {
		this.department = department;
	}

	String getJob() {
		return job;
	}

	void setJob(String job) {
		this.job = job;
	}
	
	
}
