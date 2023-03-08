package com.array.controller;

import java.util.Scanner;

public class ArrayController {
	public void basicArray() {
		// 기본배열 활용하기
		// 배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		// 배열의 저장구조는 선형구조임.
		// 저장 순서가 있고, 저장소를 지칭하는 번호(인덱스)를 가진다.
		// 배열 선언하기
		// 배열 자료형 => 기본자료형[]  
		int [] intArr; // 배열을 저장할수 있는 변수를 선언
		// intArr = 10; 쓸수없다
		// 원하는 크기 만큼의 배열을 생성해서 할당을 해야한다.
		// 배열을 생성하기 -> new 연산자를 이용해서 생성
		// new 자료형[원하는 갯수(길이)를 입력한다]
		intArr = new int[3];
		// 기본으로 생성했을때 각 저장소는 자료형의 기본값으로 초기화된다.
		// 정수형(byte, short, int, long) : 0
		// 실수형(float, double) : 0.0
		// 문자열(String) : null
		// 문자(char) : ' '
		// 배열생성 후 각 저장공간활용하려면
		// 인덱스 번호로 각 저장공간을 불러올수 있다.
		// 인덱스번호는 선언한 길이에 -1한 번호까지
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		// 초과한 인덱스번호를 호출하면???
		//System.out.println(intArr[3]); 잘못접근한 index초과 그래서 접근하려면 위의 intArr = new int[3] ->[4]로 길이를 늘려준다.
		//배결에 값 저장하기
		intArr[0] = 1;		
		intArr[1] = 200;
		intArr[2] = -5;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		// 친구이름 저장하기
		// 친구 3명의 이름을 저장하는 배열을 만들고 
		// 자신의 스터디원을 저장 후 출력하기
		String [] name;
		name = new String[4];
		
		name[0] = "홍길동";
		name[1] = "강백호";
		name[2] = "고길동";
		name[3] = "고융영";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		// for문과 같이 배열 이용하기
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		//for문을 이용해서 이름 출력하기
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		// 배열에서 저장소의 길이를 제공하는 변수가 있음.
		// 배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(name.length);
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
      public void practice6() {
//    	  사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//    	  단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//    	  회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//    	  비회원은 게시글 조회만 가능합니다.
    	  
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
//    	  키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//    	  저체중/정상체중/과체중/비만을 출력하세요.
//    	  BMI = 몸무게 / (키(m) * 키(m))
//    	  BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//    	  BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//    	  BMI가 30이상일 경우 고도 비만
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
//    	  키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//    	  (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//    	  “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
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
//    	  중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//    	  평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//    	  이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//    	  70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.print("중간고사 점수 입력 : ");
    	  int midexam = sc.nextInt();
    	  System.out.print("기말고사 점수 입력 : ");
    	  int finalexam = sc.nextInt();
    	  System.out.print("과제점수 입력 : ");
    	  int taskscore = sc.nextInt();
    	  System.out.print("출석횟수 입력 : ");
    	  int attendance = sc.nextInt();
    	  
    	  double midexamtatio = midexam * 0.2; 
    	  double finalexamtatio = finalexam * 0.3;
    	  double tasksscoretatio = taskscore * 0.3;
    	  double attendancetatio = (20 / attendance) * 0.2;
    	  double sum = midexamtatio + finalexam + tasksscoretatio + attendancetatio;
    	  
    	  if (sum >= 70) {
			System.out.println("Pass");
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
