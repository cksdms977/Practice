package com.bs.practice.chap02.loop;

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
			}
			
		
			
			
			
			
			
		
		

	
