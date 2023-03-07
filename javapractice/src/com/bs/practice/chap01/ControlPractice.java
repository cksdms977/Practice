package com.bs.practice.chap01;
import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		System.out.println("1. 입력 ");
		System.out.println("2. 수정 ");
		System.out.println("3. 조회 ");
		System.out.println("4. 삭제 ");
		System.out.println("7. 종료 ");
		System.out.print("메뉴 번호를 입력하세요 : ");
		menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if (menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if (menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if (menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if (menu == 7) {
			System.out.println("프로그램을 종료합니다.");
		}
		
		}
		
	public void practice2() {
//		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int su = sc.nextInt();
		
		if (su > 0 && su % 2 == 0) {
			System.out.println("짝수다.");
		}else if (su <= 0) {
			System.out.println("양수만 입력해주세요.");
		}else {
			System.out.println("홀수다.");
		}
		
	}
	
	public void practice3() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		double language = sc.nextDouble();
		System.out.print("수학점수 : ");
		double math = sc.nextDouble();
		System.out.print("영어점수 : ");
		double eng = sc.nextDouble();
		
		double sum = language + math + eng;
		double average = sum / 3;
		if (language >= 40 && math >= 40 && eng >=40 && sum >= 60) {
			
			System.out.println("국어점수 : " + language);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + eng);
			System.out.println("합계 : " + sum);	
			System.out.println("평균 : " + average);
			System.out.println("축하합니다. 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}	
	}
	public void practice4() {
    	// 1, 2, 12월이면 -> 겨울
    	// 3~5월이면 -> 봄
    	// 6~8월이면 -> 여름
    	// 9~11월이면 -> 가을
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("계절을 확인하는 달 : ");
    	  int month = sc.nextInt();
    	  
    	  switch (month) {
    	  		case 1 : case 2 : case 12 : System.out.println("겨울");break;
    	  		case 3 : case 4 : case 5 : System.out.println("봄");break;
    	  		case 6 : case 7 : case 8 : System.out.println("여름");break;
    	  		case 9 : case 10 : case 11 : System.out.println("가을");break;
    	  	default : System.out.println("잘못 입력된 달입니다.");
    	  }
    	  
         }
	public void practice5() {
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 
//		로그인 성공 시 “로그인 성공”, 
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("패스워드 입력 : ");
		String password = sc.next();
		
		if (id.equals("seven") && password.equals("1234")) {
			System.out.println("로그인 성공");
		}else if (!id.equals("seven")) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	public void practice6() {
//  	  사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//  	  단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//  	  회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//  	  비회원은 게시글 조회만 가능합니다.
  	  
  	  Scanner sc = new Scanner(System.in);
  	  
  	  System.out.print("관리자/회원/비회원 입력: ");
  	  String member = sc.next();
  	  
  	  switch (member) {
  	  case "관리자" : System.out.println("회원관리" + "," + " 게시글 관리" + "," + " 게시글 작성" + "," +  " 댓글 작성 게시글 조회");break;
  	  case "회원" : System.out.println("게시글 작성" + "," + "게시글 조회" + "," + " 댓글 작성" );break;
  	  case "비회원" : System.out.println("게시글 조회");break;
  	  default : System.out.println("잘못입력했습니다. 관리자/회원/비회원 중에서 입력바랍니다.");
  	  }	
  	 	  
    }
    public void practice7() {
//  	  키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//  	  저체중/정상체중/과체중/비만을 출력하세요.
//  	  BMI = 몸무게 / (키(m) * 키(m))
//  	  BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//  	  BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//  	  BMI가 30이상일 경우 고도 비만
  	  Scanner sc = new Scanner(System.in);
  	  
  	  System.out.print("키 입력 : ");
  	  double height = sc.nextDouble();
  	  System.out.print("몸무게 입력 : ");
  	  double weight = sc.nextDouble();
  	  
  	  double BMI = weight / (height * height);
  	  
  	  if (BMI < 18.5) {
			System.out.println("저체중");
  	  }else if (BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		}else if (BMI >= 23 && BMI <= 25) {
			System.out.println("과제중");
		}else if (BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		}else if (BMI >= 30) {
			System.out.println("고도 비만");
		}
  	  
	  }
    
    public void practice8() {
//  	  키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//  	  (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//  	  “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
  	  Scanner sc = new Scanner(System.in);
  	  System.out.print("피연산자1 입력 : ");
  	  int su = sc.nextInt();
  	  System.out.print("피연산자2 입력 : ");
  	  int su2 = sc.nextInt();
  	  System.out.print("연산자를 입력(+, -, *, /, %) : ");
  	  String calaculation = sc.next();
  	  
  	  int Num = su + su2;
  	  
  	  if (Num % 2 == 0) {
			System.out.println(su + " " + calaculation + " " + su2);
		
  	  }else if (calaculation != "+" && calaculation != "-" && calaculation != "*" && calaculation != "/" && calaculation != "%") {
			System.out.println("잘못입력하셨습니다.");
		}
  	  
    }
    public void practice9() {
//  	  중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//  	  평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//  	  이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//  	  70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
  	  Scanner sc = new Scanner(System.in);
  	  
  	  System.out.print("중간고사 점수 입력 : ");
  	  int midexam = sc.nextInt();
  	  System.out.print("기말고사 점수 입력 : ");
  	  int finalexam = sc.nextInt();
  	  System.out.print("과제점수 입력 : ");
  	  int taskscore = sc.nextInt();
  	  System.out.print("출석횟수 입력 : ");
  	  int attendance = sc.nextInt();
  	  System.out.println("총 강의 횟수 : ");
  	  int totallecturecount = sc.nextInt();
  	  
  	  double midexamtatio = midexam * 0.2; 
  	  double finalexamtatio = finalexam * 0.3;
  	  double tasksscoretatio = taskscore * 0.3;
  	  double attendancetatio = (double) attendance / totallecturecount * 100; // 출석비율계산
  
  	  
  	  double sum = midexamtatio + finalexam + tasksscoretatio + (attendancetatio * 0.2);
  	  
  	  if (sum >= 70 && attendancetatio <= 30) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
  	  
  	  
  	{
			
		}
  	
  		  
  	  }
    public void practice10() {
    	// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.  
    		  Scanner sc = new Scanner(System.in);
    		  
    		  System.out.println("=== 계절구하기 === ");
    		  System.out.print("계절 입력 : ");
    		  String month = sc.next();
    		  
    		  switch (month) {
    		   
    		  
    		  }
    
   
    }

	
	}
	

