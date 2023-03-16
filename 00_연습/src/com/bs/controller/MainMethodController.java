package com.bs.controller;

import java.util.Iterator;

public class MainMethodController {
	
	public MainMethodController() {}
	
//	1. 문자열 두개을 전달받고 두 문자열을
//	   결합하고 리턴해주는 매소드 만들기!
	
	public int string(int su, int su2) {
		int result = su + su2;
		
		return result;
	}
	
//	2. 정수 두개를 전달받아 첫번째수부터 
//	   두번째수까지 합을 리턴해주는 매소드
//	   만들기 
//	   단, 무조건 첫번째수가 커야함.
//	   만약 첫번째수가 작으면 
//	   계산할 수 없습니다 출력후 
//	   0을 반환!
	
	public int number(int su, int su2) {
		
		
			if (su < su2) {
				System.out.println("계산할 수 없습니다.");
				return 0;
			}
			int sum = 0;
			if (su > su2) {
				for (int i = su2; i <= su; i++) {
					sum += i;
			}
		}return sum;
	}
//	문자 한개를 전달받아 영문자인지 확인
//	후 결과를 리턴해주는 매소드 만들기
//	true/false
	
	public char string2(char ch) {
		
		if ((ch <= 'z' || ch >= 'a') && (ch >= 'A' || ch <= 'Z'))  {
			System.out.println("true");
		
		}else {
			System.out.println("false");
		}return ch;
		
	}
//	문자열 두개를 입력받아 두개의 값이 같은지
//	확인해주는 매소드 만들기 
//	같으면 true/ 다르면 false 반환
	
	public static boolean string3(String str, String str2) {
		
		boolean flag = true;
		if (str.equals(str2)) {
			return flag;
			
		}else {
			flag = false;
			return flag;
		}
		
	}
	
	
		
//		1. 전달된 메세지를 출력하는 메소드 구현
		
		public void string4() {
			System.out.println("안녕하세요");
		}
		
//		2. 1~10까지 합을 반환하는 메소드구현
		
		public int Sum() {
			int sum = 0;
			for (int i = 1; i <=10; i++) {
				sum += i;
			}
			return sum;
		}
//		3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
		
		public int trueandfasle(int su) {
			
			if (su % 2 == 0) {
				System.out.print("짝수 ");
			}else {
				System.out.print("홀수 ");
			}return su;
			
			
		}
		
//		4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
		
		public String string5(String str) {
			
			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
					|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ) {
					return "있다";
					
				}
			}
			return "없다";
			
		}

//		5. 문자열과 문자를 전달받아  문자열에 문자가 몇개있는지 출력하는 메소드구현
		
		public void string6(String str2, char ch) {
			
			int count = 0;
			for (int i = 0; i < str2.length(); i++) {
				if (ch == str2.charAt(i)) {
					count ++;
				}
				
			}System.out.println("문자열에 들어가있는 문자는 "+ count + "개");
		}

//		6. 전달된 정수의 구구단을 출력하는 메소드 구현

		public void gugudan(int su) {
		
			for (int i = 1; i <= 9; i++) {
				System.out.println(su + "의 구구단은 " + su + " x " + i + " = " + (i * su));
			}
		}
		
//		7. 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		// 중복값 없이 하는게 아직도 이해가 잘 되지 않습니다ㅠ
		public void lotto() {
			int Lotto[] = new int[6];
			
			for (int i = 0; i < Lotto.length; i++) {
				Lotto[i] = (int) (Math.random()*10) + 1;
			}
			boolean flag = true;
			for (int i = 0; i < Lotto.length; i++) {
				for (int j = 0; j < i; j++) {
					if (Lotto[i] == Lotto[j]) {
						flag = false;
						i--;
						break;
					}
				}
				System.out.print(Lotto[i] + " ");
			}
			
			for (int i = 0; i < Lotto.length; i++) {
				for (int j = 0; j < Lotto.length; j++) {
					if (Lotto[i] < Lotto[j]) {
						int temp = Lotto[i];
						Lotto[i] = Lotto[j];
						Lotto[j] = temp;
					}
				}
			}
			for (int i = 0; i < Lotto.length; i++) {
				System.out.print(Lotto[i] + " ");
			}
			System.out.println();
			
		}
	
	
}
	

