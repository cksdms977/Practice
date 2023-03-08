package com.control.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;
import javax.swing.SpinnerDateModel;

public class ConditionController {
	public void ifTest() {
		// 기본 if문 활용하기
		// if(조건식(true||false)) {조건식의 결과가 true 일때 실행할 명령어}
		// if의 {}안에 변수선언, 연산자, 메소드 호출, 조건문, 반복문을 사용할수 있다.
		if (100 > 10) {
		//if(100 < 10) {
		System.out.println("10은 100보다 크다."); // false 이면 패스하게 된다.
		}
		System.out.println("if문 중괄호 밖에 있는 로직은???");
			
		
		// 특정한 정수를 입력받아 200을 입력하면 200을 입력했군요! 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		if (num == 200) { // 특정한 정수를 입력받아 200을 입력하면?? 이문장이 if문부분
			System.out.println("200을 입력했군요");
		}
		
		// 입력받은 정수가 100~200사이이면 정상데이터를 입력했습니다. 출력
		System.out.print("정수입력 : ");
		int num2 = sc.nextInt();
		
		if (num2 >= 100 && num2 < 200) {
			System.out.println("정상데이터 입력했습니다.");	
		}
		
		}
	
		// 입력받은 값이 5의 배수인지 확인하는 기능 구현
		// 입력값이 5의 배수면 5의 배수입니다. 출력
		// public void checkNumber()
	public void checkNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int su = sc.nextInt();
		
		if (su % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		
		// if문의 중괄호에서 선언된 변수활용하기
		// 1. if문의 외부에 선언된 변수 활용 -> if문에서 활용이 가능, if외부에서도 활용가능
		// 2. if문 내부에 선언된 변수 활용 -> if 문에서 활용이 가능, if 외부에서는 활용X
		
		String outterData = "if외부선언 데티어";
		
		if (10 > 0) {
			String innerData = "if문 내부 선언 데이터";
			System.out.println(outterData);
			System.out.println(innerData);
			outterData +=" if 에서 추가한 내용";
			//외부에 선언된 변수와 동일한 명칭을 사용할 수 없다.
			//int outterDate = ""
			// 단 다른 if문의 변수는 사용하가능하다. 
		}
		//System.out.println(innerData);
		System.out.println(outterData);
		}
	
		// 이름을 입력 받고 본인이름과 같으면 코딩천재!! 문구를 출력하기
		// public void testName();
		// 아이디와 패스워드를 입력받고 아이디가 admin, 패스워드가 8888이면 
		// 로그인 성공출력
		// public void logincheck()
	public void testName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		if (name.equals("홍길동")) {
			System.out.println("코딩천재!!");
		}
			
		}

	public void logincheck() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String password = sc.next();
		
		if (id.equals("admin") && password.equals("8888")) {
			System.out.println("로그인 성공");
		}
		
}
	public void ifelseTest() {
		// if~else문 이용하기 => 삼항연산자와 비슷하다.
		// 조건에 따라 반드시 한개 로직이 샐행되는 구문을 작성할때 
		// if wjfdlsk else절에 있는 구문이 반드시 실행
		// 특정수를 입력받아 그 수가 정수인지 양수인지 음수인지 확인해주는 로직
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int su = sc.nextInt();
		if (su > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		// else 구문은 단독으로 사용할 수 없다.
		//else {
		//	System.out.println("가능하니??");
		//}
		// if~else문은 한개 그룹임. 항상 같이 쓰임
		
	} 
	// 수를 입력받고 그 수가 짝수인지 홀수인지 확인해주는 기능을 만들어보세요.
	// public void oddeven()
		public void oddeven() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("수 입력 : ");
			int su = sc.nextInt();
			
			if (su % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
		}
	// 미셩년이면 회원가입이 불가능하고, 성년이면 회원가입정보를 입력받는 기능구현하기
	// 회원정보 이름, 나이, 성별, 기를 입력받고 출력
	// 미성년인경우 회원가입이 불가능합니다. 출력
	// public void enrollMember()
		
		public void enrollMember() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("회원정보 나이 : ");
			int age = sc.nextInt();
			
			if (age >= 20) {
				System.out.print("회원정보 이름 : ");
				String name = sc.next();
				System.out.print("회원정보 성별 : ");
				String gender = sc.next();
				System.out.print("회원정보 키 : ");
				double height = sc.nextDouble();
				
				System.out.println("이름 : " + name +" 성별 : " + gender + " 키 : " + height + "cm" );
				
			} else {	
						System.out.println("회원가입이 불가능합니다.");
			}
			
		}
		
		public void ifelseifTest() {
			// if~else if~else if...~[else]문 활용하기
			// 조건이 여러개일때 사용하는 조건문
			// if문과 한개 그룹으로 묶임.
			// 월을 입력받아 계절을 확인해주는 기능을 구현
			Scanner sc = new Scanner(System.in);
			System.out.print("계절을 확인할 달 : ");
			int month = sc.nextInt();
			// 1, 2, 12월이면 -> 겨울
			// 3~5월이면 -> 봄
			// 6~8월이면 -> 여름
			// 9~11월이면 -> 가을
			if (month == 1 || month == 2 || month == 12) {
				System.out.println("겨울이야 ~ 겨울잠자자!!");
			} else if (month >= 3 && month <= 5) {
				System.out.println("봄이야 ~ 꽃구경가자!!");
			} else if (month >= 6 && month <= 8) {
				System.out.println("여름이야 ~ 바다가자!!");

			}else if (month >= 9 && month <= 11) {
				System.out.println("가을이야 ~ 단풍놀이가자");
			}else {
				System.out.println("없는 달을 입력했습니다. 1~12까지 입력해주세요!");
			}
		
			
			// 성적등급 출력 프로그램 만들기
			// 점수를 입력받고 그 점수가 
			// 90점 이상이면 A 
			// 90점 미만 80점 이상이면 B
			// 80점 미만 70점 이상이면 C
			// 70점 미만 60점 이상이면 D
			// 그외는 F를 출력함
			// 등급과 점수를 모두 출력
			// OO점은 O등급입니다!
			
			System.out.print("성적 등급 점수 : ");
			double score = sc.nextDouble();
		
			char grade = ' ';
			
			if (score >= 90) {
				grade = 'A';
			}else if (score >= 80) {
				grade = 'B';
			}else if (score >= 70) {
				grade = 'C';
			}else if (score >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			} {
				System.out.println(score + "점은 " + grade + "등급입니다!");
			}

			// 메뉴 선택 기능 구현하기
			// 술추천 기능
			// 1. 맥주 -> 좋은 맥주를 추천 기네스가 맛있어요
			// 2. 와인 -> 피노누아가 맛있어요
			// 3. 위스키 -> 발렌타인 21년산 먹고싶어요
			// 4. 막걸리 -> 장수막걸리가 맛있어요
			
			System.out.println("===술추천 메뉴===");
			
			System.out.println("1. 맥주");
			System.out.println("2. 위스키");
			System.out.println("3. 와인");
			System.out.println("4. 막걸리");
			
			System.out.print("술 이름명 입력 : ");
			String name = sc.next();
			
			if (name.equals("맥주")) {
				System.out.println("기네스가 맛있어요");
			}else if (name.equals("와인")) {
				System.out.println("피노누아가 맛있어요");
			}else if (name.equals("위스키")) {
				System.out.println("발렌타인 21년산 먹고싶어요");
			}else if (name.equals("막걸리")) {
				System.out.println("장수막걸리가 맛있어요.");
			}else {
				System.out.println("잘못입력했습니다. 맥주, 와인, 위스키, 막걸리 중에서 입력하세요");
			}
		
				
			}		
			public void switchTest() {
			// switch문 활용하기
			// 정해진 값에 대해서 분기처리할때 사용하는 조건문
			// 메뉴기능을 구현할때 많이 사용함.
			// switch문의 ()안에는 변수, 변수의 연산결과를 작성
			// int, String, char 자료형만 가능
				
			Scanner sc = new Scanner(System.in);
			System.out.println("=== 점심메뉴 ===");
			System.out.println("1. 윤쉐프");
			System.out.println("2. 중국집");
			System.out.println("3. 삼계탕");
			System.out.println("4. 육개장");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 : System.out.println("구내식당 중 가장 맛있대요!");
			 break;
			case 2 : System.out.println("BYC건물 쌍용중국집이 먹을만해요!");
			 break;
			case 3 : System.out.println("BYC건물 가산삼계탕이 먹을만해요!");
			 break;
			case 4 : System.out.println("이화수육개장이 먹을만 해요!");
			 break;
			default : System.out.println("메뉴는 1~4번까지만 있습니다.");
			 break; 
			
			}
			System.out.println("몇 월 : ");
			int month = sc.nextInt();
			switch (month) {
			case 1: case 2 : case 12 :  System.out.println("겨울이네요"); break; 
			case 3 : case 4 : case 5 : System.out.println("봄이네요");break;
			
		
			}
			
			// Strign 이용하기
			System.out.println("=== 문자열 이용하기 ===");
			System.out.println("당신의 취미는(운동, 노래, 영화감상) : ");
			
			String hobby = sc.next();
			
			switch (hobby) {
			case  "운동": System.out.println("운동을 하면 건강해져요"); break;
				case "노래" : System.out.println("노래를 잘하나요?");	 break;
		
			}
			
			switch(choice % 5) {
				case 1 : 
				case 2 : 
				case 3 : 
				case 4 : 
			}
			
			// 분식집 주문 프로그램 만들기
			// 메뉴 : 떡볶이(3000원) , 순대(2500원) , 튀김(3000원) , 김밥(3500원), 라면(3500원)
			// 선택하면 주문한 메뉴 이름과 금액을 출력하는 기능
			// 출력 예 : 떡볶이를 고르셨습니다... 결제금액은 3000원 입니다. 
			// 없는 것을 고르면 잘못 고르셨습니다. 숫자로
			
			
			System.out.println("=== 분식메뉴 ===");
			System.out.println("1. 떡볶이\t\t3000원");
			System.out.println("2. 순대\t\t2500원");
			System.out.println("3. 튀김\t\t3000원");
			System.out.println("4. 김밥\t\t3500원");
			System.out.println("메뉴 입력 : ");
			int choice1 = sc.nextInt();
			
			String menu = "";
			int price = 0;
			switch (choice1) {
			case 1 : menu = "떡볶이"; price = 3000; break;
			case 2 : menu = "순대"; price = 2500; break;
			case 3 : menu = "튀김"; price = 3000; break;
			case 4 : menu = "김밥"; price = 3500; break;
			case 5 : menu = "라면"; price =  3500; break;
			default : menu = "없음"; 
						
			}
			System.out.println(menu.equals("없음") ? "잘못 고르셨습니다." 
					: "당신이 선택한 메뉴는 " + menu + " 를 고르셨습니다..." 
					+ "결제금액은 " + price +"원 입니다." );
			
			}
			
			public void innerifTest() {
				// if문 내부에 if문을 사용할 수 있다.
				// 성인인 사람만 주문을 할 수 있는 기능
				Scanner sc = new Scanner(System.in);
				
				System.out.println("당신의 나이는 : "); 
				int age = sc.nextInt();
				if (age >= 19) {
					System.out.println("=== 메뉴 ===");
					System.out.println("1. 맥주");
					System.out.println("2. 와인");
					int cho = sc.nextInt();
					if (cho == 1) {
						
					}else if (cho == 2) {
						if (10 >= 10) {
							
						}
					}
				
				}
					
			}
			
			//public void ex_test()
			//성인만 가입할 수 있는 회원가입 - > 미성년이면 회원 가입 불가 합니다.
			// 성인이면 내국인, 외국인 구분하고
			// 내국인이면 회원가입으로 바로 이동 -> 이름, 주소를 저장 출력
			// 외국인이면 외국인 등록번호여부를 확인하고 (있다, 없다.)
			// 있으면 회원가입으로 이동 - > 외국인 등록번호, 이름, 주소를 저장 출력
			// 없으면 회원가입이 불가능합니다 출력
			// 선택을 잘못한 경우 -> 잘못 누르셨습니다. 출력 후 종료
			
			public void ex_test() {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("=== 회원가입 ===");
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				
				if (age >= 20) {
					System.out.print("국적 입력(내국인/외국인) : ");
					String nationality = sc.next();
					if (nationality.equals("내국인")) {
						System.out.print("이름 : ");
						String name = sc.next();
						System.out.print("주소 : ");
						sc.nextLine();
						String address = sc.nextLine();
					}else if (nationality.equals("외국인")) {
						System.out.print("외국인 등록번호여부(있다/없다) : ");
						String number = sc.next();
						if (number.equals("있다")) {
							System.out.print("외국인 등록번호 : ");
							int Number = sc.nextInt();
							System.out.print("이름 : ");
							String Name = sc.next();
							sc.nextLine();
							System.out.print("주소 : ");
							String Address = sc.nextLine();
							} else if (number.equals("없다")) {
								System.out.println("회원가입 불가능 합니다.");	
					System.out.println("잘못 누르셨습니다.");
				}
					}	
				}
				
				}

			}



			
			
	
		
		
		
	


	

