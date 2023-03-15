package bs.student.dao;

import java.util.jar.Attributes.Name;

import bs.student.dto.*;

public class StudentDao {
	
	private static StudentDao dao;
	public static StudentDao getStudentDao() {
		if (dao == null)  dao = new StudentDao(); 
			return dao;
		
	}
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
	private Student s6;
	
	private StudentDao() {}
	
	// 학생을 저장소에 저장하는 기능
	public boolean insertStudent(Student s) { // s1 s2 s3 s4 중에서 하나에 저장을 해야함
											// 그래서 매개변수를 넣어준다.
		
		boolean result = true; // 
		
	if (s1 == null) {
		s1 = s; // s1은 비었다.
	}else if (s2 == null) {
		s2 = s;
	}else if (s3 == null) {
		s3 = s;
	}else if (s4 == null) {
		s4 = s;
	}else {
		//입력실패
		//result = false; 밑에같이 써도 됨
		return false;
	
	}	  {
		
	}//return result; 밑에랑 똑같음
	 return true;
	
		
	}
	
	//저장된 학생들을 전체 정보를 조회하기 위해 제공해 오는 기능
	public String infoStudentAll() { // 여기서 매게변수는 받을필요가 없다 왜냐하면 받아올 변수들이 없고, 저장된 s1 s2 s3 s4의 학생정보를 가져오려고 하기 위해
		// s1, s2, s3, s4에 저장된 학생정보를 종합해서
		// 1. 각 s들에 저장이 되어있는지 확인해야함 -> sn != null이면 저장되어있는거임 
		
		String totalStudent = " ";

		if (s1 != null) {
			totalStudent += s1.infoStudent() + "\n";
		}
		
		if (s2 != null) {
			totalStudent += s2.infoStudent() + "\n";
		}
		
		if (s3 != null) {
			totalStudent += s3.infoStudent() + "\n";
		}
		if (s4 != null) {
			totalStudent += s4.infoStudent() + "\n";
		}
		return totalStudent;
		
		
	}	
	
	public String searchByName(String name) {
		String result = "";
		if (s1!= null && s1.getName().equals(name)) { // null포인트 오류가 뜨면 무조건 . 앞에 있는 변수값이 문제가 있을 가능성이 있음
			result += s1.infoStudent() + "\n";
		}
		if (s2!= null && s2.getName().equals(name)) {
			result += s2.infoStudent() + "\n";
		}
		if (s3!= null && s3.getName().equals(name)) {
			result += s3.infoStudent() + "\n";
		}
		if (s4!= null && s4.getName().equals(name)) {
			result += s4.infoStudent() + "\n";
		}
		return result;
	}
	
	public boolean updateStudent(Student s) {
		if (s1 != null && s1.getStudentNo().equals(s.getStudentNo())) {
			s1.setGrade(s.getGrade());
			s1.setMajor(s.getMajor());
			s1.setAddress(s.getAddress());
		
		}else if (s2 != null && s2.getStudentNo().equals(s.getStudentNo())) {
			s2.setGrade(s.getGrade());
			s2.setMajor(s.getMajor());
			s2.setAddress(s.getAddress());
		}else if (s3 != null && s3.getStudentNo().equals(s.getStudentNo())) {
			s3.setGrade(s.getGrade());
			s3.setMajor(s.getMajor());
			s3.setAddress(s.getAddress());
		}else if (s4 != null && s4.getStudentNo().equals(s.getStudentNo())) {
			s4.setGrade(s.getGrade());
			s4.setMajor(s.getMajor());
			s4.setAddress(s.getAddress());
		}else {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
}
