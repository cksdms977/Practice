package bs.student.view;

import java.util.*;

import bs.student.controller.StudentController;
import bs.student.dto.Student;

// 이 클래스는 사용자에게 보여주는 화면을 제공하는 역할을 하는 클래스
public class MainView {
	
	//Scanner sc = new Scanner(System.in); // 여기에다 선언할수 있다/ but 왠만하면 버퍼가 생길수도 있어 메소드 안에다 쓰는것을 권함.
	
	// 주 메뉴 화면을 출력해주는 기능
	public void  mainMenu() {
		Scanner sc = new Scanner(System.in);
		StudentController s = new StudentController();
		
		while (true) {
		System.out.println("====== 학생관리 프로그램 ======");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생수정(학년, 전공, 주소)");
		System.out.println("3. 학생삭제");
		System.out.println("4. 전체조회");
		System.out.println("5. 이름으로 조회");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1 : s.insertStudent(); break;
		case 2 : System.out.println("학생수정 개발중..."); break;
		case 3 : System.out.println("학생삭제 개발중..."); break;
		case 4 : s.searchAll(); break;
		case 5 : System.out.println("이름으로 조회 개발중..."); break;
		case 0 : System.out.println("프로그램을 종료합니다."); return;
		
			}
		}
		
	}
	// 필요한 학생정보를 입력받는 화면을 출력해주는 기능
	public Student insertStudentView() { // 원래는 반환해줘야 하는 데, 타입이 다양하기때문에(int, String...) 
										// 이걸 저장해주는 데이터를 클래스를 만들어준다.
		System.out.println("==== 학생등록 화면 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		System.out.print("학생번호 : ");
		String studentNo = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		System.out.print("주소 :");
		String address = sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Student s = new Student(name, studentNo, major, 
				grade, address, gender); // Student 클래스(저장용)에 있는 것을 가져올수 있다.
		return s;
	}
	
	public void printmsg(String data) { // data는 그냥 임의로 설정해준거 studentcontroller에 msg에 등록성공 실패 출력하기 위해 설정해준거
		System.out.println("===== 시스템 메세지 =====");
		System.out.println(data);
		System.out.println("======================");
	}
	

	public void printStudent(String infoStudent) {
		System.out.println("==== 저장된 학생정보 ====");
		System.out.println(infoStudent);
		System.out.println("====================");
	}
	
	
	
	
}
