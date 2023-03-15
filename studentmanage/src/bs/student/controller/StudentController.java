package bs.student.controller;

import bs.student.dto.Student;
import bs.student.view.MainView;
import bs.student.dao.*;
import bs.student.run.*;

public class StudentController {
	// 싱글톤패턴으로 객체 생성하기
	private static StudentController controller;
	
//	private StudentDao dao = new StudentDao(); // 이렇게 선언해놓으면 멤버변수로 학생등록하는 서비스 그리고 전체정보 가져오는 곳에서도 둘다 사용할수 있다.
	
	//private MainView view = new MainView(); // 이렇게 생성하면 MainView로 가보면 맨위에 StudentController s 라고 또 생성해놓았기 때문에 서로 둘이 계속 선언하게 되면서 반복하게 된다.
	private MainView view = MainView.getMainView();
	
	private StudentController() {}
	
	public static StudentController getStudentController() {
		if (controller == null) controller = new StudentController(); 
			return controller;
		
	}
	
	
	// 프로그램을 시작하는 기능
	public void startProgram() {
		MainView.getMainView().mainMenu();
		
	}
	
	public void insertStudent() {
		// 학생을 등록하는 서비스
		// 1. 사용자로 부터 저장할 학생에 대한 정보를 입력력받는다.
		Student s = view.insertStudentView(); // 여기는 호출하면서 값을 받아야 한다.
		//2 . studentdao 에 받은 학생을 저장하기 
		boolean result = StudentDao.getStudentDao().insertStudent(s);
		//3. 입력한 결과에 따라 사용자에게 메세지를 출력
		String msg = result ? "학생등록 성공 :)":"학생등록 실패 :(";
		new MainView().printmsg(msg);
		
	}
	
	// 전체학생을 조회하는 서비스
	public void searchAll() {
		// 1. StudentDao에 저장된 학생정보를 가져오기 
		// s1, s2, s3, s4에 저장된 정보를 가져오는 것
		String infoStudent = StudentDao.getStudentDao().infoStudentAll();
		// //2. 가져온 정보를 화면에 출력해준다.
		view.printStudent(infoStudent.equals(" ") ? "저장된 학생이 없습니다." : infoStudent);
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
	
	// 사용자가 입력한 이름으로 학생을 조회하는 서비스 기능
	public void searchByName() {
		//1. 사용자가 이름을 입력할 수 있게 화면을 출력해줌.
		String name = view.inputName();
		String result = StudentDao.getStudentDao().searchByName(name);
		
		//2. 입력한 이름을 가져와 저장소(Dao)에 있는 데이터와 비교할 결과를 가져옴
		//3. 결과를 사용자에게 출력해줌.
		new MainView().printStudent(result);
		
	}
	
	
	// 지정한 학생의 학년, 전공, 주소를 수정하는 서비스
	
	public void updateStudent() {
		
		searchAll(); // 만약 학생수정하기 전에 전체학생들의 학번이랑 모든정보를 보여주기 위해 그냥 이렇게 searchAll을 해준다.
		// 1. 사용자에게 수정할 학생, 수정할 학년, 수정할 전공, 수정할 주소를 입력받음
		Student s = view.updateStudentView();
		
		//2. 저장된 학생 중 수정할 학생을 찾아 s에 저장된 데이터로 수정
		boolean result = StudentDao.getStudentDao().updateStudent(s);
		view.printmsg(result ? s.getStudentNo() +  "학생수정 완료 : )" : s.getStudentNo() +  "학생수정실패 : (" );
		
		 
	}
	
	

}
