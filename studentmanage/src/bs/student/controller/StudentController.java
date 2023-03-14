package bs.student.controller;

import bs.student.dto.Student;
import bs.student.view.MainView;
import bs.student.dao.*;
import bs.student.run.*;

public class StudentController {
	
	
	private StudentDao dao = new StudentDao(); // 이렇게 선언해놓으면 멤버변수로 학생등록하는 서비스 그리고 전체정보 가져오는 곳에서도 둘다 사용할수 있다.
		
	// 프로그램을 시작하는 기능
	public void startProgram() {
		new MainView().mainMenu();
		
	}
	
	public void insertStudent() {
		// 학생을 등록하는 서비스
		// 1. 사용자로 부터 저장할 학생에 대한 정보를 입력력받는다.
		Student s = new MainView().insertStudentView(); // 여기는 호출하면서 값을 받아야 한다.
		//2 . studentdao 에 받은 학생을 저장하기 
		boolean result = dao.insertStudent(s);
		//3. 입력한 결과에 따라 사용자에게 메세지를 출력
		String msg = result ? "학생등록 성공 :)":"학생등록 실패 :(";
		new MainView().printmsg(msg);
		
	}
	
	// 전체학생을 조회하는 서비스
	public void searchAll() {
		// 1. StudentDao에 저장된 학생정보를 가져오기 
		// s1, s2, s3, s4에 저장된 정보를 가져오는 것
		String infoStudent = dao.infoStudentAll();
		// //2. 가져온 정보를 화면에 출력해준다.
		new MainView().printStudent(infoStudent.equals("") ? "저장된 학생이 없습니다." : infoStudent);
		// 밑에 있는 값과 같다.
//		String data;
//		if (infoStudent.equals("")) {
//			data = "저장된 학생이 없습니다.";
//		}else {
//			data = infoStudent;
//		}
//		new MainView().printStudent(data);
//	}
	
}

}
