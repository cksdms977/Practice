package com.repeate.controller;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class RepeateController {
	public void basicRepeat() {
		// 기본 for문 이용하기
		// 특정코드는 원하는 만큼 반복해서 실행하게 하는 명령어
		// for(초기식;조건식;증감식) { 반복할 코드를 작성 }
		// 초기식 : 변수선언, 반복한 횟수에 대해 저장하는 공간
		// 조건식 : 반복을 더 실행할지말지 결정하는 조건 (true 실행, false 중단)
		// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산 -> 조건식의 결과가 변경
		// 안녕하세요를 10번 출력하기
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		// 반갑습니다. 100개 출력
//		for (int i = 1; i <= 100; i++) {
//			System.out.println("반갑습니다.");
//		}
		
		// 1~10까지 수를 출력하기
//		for (int i = 1; i < 11; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("-----------");
//		// for문 {}내부에는 변수선언, 연산자, 조건문 다 사용이 가능
//		// {}내부에서 선언한 것들은 내부에서만 사용이 가능함.
//		// 5번 실행하는 for문 만들기
//		for (int i = 0; i < 5; i++) {
//			int temp = 10 + i;
//			if (temp % 2 == 0) {
//				System.out.print(temp);
//			}
//		}
		// System.out.println(temp); 외부에서는 실행할수 없다.
		
		// 1부터 100까지의 수를 출력하기
		// 1부터 100까지의 수에서 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		for (int i = 1; i <= 100; i++) {
			int su = i;
			if (su % 2 == 0) {
				System.out.println(su);
			}
		}
//		for (int i = 2; i <= 100; i+=2) { // 위의 결과와 같다
//				System.out.println(i);
			
		// 100~1까지 수 출력하기
		for (int i = 100; i < 0 ; i--) {
			System.out.print(i + " ");
		}
		int count = 100;
//		for (int i = 1; i <= 100; i++) { // 위의 식과 똑같이 출력한다.
//			System.out.println(count--);
//		}
		
		// 친구 5명의 이름을 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
//		String name = "";
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("친구이름 : " );
//			name += sc.next();			
//		}
//		System.out.println(name);

		// 숫자 4개를 입력받아 총합을 구하는 기능 구현하기
//		
//		int su = 0;
//		for (int i = 1; i <= 4; i++) {
//			System.out.print("숫자 입력 : ");
//			su += sc.nextInt();
//			}
//		System.out.println(su);
//	
//		
		
		
//		count = 0;
//		for (; count < 10; count++) {
//			System.out.println(count);
//		}
//	
//		for (;; count++) {
//			System.out.println(count);
//		}
		
		//String msg = "";
//		for (; !msg.equals("exit");) {
//				System.out.println("메세지입력 : ");
//				msg = sc.next();
//				System.out.println(msg);
		
		// 사용자에게 메세지를 입력받고 출력하는 기능
		// 사용자가 "끝" 이라는 메세지를 입력할때까지 입력받고 
		// 입력받은 내용 모두 출력하기 *단 끝메세지는 포함하지 않기!!
		
		String msg1 = "";
		sc.nextLine();
		String m = "";
		for (; !m.equals("끝");) {
			System.out.print("메세지 입력 : ");
			m = sc.nextLine();
			if (!m.equals("끝")) {
				msg1 += m;
			}
		}; System.out.println(msg1); 
	      
	}
		
	public void forApplication() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int su = sc.nextInt();
		for (int i = 1; i < su; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void empInputDate() {
		Scanner sc = new Scanner(System.in);
		
		// 사원 정보를 입력받는 기능을 구현하자
		// 3명의 사원정보를 입력받고 출력하는 기능
		// 입력정보 : 이름, 나이, 성별, 급여, 보너스(소수점)
		// 입력한 정보는 한번에 출력
		// public void empInputDate()
		// 버전업 입력전에 입력할 사원수를 입력받고 그 수만큼 입력 후 출력하기
		String result = "";
		System.out.print("사원수 입력 : ");
		int count = sc.nextInt(); 
		for (int i = 0; i < 3; i++) {
			System.out.println("=== 사원정보 ===");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			String age = sc.next();
			System.out.print("성별 : ");
			String gender = sc.next();
			System.out.print("급여 : ");
			int income = sc.nextInt();
			System.out.print("보너스 : ");
			double incentive = sc.nextDouble();
			result += name + " " + age + " " +  gender + " " +  income + " " + incentive + "\n";
			
		}System.out.println("=== 입력한 사원 정보 === ");
		System.out.println(result);
	}
	
	public void forApplication2() {
		// 숫자에 규칙이 있는 경우에 for문의 초기값을 활용할 수 있다.
		String msg = "안녕하세요 화요일이예요";
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(2));
//		System.out.println(msg.charAt(3));
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
		// 입력받은 문자에 알파벳 대문자가 포함되어있는지 확인하는 기능
		// abcAB
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String eng = sc.next();
		boolean flag = false;
		for (int i = 0; i <eng.length(); i++) {
				if (eng.charAt(i) >= 'A' && eng.charAt(i) <= 'Z') {
					System.out.println("대문자가 포함되어있습니다.");
				flag = true;
				}
				}System.out.println(flag ? "대문자 있어!" : "대문자없어!");
			}
	
		// 입력받은 문자열에 대문자와 소문자의 수를 구하는 기능
		// 문자열, 문자를 입력받아 문자열에 문자가 몇개 포함 되어 있는지 확인하는 기능
	//-------------------------------------------------------------------	
		public void forInfor() {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
				System.out.println();
			}
		// 구구단 출력하기 
		// 2단부터 9단까지 출력하기
			for (int i = 2; i < 10; i++) {
				System.out.println(i);
				for (int j = 1; j < 10; j++) {
					System.out.println(j);
					System.out.println(i + " * " + j + "= " + (i * j));
				}
			}
		
		String test = "apple";
		// test변수에 저장된 문자열에 중복값이 있는지 확인하는 로직
		for (int i = 0; i < test.length(); i++) {
			int count = 0;
				System.out.println(test.charAt(i));
				
				for (int j = 0; j < test.length(); j++) {
					
					if (i != j && test.charAt(i) == test.charAt(j)) {
						count++ ;
					}
					//System.out.print(test.charAt(j));
				}
		System.out.println(test.charAt(i) + "는 " + count + "개 반복");
		}
		
		//별 찍기!!!!
		// ****
		// ****
		// ****
		// ****
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		// *
		// **
		// ***
		// ****
		for (int i = 0; i < 4; i++) {			
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
		    }
			System.out.println();
		}
	
		}
		public void whileTest() {
			// while 활용하기
			// 반복문을 구현하는 방법 중 하나
			// while (조건문) { 반복실행 코드 }
			// 특정 조건에서 반복문을 실행할때 
			// 의도적인 무한루프를 실행할때 사용
			
			// 1부터 10까지 출력하기
//			for (int i = 0; i < 11; i++) {System.out.println();}
			
			int j = 1;
			while (j <= 10) {
				System.out.println(j);
				j++;
			}
			
			// 사용자가 끝이라고 입력할때까지 입력받는 기능
			Scanner sc = new Scanner(System.in);
			
			
			String m = "";
			String total = "";
			while (!m.equals("끝")) {
				System.out.print("메세지 입력 : ");
				m =sc.next();
				if (!m.equals("끝")) {
					total += m ;
				}
			System.out.println(total);
			
			}
			// 메뉴기능을 구현할때
			int menu = 0;
			while (menu != 9) {
				System.out.println("==== BS Lunch ====");
				System.out.println("1. 햄버거");
				System.out.println("2. 피자");
				System.out.println("3. 갈비탕");
				System.out.println("4. 순대국");
				System.out.println("9. 주문종료");
				System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			}
		
			
//			while (true) {
//				System.out.println("무한"); 
//			}
		
			
		}
		
			// 계속 계산할수 있는 계산기 프로그램 만들기
			// public void whileCalculater()
			// 두개의 정수, 연산자를 입력받아 계산해주는 기능
			// 계산이 끝나면 계속하시겠습니가? 문구출력 후
			// Y를 선택하면 한번더 실행, N선택하면 프로그램을 종료합니다. 출력후 종료
		public void whileCalculater() {
			Scanner sc = new Scanner(System.in);
					
					
				char choice;
				do {	
				choice = ' '; // 초기화 시켜주기
				System.out.print("1번째 정수 입력 : ");
				int su1 = sc.nextInt();
				System.out.print("2번째 정수 입력 : ");
				int su2 = sc.nextInt();
				System.out.print("연산자(+, -, /, %) : ");
				char op = sc.next().charAt(0);
				switch (op) {
				case '+' : System.out.println("" + su1 + op + su2 + "=" + (su1 + su2));break;
				case '-' : System.out.println("" + su1 + op + su2 + "=" + (su1 - su2));break;
				case '/' : System.out.println("" + su1 + op + su2 + "=" + (su1 / su2));break;
				case '*' : System.out.println("" + su1 + op + su2 + "=" + (su1 * su2));break;
				
				}
				while (choice != 'N' && choice != 'N') {
			System.out.println("계속하시겠습니까? (Y/N) : ");
			choice = sc.next().charAt(0);
			if (choice != 'N' && choice != 'N') {
				System.out.println("입력값은 Y와 N만 작성바랍니다.");
			}
			}			
			}while (choice == 'Y');
			
			System.out.println("프로그램을 종료하겠습니다.");
			
				} 
				public void continueBreakTest() {
				// 분기문 활용하기
				// contunue : 반복문에서 continue문을 만나면 아래코드를 생략하고 증감식으로 넘어감.
				// break : 반복문에서 break문을 만나면 끝나요! 끝!
				// 특정조건에서 반복문의 실행을 통제하기 위해 사용
				
				Scanner sc = new Scanner(System.in);
				System.out.print("입력문자 : ");
				String str = sc.nextLine();
				boolean flag = false;
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					char c = str.charAt(i);
				if (c >= 'A' && c <= 'Z') {
					flag = true;
				break;// 특정조건이 만족되면 바로 종료시키면 프로그램이 더빨라진다.																				
				}
				
				}System.out.println(flag ? "있다." : "없다");
				
				// 중첩반복문에서 이용하기
				 // break랑 똑같은 역할 
				for (int i = 2; i < 10; i++) {
					for (int j = 1; j < 10; j++) {
					if (i % 2 == 0) break;  {// t : break랑 똑같은 역할
					System.out.print(i + "X" + j + "=" + (i + j));
					}
				System.out.println();						
					}
				}
				
				// continue 
				for (int i = 0; i < 10; i++) {
					if (i % 2 == 0)  continue;
						System.out.println(i);						
					}
					for (int i = 2; i < 10; i++) {
						for (int j = 1; j < 10; j++) {
						if (j % 2 == 0) continue;
							System.out.println(i + "X" + j + "=" + (i + j));
						}
						System.out.println();
					}
					
					
				}
				
				// 자바에서 랜덤값을 출력하기
				// 숫자로 출력 - > 임의의 실수 (0~1)
				public void randomTest() {
				// 임의의 난수 출력하기
				// 1. math.random() 기능이용
				// 2. Random클래스를 이용하는 방법
				for (int i = 0; i < 3; i++) {
					System.out.println((int)(Math.random()*10));
		
				}
				// 랜덤값을 정수형으로 출력하기
				// Math.random()*10 0~9 이렇게 표시하게 된다.
				// Math.random()*20 -> 0~19
				// 1~10 -> Math.random()*10+1
				
				for (int i = 0; i < 5; i++) {
					System.out.println((int)(Math.random()*10)+1);
				}
				// Random클래스 이용하기
				// java.util.Random클래스
				System.out.println("Random클래스 이용");
				Random r = new Random();
				System.out.println(r.nextInt());
				System.out.println(r.nextInt(10)); // 0~9 
				System.out.println(r.nextInt(20)); // 0~19
				System.out.println(r.nextInt(20) + 1); // 1~19
				
				
				
				}
				
				
				}
				
					
		
		
		
		
		
		
		
		
		
		

		
		
	

	
	
	
	
	
	
	
		
		
		
		
	

