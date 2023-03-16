package com.bs.run;

import com.bs.controller.MainMethodController;

public class Main {
public static void main(String[] args) {
//	프로젝트 새로 생성하고
//	실행용 패키지/클래스와 
//	기능제공용 패키지/클래스 생성
//	*명칭은 스스로 정해보세요
//
//	문자열 두개을 전달받고 두 문자열을
//	결합하고 리턴해주는 매소드 만들기!
//
//	정수 두개를 전달받아 첫번째수부터 
//	두번째수까지 합을 리턴해주는 매소드
//	만들기 
//	단, 무조건 첫번째수가 커야함.
//	만약 첫번째수가 작으면 
//	계산할 수 없습니다 출력후 
//	0을 반환!
//
//	문자 한개를 전달받아 영문자인지 확인
//	후 결과를 리턴해주는 매소드 만들기
//	true/false
//
//	문자열 두개를 입력받아 두개의 값이 같은지
//	확인해주는 매소드 만들기 
//	같으면 true/ 다르면 false 반환
	
MainMethodController mmc = new MainMethodController();

//문자열 두개을 전달받고 두 문자열을
//결합하고 리턴해주는 매소드 만들기!
int result = mmc.string(1, 2);
System.out.println(result);

//정수 두개를 전달받아 첫번째수부터 
//두번째수까지 합을 리턴해주는 매소드
//만들기 
//단, 무조건 첫번째수가 커야함.
//만약 첫번째수가 작으면 
//계산할 수 없습니다 출력후 
//0을 반환!
int result2 = mmc.number(4, 3);
System.out.println(result2);
	
//문자 한개를 전달받아 영문자인지 확인
//후 결과를 리턴해주는 매소드 만들기
//true/false	
char result3 = mmc.string2('c');
System.out.println(result3);

//문자열 두개를 입력받아 두개의 값이 같은지
//확인해주는 매소드 만들기 
//같으면 true/ 다르면 false 반환
boolean result4 = mmc.string3("안녕하세요", "안녕하요");
System.out.println(result4);



//
//		각 매소드는 모드 외부에서 호출이 가능하게 설정하고 메소드명은 임의로 작성
//
//		1. 전달된 메세지를 출력하는 메소드 구현

		mmc.string4();
		
//
//		2. 1~10까지 합을 반환하는 메소드구현
		int result5 = mmc.Sum();
		System.out.println(result5);
		
//		3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
		int result6 = mmc.trueandfasle(4);
		System.out.println(result6);
		
//		4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
		String result7 = mmc.string5("안녕하a");
		System.out.println(result7);
		
//		5. 문자열과 문자를 전달받아  문자열에 문자가 몇개있는지 출력하는 메소드구현
		mmc.string6("안녕하세요", '안');
		
//		6. 전달된 정수의 구구단을 출력하는 메소드 구현
		mmc.gugudan(result2);
		
//		7. 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		mmc.lotto();
		
		
		
		
		
		
		
		
		
		
		
	}


}

