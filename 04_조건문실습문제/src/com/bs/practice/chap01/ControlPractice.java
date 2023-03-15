package com.bs.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("선택 : ");
		int choice=sc.nextInt();
		String msg="";
		switch(choice) {
			case 1 : msg="입력";break;
			case 2 : msg="수정";break;
			case 3 : msg="조회";break;
			case 4 : msg="삭제";break;
			case 7 : msg="종료";break;
		}
		if(!msg.equals("종료")) {
			System.out.println(msg+"메뉴입니다");
		}else {
			System.out.println("프로그램이 종료됩니다.");
		}	
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int su=sc.nextInt();
		if(su>0) {
			if(su%2==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor=sc.nextInt();
		System.out.print("수학점수 : ");
		int math=sc.nextInt();
		System.out.print("영어점수 : ");
		int eng=sc.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+total);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else{
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month=sc.nextInt();
		switch(month) {
			case 1 : case 2: case 12 : System.out.println(month+"월은 겨울입니다");break;
			case 3 : case 4: case 5: System.out.println(month+"월은 봄입니다"); break;
			case 6 : case 7: case 8: System.out.println(month+"월은 여름입니다");break;
			case 9 : case 10: case 11: System.out.println(month+"월은 가을입니다");break;
			default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}	
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId=sc.nextLine();
		System.out.print("패스워드 : ");
		String password=sc.nextLine();
		String result="";
		if(userId.equals("myId")&&password.equals("myPassword12")) {
			result="로그인 성공";
		}else if(password.equals("myPassword12")){
			result="아이디가 틀렸습니다.";
		}else if(userId.equals("myId")) {
			result="비밀번호가 틀렸습니다.";
		}else {
			result="아이디, 비밀번호 모두 틀렸습니다.";
		}
		System.out.println(result);
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String auth="";
		switch(sc.nextLine()) {
			case "관리자" : auth="회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회";break;
			case "회원" : auth="게시글 작성, 댓글 작성, 게시글 조회";break;
			case "비회원" : auth="게시글 조회";break;
		}
		System.out.println(auth);
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("키(m)를 입력하세요 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게(kg)입력하세요 : ");
		double weight=sc.nextDouble();
		double result=weight/(height*height);
		System.out.println("BMI 지수 : "+result);
		if(18.5>result) {
			System.out.println("저체중");
		}else if(result<23){
			System.out.println("정상체중");
		}else if(result<25) {
			System.out.println("과체중");
		}else if(result<30) {
			System.out.println("비만");
		}else if(result>=30) {
			System.out.println("고도비만");
		}
		
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int su=sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int su2=sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op=sc.next().charAt(0);
		switch(op) {
			case '+' : System.out.println(su+" + "+su2+" = "+(su+su2));break;
			case '-' : System.out.println(su+" - "+su2+" = "+(su-su2));break;
			case '*' : System.out.println(su+" * "+su2+" = "+(su*su2));break;
			case '/' : System.out.printf("%d / %d = %f",su,su2,(su/(double)su2));break;			
			case '%' : System.out.println(su+" % "+su2+" = "+(su%su2));break;			
		}
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double middleEx=sc.nextInt()*0.2;
		System.out.print("기말 고사 점수 : ");
		double finalEx=sc.nextInt()*0.3;
		System.out.print("과제 점수 : ");
		double report=sc.nextInt()*0.3;
		System.out.print("출석 횟수 : ");
		double attend=sc.nextDouble();
		double total=(middleEx+finalEx+report+attend);
		System.out.println("========== 결과 ==========");
		if(70>total||attend<(20*0.3)) {
			String reason="";
			if(attend<(20-(20*0.3))) {
				reason="출석 회수 미달("+(int)attend+"/20)";
				System.out.println("Fail ["+reason+"]");
			}else {
				System.out.println("중간 고사 점수(20) : "+middleEx);
				System.out.println("기말 고사 점수(30) : "+finalEx);
				System.out.println("과제 점수(30) : "+report);
				System.out.println("출석 점수(20) : "+attend);
				System.out.println("총점 : "+total);
				reason="점수 미달";
				System.out.println("Fail ["+reason+"]");
			}
		}else {
			System.out.println("중간 고사 점수(20) : "+middleEx);
			System.out.println("기말 고사 점수(30) : "+finalEx);
			System.out.println("과제 점수(30) : "+report);
			System.out.println("출석 점수(20) : "+attend);
			System.out.println("총점 : "+total);
			System.out.println("Pass");
		}
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int cho=sc.nextInt();
		switch(cho) {
			case 1 : practice1();break; 
			case 2 : practice2();break; 
			case 3 : practice3();break; 
			case 4 : practice4();break; 
			case 5 : practice5();break; 
			case 6 : practice6();break; 
			case 7 : practice7();break; 
			case 8 : practice8();break; 
			case 9 : practice9();break; 
		}
	}
}
