package com.operator.controller;
// 기능을 제공하는 클래스
import java.util.Scanner;

public class OperatorController {
	// 1. 단항연산자 알아보기
	public void singleOp() {
		// 1. 부정연산자 : boolean형의 값을 반전시키는 연산자
		// 표현 : !변수명 or !기능(메소드)호출 or !비교연산 = 이렇게 3가지방식으로 호출
		System.out.println("==== 부정 연산자 활용하기 ====");
		boolean flag = true;
		System.out.println("flag : " + flag);
		System.out.println("!flag : " + !flag);
		System.out.println("flag : " + !!flag);
		
		// 예) 나이가 19이상이 아니지? 
		int age = 15;
		System.out.println(!(age > 19));
		
		// 기능호출했을때 부정하기
		// String의 값을 동등비교할때는 equals()를 이용해야함.
		// 예) 이름이 유병승이니??
		String name = "유병승";
		System.out.println(name.equals("유병승")); // 즉 유병승이 name인걸 같냐고 물어볼때 equals, name이 유병승이랑 같니?라는 뜻 
		System.out.println(!name.equals("유병승")); // name이라는 변수가 유병승이 같지 않지??라는 뜻
		
		// 2. 증가, 감소 연산
		// 표현 : ++변수, 변수++, --변수, 변수-- 
		// 특정 수를 셀때 사용
		// 변수에 (정수)에 1을 더하고 다시 그 변수에 저장시키는 연산
		// ++변수 => 변수 = 변수+1
		int count = 0;
		++count; // count = count + 1;
		count = count + 1;
		System.out.println(count);
		count++;
		count++;
		System.out.println(count);
		
		count = 0; // 초기화시기키기
		
		--count; // count = count - 1;
		count = count - 1;
		count--;
		System.out.println(count);
		
		// ++, -- 연산자의 위치에 따라 연산실행 순서가 변경
		// 다른 연산자와 같이 연산을 실행했을때 순서가 변경됨.
		// int testNum = ++count + 10; // 전위연산 8
		// 전위연산 : 다른연산자와 같이 있을때 먼저 증가, 감소연산을 실행하고 다른연산을 실행
		int testNum = count++ + 10; // 후위연산 7
		// 후위연산 : 다른연산과 같이 있을때 다른 연산을 먼저 실행 하고 나중에 증가, 감소연산을 실행
		System.out.println(testNum); // 전위연산 8 , 후위연산 7 
		System.out.println("count : " + count); // -2 	
		
		testNum = 0;
		count = 0;
		// testNum = --count;
		testNum = count--; // count = 0 이 testNum에 먼저 들어가서 이후에 --계산을 함
		System.out.println("testNum : " + count);
		// 주로 반복문을 사용할때 많이 사용됨
		// for (int i = 0; i < 10; i++) {}
		// for문 특정로직의 실행횟수를 확인할때 많이 사용
		
	
	} // singleOp() 메소트가 닫힌거
	
	public void calculatorOp() {
		// 산술연산자 활용하기
		// +, - , *, /, %(나머지)
		int su = 2;
		int su2 = 10;
		// 더하기, 빼기
		System.out.println("+연산 : " + (su + su2));
		System.out.println("-연산 : " + (su - su2));
		
		// 곱하기, 나누기
		System.out.println("연산 : " + su * su2);
		System.out.println("연산 : " + su / (double)su2);
		
		// 산술연산결과를 계속사용하려면?? -> 결과를 변수에 저장하고 활용
		int result = su + su2;
		double result2 = su/(double)su2;		
		
		// 나머지 연산 
		// % 연산 짝수, 홀수 구분, 배수, 약수, 등을 구할수 있는 연산자
		System.out.println(su%2);
		System.out.println(su2%3);
		
		// 입력받은 값이 짝수인지 홀수인지 판단하는 기능
		// 특정수의 배수가 맞는지 판단하는 기능
		
		
		
	
	
	}
	
	
	public void calc() {
		// 계산기 만들기
		// 사용자에게 임의의 두수를 입력받고 입력받은 수의
		// 더한결과, 뺀결과, 곱한결과, 나눈결과를 출력하는 기능을 구현
		Scanner sc = new Scanner(System.in); 
		
		int Num, Num2 ;
		Num = sc.nextInt();
		Num2 = sc.nextInt();
//		int Num = sc.nextInt();
//		int Num2 = sc.nextInt();
		
		System.out.print("더한결과 : " + (Num + Num2));
		System.out.print("뺀 결과 : " + (Num - Num2));
		System.out.print("곱한 결과 : " + Num * Num2);
		System.out.print("나눈 결과 : " + Num/Num2);
		
	}
	
