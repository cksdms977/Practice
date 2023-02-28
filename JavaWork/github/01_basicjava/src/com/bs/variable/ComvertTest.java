package com.bs.variable;

public class ComvertTest {
	public static void main(String[] args) {
		// 형변환에 대해서 알아보자
		// 특정연산을 실행할때는 피연산자의 타입이 동일해야 한다.
		
		int num = 100;
		long lnum = num;
		System.out.println(10 + 180.5);// 앞에 10을 int -> double 형태로 자동으로 바꿔줌 10.0
		float fnum = lnum;
		System.out.println(fnum);
		
		// 강제 형변환
		int num2 = (int)180.5;
		System.out.println(num2);
		
		int test = 290;
		byte bnum = (byte)test; // 더 작은 범위의 변수값을 넣을때 데이터에 손실발생
		System.out.println(bnum);
		
		// 계산에서 강제적 형변환
		// 성적 계산할때 평균 계산
		int kor = 90, eng = 54, math = 49;
		System.out.println((kor + eng + math)/3); // 원래는 64.3333333..... int로 나누었기때문에 int 로 출력 -> 그래서 둘중 한개를 double값으로 변경해주면 자동 형변환됨
		System.out.println((kor + eng + math)/3.0);
		System.out.println((double)(kor + eng + math)/3);
		
		// 단일문자(char) 형변환
		// char 내부적으로 코드표에 있는 숫자를 저장
		char ch = 'A';
		int chInt = ch;
		System.out.println(chInt);
		chInt = 66;
		System.out.println(chInt);
		System.out.println((char)chInt); // 앞에 char넣어주면 코드값으로 처리해줌.
		ch++; // (ch+1) 
		System.out.println(ch);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ch++);
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
}
