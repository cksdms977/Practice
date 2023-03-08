package com.bs.practice.chap02.loop;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

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
		
		int su = 0;
		boolean flag = false;
		do {
			System.out.print("숫자를 입력해주세요 : ");
			su = sc.nextInt();
			if (su >= 1) {
				flag = true;
				
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		} while (flag);
		
		for (int i = 1; i <= su; i++) {
			System.out.println(i + " ");
		}
	
	}
	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int su = sc.nextInt();
		for (int i = 1; i <= su; i++) {
			System.out.println(i);
		}
		if (su < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
		
		
		
	}
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수하나를 입력하세요 : ");
			int su = sc.nextInt();
			for (int i = 1; i < su; i++) {
				su += sc.nextInt();
				System.out.print(su);
			}
		}
		
		public void practice15() {
			Scanner sc = new Scanner(System.in);
//			사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//			단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
			
			
			int su = 2; // 초기화!! 아무값이나 넣어주자 for문 반복할수 있는 값으로만 어차피 밑에 입력값에서 su = sc.nextInt로 초기화 시키기에
		
			for (int i = 1; i < su; i++) {
				System.out.print("입력 값 : ");
				su = sc.nextInt();
		
				if (su < 2) {
					System.out.println("잘못입력하였습니다.");
					
				}else if ((su % i == su) && (su % i == 1)) {
					
					System.out.println("소수입니다.");
					
				}else {
					System.out.println("소수가 아닙니다.");
				}
				
				}
				
				}
				
			
		public void practice16() {
			// 입력한 수가 2보다 작은 경우
			// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
			
			Scanner sc = new Scanner(System.in);
			
			boolean flag = true;
			
			while(flag) {
				System.out.print("입력 값 : ");
				int su = sc.nextInt();
							
					if (su < 2) {
						System.out.println("잘못입력했습니다.");
					}
					for (int i = 1; i < su; i++) {
						
//						if (su / i == su && su / i == 1) {
//							System.out.println("소수입니다.");break;
//						}else {
//							System.out.println("소수가아닙니다.");
//						}break;
					}flag = false;
					
				}
			
					
				}
				
		
		public void practice17() {
//			2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//			단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			boolean flag = true;
			int count = 0;
			
			while (flag) {
				System.out.print("숫자 : ");
				num = sc.nextInt();
				
				for (int i = 1; i < num; i++) {
					if (num < 2) {
						System.out.println("잘못 입력하셨습니다."); 
				}else if (num / i == num && num / i == 1) {
					System.out.println("소수입니다."); break;
				}else {
					System.out.println("소수가 아닙니다."); break;
				}
					
				}
					for (int i = 2; i <= num; i++) {
						System.out.print(i + " ");
						
						
					}System.out.println(); 
					
					
				
			}
			
			
		}
		
		public void practice18() {
//			1부터 사용자에게 입력 받은 수까지 중에서
//			1) 2와 3의 배수를 모두 출력하고
//			2) 2와 3의 공배수의 개수를 출력하세요.
			Scanner sc = new Scanner(System.in);
			
			
			
		
		}
		
			
			}
			
			
			
		
		
		
	
	
	