	public void compareOp() {
		// 비교연산자 활용하기
		// 동등비교
		// 동등비교 표현 : == , !=
		// 대소비교
		// 대소비교 표현 : > , < , <= , >=
		// 비교연산의 결과는 true/false(boolean)로 반환됨.
		
		// 1. 동등비교 
		// 숫자형 동등비교
		int num = 13;
		int num2 = 19;
		int num3 = 13;
		// 일치 여부 확인
		System.out.println(num == num2);
		System.out.println(num == num3);
		// 불일치 여부 확인(!= 연산자를 활용)
		System.out.println("num!= num2 " + (num != num2));
		System.out.println("num!= num3 " + (num != num3));
		
			
		// 실수형 비교하기
		double dnum = 180.5;
		double dnum1 = 190.5;
		double dnum2 = 180.5;
		System.out.println(dnum==dnum1);
		System.out.println(dnum==dnum2);
		System.out.println(dnum!=dnum1);
		dnum = 13;
		System.out.println(dnum == num);
		
		// 문자 동등비교
		char ch = 'A';
		char ch1 ='a';
		char ch2 = 'A';
		System.out.println("A==a : " + (ch==ch1));
		System.out.println("A==A : " + (ch==ch2));
		System.out.println("A!=a : " + (ch!=ch2));
		int chInt = 65;
		
		System.out.println((int)ch);
		System.out.println(ch==chInt); // 자동으로 형변환 된것
		
		// 문자열에 대한 동등비교
		// String(클래스) 동등비교할때 == 연산을 사용할수 없다 
		// String이 제공하는 equals()기능을 이용해서 동등비교를 한다.
		String name = "유병승";
		String name2 = "이다영";
		String name3 = "유병승";
		String name4 = new String("이다영");
		System.out.println("name==name2 : " + (name==name2));
		System.out.println("name==name3 : " + (name==name3));
		System.out.println("name2==name4 : " + (name2==name4));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : "  );
//		String inputName = sc.nextLine();
//		// System.out.println(inputName=="유병승"); 즉 String일때 이렇게 비교하면 X
//		System.out.println(inputName.equals("유병승")); // equals로 비교하기
//		System.out.println("유병승".equals(inputName)); // 위의 것과 같은 결과가 나옴
//		// 불일치 비교
//		System.out.println(!inputName.equals("유병승"));
			
		
		// 대소비교하기
		// 숫자값만 가능
		// < , > , <= , >=
		num = 200;
		num2 = 300;
		num3 = 200;
		System.out.println(num < num2);
		System.out.println(num > num3);
		System.out.println(num >= num3);
		
		// 문자타입은 대소비교가 가능할까? 
		char ch4 = 'Z';
		char ch5 = 'E';
		System.out.println("Z > E : " + (ch4 > ch5)); // 비교가능 내부적으로 숫자형 코드값을 사용하기 때문에
		// 대문자, 소문자를 확인할 수 있음.
		System.out.println("A < Z : " + ('A' < 'Z'));
		
		// 문자열도 대소비교 가능한가??
		String str = "30";
		String str2 = "40";
		// System.out.println(str < str2); // 문자열은 대소비교 X
		
	}
	
