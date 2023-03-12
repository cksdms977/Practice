package com.bs.practice.chap02.loop;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			System.out.println(i);
			
		}if (su < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
	}
	public void practice2() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		int su; 
		while(true) {
			System.out.println("수 입력 : ");
			su = sc.nextInt();
		
			if (su >=1) {
				break;
				
			}
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
		for (int i = 1; i <= su; i++) {
			System.out.println(i + " ");
			
		}
		}		
		
	
	
	

	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫지를 입력하세요 : ");
		int su = sc.nextInt();
	
		if (su < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
		
		}else {
			for (int i = su; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		
		
	}
		
	
	
	
	public void practice4() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		do {
			System.out.println("1이상의 숫자를 입력해주세요 : ");
			su = sc.nextInt();
		if (su < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
		} while (su < 1);
		
		for (int i = su; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
		
	}
	
		public void practice5() {
			//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
			Scanner sc = new Scanner(System.in);
			System.out.print("정수하나를 입력하세요 : ");
			int su = sc.nextInt();
			
			int sum = 0;
			for (int i = 1; i < su; i++) {
				System.out.print(i + " + ");
				sum += i;
			}
			System.out.print(" = " + sum);
		}
		
		public void practice6() {
//			사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
//			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 정수 값 : ");
			int su = sc.nextInt();
			System.out.print("두번째 정수 값 : ");
			int su2 = sc.nextInt();
			
			if (su < 1 || su2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				int startsu = su < su2 ? su : su2;
				int endsu = su > su2 ? su : su2;		
			
			for (int i = startsu; i <= endsu; i++) {
					System.out.print(i + " ");
			}
			}
			
		}
		
		public void practice7() {
//			위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//			“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
			Scanner sc = new Scanner(System.in);
			
			int su;
			int su2;
			
			while(true) {
				System.out.print("첫번 째 정수값 : ");
				su = sc.nextInt();
				System.out.print("두번 째 정수값 : ");
				su2 = sc.nextInt();
				if (su >= 1 && su2 >= 1) {
					break;
				}
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			int starsu = su < su2 ? su : su2;
			int endsu = su > su2 ? su : su2;
			
			for (int i = starsu; i < endsu; i++) {
				System.out.print(i + " ");
			}
				
				
				
			}
		public void practice8() {
//			사용자로부터 입력 받은 숫자의 단을 출력하세요

			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int number = sc.nextInt();
			System.out.println("=== " + number + " 단 ===");
			for (int i = 1; i <= 9 ; i++) {
				System.out.println(number + " * " + i + " = " + (number * i));	
			}
			
				}
		public void practice9() {
//			사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//			단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int number = sc.nextInt();
			
			if (number <= 9) {
				System.out.println("=== " + number + " 단 ===");
				for (int i = 1; i <= 9; i++) {
					System.out.println(number + " * " + i + " = " + (number * i));	
				}
			}else {
				System.out.print("9이하의 숫자만 입력해주세요.");
			}
			
			}
			
			public void practice10() {
//				위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//				“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.				
				
				Scanner sc = new Scanner(System.in);
				
				int number;
				do {
					System.out.print("숫자 :");
					number = sc.nextInt();
					
					if (number <= 9) {
						System.out.println("=== " + number + " 단 ===");
						for (int i = 1; i <= 9; i++) {
							System.out.println(number + " * " + i + " = " + (number * i));	
						}
					}else {
						System.out.print("9이하의 숫자만 입력해주세요." + "\n");
					}
					
				} while (number > 9);
				
			}
			
			public void practice11() {
//				사용자로부터 시작 숫자와 공차를 입력 받아
//				일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. 
//				단, 출력되는 숫자는 총 10개입니다.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("시작 숫자 : ");
				int starsu = sc.nextInt();
				
				System.out.println("공차 : ");
				int gongcha = sc.nextInt();
				
				for (int i = 0; i < 10; i++) {
					int result = starsu + (i * gongcha);
					System.out.println(result);
				}
			}
			
			public void practice12() {
//				정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요. 
//				단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며 
//				exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//				또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//				“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//				없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고 
//				두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
				
				Scanner sc = new Scanner(System.in);
				
				int su;
				int su2;
				String operator;
				
				while(true) {
					System.out.print("정수1 : ");
					su = sc.nextInt();
					System.out.println("정수2 : ");
					su2 = sc.nextInt();
					System.out.println("연산자 입력(+, -, *, /, %) :");
					operator = sc.next();
				if (operator.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				
				int result = 0;
				switch(operator) {
				case "+" : result = su + su2; break;
				case "-" : result = su - su2; break;
				case "*" : result = su * su2; break;
				case "/" : if (su2 == 0) {
					System.out.println("0으로 나눌수가 없습니다. 다시 입력해주세요");
					continue;
				} 
				result = su / su2; break;
				case "%" : result = su % su2; break;
				default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
				}
				System.out.println(su + " " + operator + " " + su2 + " = " + result);
				
				
				
				}
				
				
				}
			public void practice13() {
				// 별모양 그리기 
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 : ");
				int su = sc.nextInt();
				
				for (int i = 0; i < su; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				
			}
			
			public void practice14() {
				// 별모양 그리기 2 
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 :");
				int su = sc.nextInt();
				
				for (int i = 0; i < su; i++) {
					for (int j = su; j > i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
			public void practice15() {
				Scanner sc = new Scanner(System.in);
//				사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//				단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
				System.out.print("숫자: ");
		        int su = sc.nextInt();
		        
		        boolean flag = true;
		        
		        if (su < 2) {
		        	System.out.println("잘못 입력하셨습니다.");
		        	
		        }else {
					for (int i = 2; i < su; i++) { // 1과 자기 자신을 제외한 수를 for문으로
						if (su % i == 0) {
							flag = false;
							break;
						}
					}
					if (flag) {
						System.out.println("소수입니다.");
					}else {
						System.out.println("소수가 아닙니다.");
					}
					
		        }
			}
			
//				int su = 2; // 초기화!! 아무값이나 넣어주자 for문 반복할수 있는 값으로만 어차피 밑에 입력값에서 su = sc.nextInt로 초기화 시키기에
//			
//				for (int i = 1; i < su; i++) {
//					System.out.print("입력 값 : ");
//					su = sc.nextInt();
//			
//					if (su < 2) {
//						System.out.println("잘못입력하였습니다.");
//						
//					}else if ((su % i == su) && (su % i == 1)) {
//						
//						System.out.println("소수입니다.");
//						
//					}else {
//						System.out.println("소수가 아닙니다.");
//					}
//					
//					}
					
					
					
				
			public void practice16() {
				// 입력한 수가 2보다 작은 경우
				// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
				
				Scanner sc = new Scanner(System.in);
				
				
				while(true) {
					System.out.print("수 입력 : ");
					 int su = sc.nextInt();
								
						if (su < 2) {
							System.out.println("잘못입력했습니다.");
							continue;
						}
							
						boolean flag = true;
						
						 for (int i = 2; i < su; i++) {
								 	if (su % i == 0) {
										flag = false;
											break;
										}
						 			}
								 		if (flag) {
											System.out.println("소수입니다.");
											break;
										}else {
											System.out.println("소수가 아닙니다."); 
											break;
										}
								 	
								 	
										} 			
									} 
							 
						
						 
			
			public void practice17() {
//				2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//				단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//				ex.
//				숫자 : 11 
//				2 3 5 7 11 
//				2부터 11까지 소수의 개수는 5개입니다.
				
				Scanner sc = new Scanner(System.in);
				
				int count = 0; 
				int su = 0;
				boolean flag = true;
				
				System.out.print("숫자 : ");
				su = sc.nextInt();
				
				if (su < 2) {
					System.out.println("잘못 입력하셨습니다.");
				}else {
					for (int i = 2; i <= su; i++) {
						flag =true;
						for (int j = 2; j < i; j++) {
							if (i % j == 0) { // 소수가 아닌값들
								flag = false;
								break;
							}
						
						}
					
						if (flag) {
							System.out.print(i + " ");
							count++;
						}
						
						System.out.println();	
					System.out.println("2부터 " + su + "까지 소수의 개수는 " + count + "개입니다."); break;
					}
					
				}
				
				
				}
			
			
				
				
//				int su = 0;
//				int count = 0;
//				
//				while (true) {
//					System.out.print("숫자 : ");
//					su = sc.nextInt();
//					
//					boolean flag = true;
//					
//						if (su < 2) {
//							System.out.println("잘못 입력하셨습니다."); 
//							continue;
//							
//					}else  {
//						for (int i = 2; i <= su; i++) {
//							if (su % i == 0) { // 소수가 아닌값
//								flag = false;
//								count++;
//								break;
//							}else {
//								System.out.print(i + " ");
//							}break;
//							
//						
//							}
//						}
//				}
			
					
			public void practice18() {
//				1부터 사용자에게 입력 받은 수까지 중에서
//				1) 2와 3의 배수를 모두 출력하고
//				2) 2와 3의 공배수의 개수를 출력하세요.
				Scanner sc = new Scanner(System.in);
				
				System.out.println("자연수 하나를 입력 : ");
				int su = sc.nextInt();
				
				int count = 0;
				for (int i = 1; i <= su; i++) {
					if (i % 2 == 0 && i % 3 ==0) {
						System.out.print(i + " ");
						count ++;
					}else if (i % 2 == 0 || i % 3 == 0) {
						System.out.print(i + " ");
					}
				} System.out.println("count : " + count);
				
				
			}
			
			public void practice19() {
				Scanner sc = new Scanner(System.in);
				// 별 찍기
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4 - i ; j++) {
						System.out.print(" ");
					}for (int k = 0; k <= i ; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				
				
				
						
					}
			
			public void practice23() {
//				1부터 100까지 숫자를 출력하세요.
//
//				100부터 0까지 숫자를 출력하세요.
//
//				1부터 100까지 짝수만 출력하세요.
//
//				1부터 100까지의 합을 출력하세요.
//
//				입력 받은 정수까지의 짝수를 출력하세요
//
//				입력 받은 정수까지의 짝수의 합을 출력하세요
//
//				정수를 입력 받아 1부터 입력 받은 정수까지 수를 
//				홀수와 짝수를 나눠서 짝수면 “박”, 홀수면 “수”를 
//				출력 하세요.
//				  
//				  예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력
				
				for (int i = 1; i <= 100; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				for (int i = 100; i >= 1; i--) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				for (int i = 2; i <= 100 ; i+=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				for (int i = 1; i <= 100; i+=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum += i;
				}
				System.out.println("1~100까지의 합 : " + sum);
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("입력 수 : ");
				int su = sc.nextInt();
				
				for (int i = 2; i <= su; i+=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				System.out.print("입력 수 : ");
				int su2 = sc.nextInt();
				
				int sum2 = 0; 
				for (int i = 2; i <= su; i+=2) {
					sum2 += i;
				}
				System.out.print("입력받은 짝수의 합 : " + sum);
				
				System.out.println();
				
				System.out.print("정수 입력 : " );
				int su3 = sc.nextInt();
				
				for (int i = 1; i < su3; i++) {
					if (su3 % 2 == 0 ) {
						System.out.print(su3 + "입력 : 박");
					}else {
						System.out.print(su3 + "입력 : 수");
					}
				}
				System.out.println();
				
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				
				if (num > 1 && num < 10) {
					
					for (int i = 1; i <= num; i++) {
						System.out.println(num + " * " + i + " = " + (num * i));
				}
				
			}else {
				System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
			}
				
			System.out.println("----------------");	
//			문자열과 문자열에서 검색될 문자를 입력 받아 문 
//			자열에 그 문자가 몇 개이었는지 개수를 확인하는 
//			프로그램을 작성하세요.
//			단 문자열은 영문자만 작성 영문자 이외의문자가 있으면 영문자가 아닙니다 출력
//
//			출력 예)
//			   문자열 입력 : application
//				문자 입력 : p
//				포함된 갯수 : 2 개
//				====================
//				문자열 입력 : apple_test123
//				문자 입력 : p
//				영문자가 아닙니다.
			System.out.print("문자열 입력(영문자) : ");
			String str = sc.next();
			
			System.out.print("문자 입력 : ");
			char ch2 = sc.next().charAt(0);
			
			int count = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
					System.out.println("영문자가 아닙니다.");
					
					break;
					
				}else if (ch2 == str.charAt(i)) {
					count++;
				}
				
			}
			System.out.println("포함된 갯수 : " + count); 
			
			}
			
			public void practice24() {
				//5명의 회원정보를 입력 받아 저장하고 출력하는 
				//프로그램을 만드세요
				 //입력 : 이름, 나이, 주소, 키, 몸무게, 연락처

				//출력 예) 
				//=========== 저장회원==========
				//홍길동 19세 서울시 강남구 170cm 68kg 010…
				//임걱정 20세 경기도 수원시 180cm 75kg 010…

				Scanner sc = new Scanner(System.in);
				
				  String[] name = new String[5];
			        int[] age = new int[5];
			        String[] address = new String[5];
			        double[] height = new double[5];
			        double[] weight = new double[5];
			        String[] phonenumber = new String[5];

			        System.out.println("=========== 저장회원 ==========");

			        for (int i = 0; i < 5; i++) {
			            System.out.print("이름: ");
			            name[i] = sc.next();

			            System.out.print("나이: ");
			            age[i] = sc.nextInt();

			            System.out.print("주소: ");
			            address[i] = sc.next();

			            System.out.print("키: ");
			            height[i] = sc.nextDouble();

			            System.out.print("몸무게: ");
			            weight[i] = sc.nextDouble();

			            System.out.print("연락처: ");
			            phonenumber[i] = sc.next();
			        }

			        System.out.println("=========== 저장회원 ==========");
			        for (int i = 0; i < 5; i++) {
			            System.out.println(name[i] + " " + age[i] + "세 " + address[i] + " " +
			                    height[i] + "cm " + weight[i] + "kg " + phonenumber[i]);
			        }
			    }
				
			public void practice25() {
				Scanner sc = new Scanner(System.in);
				//몬스터 사냥하기 게임의 사냥하는 기능을 만드시오.

				//출력 예) 
				//사용법 
				//0. 사냥시작 1. 오크사냥 2. 용사냥 3. 사람사냥 99.끝내기
				//선택 : 
				//사냥을 시작합니다.
				//입력 : 1
				//오크사냥완료 +1 exp
				//입력 : 2
				//용 사냥 완료 +15exp
				//입력 : 99
				//사냥을 마쳤습니다.
				//사냥한 몹의 수는 2마리, 획득한 경험치는 16exp입니다.
				
				System.out.println("사용법");
				System.out.print("0. 사냥시작 1. 오크사냥 2. 용사냥 3. 사람사냥 99. 끝내기 ");
				System.out.println();
				int exp = 0;
				int monsterkillnumber = 0;
				
				
				while (true) {
					//System.out.print("선택 : ");
					int choice = sc.nextInt();
					
					switch (choice) {
					case 0 : System.out.println("사냥을 시작합니다."); break;
					case 1 : System.out.println("오크사냥완료 +1 exp"); 
							 exp += 1;
							 monsterkillnumber += 1;
							 break;
					case 2 : System.out.println("용 사냥 완료 +15 exp");
							 exp += 15;
							 monsterkillnumber += 1;
							 break;
					
					case 3 : System.out.println("사람 사냥 완료 +3 exp"); 
							 exp += 3;
							 monsterkillnumber += 1;	
							 break;
					case 99 : System.out.println("사냥을 마쳤습니다. ");
							  System.out.println("사냥한 몸의 수는 " + monsterkillnumber + "마리, 획득한 경험치는 " + exp + "exp입니다.");
							  return;
					default : System.out.println("잘못된 입력어 입니다.");break;
				
					}
					
					
					
					
					
				}
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
				
				
			}			
			
			
			
					
			
				
			
		
			
			
			
			
			
		
		

	
