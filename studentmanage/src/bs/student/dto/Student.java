package bs.student.dto;

import java.text.SimpleDateFormat;

public class Student {
	private static int count;// 학번을 생성할때마다 자동으로 생성하도록 만드는 기능
	
	private String name;
	private String studentNo;
	private String major;
	private int grade;
	private String address;
	private char gender;
	
	
	{
		// 학번을 생성할때마다 자동으로 생성하도록 만드는 기능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		studentNo = sdf.format(System.currentTimeMillis()) + "_" + (++count); 
		
		
	}
	
	
	
	public Student() {}
	
	public Student(String name, //String studentNo, 
			String major, int grade, String address, char gender) {
		
		this.name = name;
		//this.studentNo = studentNo;
		this.major = major;
		this.address = address;
		this.grade = grade;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo=studentNo;
	}
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String infoStudent() {
		return this.studentNo+" "+this.name
				+" "+this.major+" "+this.grade
				+" "+this.address+" "+this.gender;
	}
	
	
		
	
		
}