	// public void testStr() 기능을 구현
	// 사용자에게 id를 입력받고 id가 admin이면 true를 출력하는 기능
	// public void check()기능 구현
	// 사용자에게 나이를 입력 받고 성년이면 true를 출력하는 기능
	
	public void testStr() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("아이디 : ");
		String id = "admin";
		id = sc.nextLine();
		System.out.print(id.equals("admin"));
		
	}
	
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		System.out.print((age >= 20));
			
	}
	
	public void logicOp() {
		// 논리연산하기
		// 논리연산 : 2개이상의 진위형을 연결할때 사용하는 연산
		// &&(and 그리고) : 두개의 진위형이 모두 true일때 true반환
		// ||(or 또는) : 두개의 진위형 중 한개가 true일때 true 반환
		// 예 id가 admin이고, password가 1234면 true 아니면 false
		String id = "admin"; // id admin이고
		// String password = "1234"; // password가 1234면
		String password = "1111";
		System.out.println(id.equals("admin") && password.equals("1234"));
		
		// 입력받은 나이가 19살 이상이고 경기도에 살면 true 출력 아니면 false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : " );
		int age = sc.nextInt();
		
		sc.nextLine();

		System.out.print("주소(광역시, 도) : " );
		String address = sc.nextLine();
		
		// System.out.print(age >= 19 && address.equals("경기도")); 
		
		// or 연산 
		// 입력받은 주소가 경기도나 서울 일 경우 true반환
		System.out.println(address.equals("경기도") || address.equals("서울"));
		
		// 논리연산을 이용해서 숫자의 범위를 확인할수 있다.
		System.out.println(age >= 10 && age <= 20); 
		
		// 입력받은 나이가 20대이면 true 아니면 false
		System.out.println(age >= 20 && age <= 29);
		
		// 문자한개를 입력받고 입력한 문자가 대문자면 true 아니면 false
		
		// 아스키 코드로 보기
		System.out.print("문자입력 : " );
//		char ch = sc.next().charAt(0);
//		System.out.print(ch >= 65 && ch <= 90);
		
		char ch = sc.next().charAt(0);
		System.out.print(ch >= 'A' && ch <= 'Z');
		
		// 입력받은 나이가 20대 이면서 입력받은 성별이 여자인 사람
		
		System.out.print("성별(남,여 or 남자/여자) : ");
		String gender = sc.next();
	//  char gender = sc.next().charAt(0); // 이렇게 해도 됨 밑에 출력과 같이 나옴
		System.out.print(age >= 20 && age <= 29 && gender.equals("여자"));
	//	System.out.println(age >= 20 && age <= 29 && gender=='여');
		
		// 입력받은 문자가 알파벳(대문자 혹은 소문자)이면 true 아니면 false 
		System.out.println("");
		System.out.print("알파벳 : ");
		
		System.out.print(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z');
		
		// 사는곳이 서울 또는 인천이면서 30대인 사람 구하기
		System.out.println("");
		System.out.print((address.equals("인천") || address.equals("서울")) && age >= 30 && age <= 39); // &&연산과 || 연산의 우선순위가 &&부터 먼저 나옴 이걸 생각해야함
		
	}
	
	public void complexOp() {
		// 복합대입 연산자
		// +=, -=, *=, /=
		// a +=10 => a = a + 10
		// a -=10 => a = a - 10
		// a *=10 => a = a * 10
		// 값을 누적시키거나 차감시킬때 사용 예) 용돈기입장 같은것들
//		int total = 300000;
//		total -=1000;
//		System.out.println(total);
//		
//		total +=10000;
//		System.out.println(total);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("현재 용돈 : ");
//		total = sc.nextInt();
//		System.out.print("금액 : ");
//		total +=sc.nextInt();
//		System.out.println("현재 잔액 : " + total);
//		System.out.println("현재 용돈 : ");
//		total = sc.nextInt();
//		System.out.println("금액 : ");
//		total +=sc.nextInt();
//		System.out.println("현재 잔액 : " + total);
//		System.out.print("현재 용돈 : ");
//		total = sc.nextInt();
//		System.out.println("금액 : ");
//		total +=sc.nextInt();
//		System.out.print("현재 잔액 : " + total);
	
		// 문자열에 대한 누적을 할수 있을까??
		String msg = ""; // 공값을 대입할때=> 이렇게 ""빈값을 넣어주면 초기화해줌
		msg +="안녕";
		msg +="하이";
		msg +="왓썹";
		msg +="곰방와";
		System.out.println(msg);	
	}
	
	// 사용자에게 메세지를 4개 입력받고 입력받은 메세지를 한번에 출력하는 기능 만들기
	// public void inputMsg();
	public void inputMsg() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 메세지 : "); 
		String msg = sc.nextLine() + "\n";
		System.out.print("두번째 메세지 : ");
		msg += sc.nextLine() + "\n";
		System.out.print("세번째 메세지 : ");
		msg += sc.nextLine() + "\n";
		System.out.print("네번째 메세지 : ");
		msg += sc.nextLine() + "\n";
		System.out.println("한번에 출력하기 : " + msg);
		
		// 웹페이지를 구성해서 응답할때 사용, (자바스크립트 사용할때 이렇게 사용할수 있다.)
		String html = "<html>";
		html +="<head>";
		html +="</head>";
		html +="<body>";
		html +="<h2>내가 만든 첫 페이지</h2>";
		html +="<body>";
		html +="</html>";
	}
	
	public void thirdOp() {
		Scanner sc = new Scanner(System.in);
		//삼항연산자에 대해 알아보자.
		// 조건식(true, false) 값이 나오는 
		// 연산, 기능(메소드) ? 조건식 or 기능이 true일때 실행할 로직
		// 기능이 false일때 실행할 로직
		
		// 값이 180보다 크면 키가 크네요 출력 아니면 키가 작네요 출력
		double height = 170.5;
		String msg = height >= 180 ? "키가 크네요" : "키가 작네요";
		System.out.println(msg);
		
		// 점수를 입력받아 점수가 60점 이상이면 합격을 출력, 아니면 불합격 출력
		
		System.out.print("점수 : ");
		int grade = sc.nextInt();
		System.out.print(grade >= 60 ? "합격" : "불합격");
		
		// 아이디와 패스워드를 입력받고 
		// 아이디가 admin이고 패스워드가 1234면 로그인 성공출력 
		// 아니면 로그인실패출력
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String password = sc.next();
		System.out.print(id.equals("admin") && password.equals("1234") ? "로그인 성공" : "로그인 실패");
		
//		String tag = "<input type = 'checkbox' name = 'hobby'>"
//		+ (userId.equals("admin")?"checked" : "") + ">"; // (참고)실질적으로 이렇게 사용가능함
		
		// 나이와 성별을 입력받아 나이가 성년이고 남자면 멋진 남자네요!! 
		// 나이가 성년이고 여자이면 예쁘시네요!
		// 나이가 미성년이면 공부하세요!
		System.out.println("");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String result = age > 19 ? gender =='M' ? "멋진남자네요!" : "이쁘시네요" : "공부하세요";
		System.out.println("result : " + result);
		
		
	}
	
	
	// 수학, 영어, 국어, 코딩점수를 입력받고
	// 합계와 평균을 출력하는 기능을 구현하기
	// 변수는 한개만 사용해서 구현할것
	// 메소드 public void calcGrade()
	public void calcGrade() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("수학 : ");
		int gradetotal = sc.nextInt();
		gradetotal +=sc.nextInt();
		System.out.print("영어 : ");
		gradetotal +=sc.nextInt();
		System.out.print("국어 : ");
		gradetotal +=sc.nextInt();
		System.out.print("코딩점수 : ");
		gradetotal +=sc.nextInt();
		System.out.print("합계 : " + gradetotal);
		System.out.print("평균 : " + gradetotal /4.0);
		
		
		
	}
	
	
	

}
