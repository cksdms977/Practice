package com.bs.variable;

public class BasicVariable {
	public static void main(String[] args) {
		// 변수 선언하기 (램 저장공간에 변수를 확보해 놓기만 해노음)
		// 각 자료형별 변수를 선언해보자.
		
		// 1. 논리형 : true, false 데이터를 저장하는 저장공간
		// 크기 : 1byte
		// 명칭 : boolean
	
		boolean flag; // 램 메모리 공간안에 변수를 선언한것 
		
		// 2. 숫자형 변수 선언
		// 정수형 : byte(1byte). short(2byte), int(4byte), long(8byte) 
		// -> 기본적으로 숫자값을 저장할때는 int형을 많이 사용함.
		byte bnum; // byte[] 바이너리파일을 저장할때 많이 사용 (사진, 동영상, 음악 .... )
		short snun; 
		int inum; // 일반적인 숫자값을 저장할때 사용
		long lnum;	// int 를 넘어서는 값을 저장할때 사용
		

		// 실수형 : float(4byte 크기의 실수를 저장), double(8byte 크기의 실수를 저장)
		// -> 실수형은 실제 값이 아닌 계산에 필요한 값을 저장 (지수, 가수) 
		float fnum;
		double dnum;
		
		// 문자, 문자열 : char(단일문자=한개의 문자를 변환), String(문자열을 저장할때 사용=단어, 문장)
		// -> 코드표에 있는 숫자로 저장이 된다.
		char ch;
		String st;
		
		// 1. 변수명은 대소문자를 구분한다. (명칭의 길이에는 제한이 없다.)
		int testNum;
		int testnum; 
		double test;
		// 2. 예약어를 변수명으로 사용할수 없다.
//		char public; // 이렇게 사용 못함
//		char if; // 사용할수 없다
		
		// 3. 변수명의 첫글자를 숫자로 사용할수 없다.
//		boolean 1flag; // 첫글자 숫자쓰니까 안됨
		boolean flag1; // 첫번째만 아니면 숫자 써도됨
		
		// 4. 변수명에 특수기호는 _ , $만 사용이 가능하다.
		byte _test;
		byte $tset;
		// byte #test; // 이건 사용 X
		byte t_est;
		byte tes$t;
		// -> 이 두가지 특수기호 빼고 다른건 절대 아노딤
		
		// 5. 동일영역내부({}안)에서 변수명은 중복될수 없다.
		// String t_est; // main 영억안에서는 중복변수명을 사용 못함 (무조건 {}같은 영역 밖에서 사용해야함)
//		if(t_es() {
//			int tes$t;
//		}
//		
		// 변수선언할때 동이랒료형에 대한 여러 변수를 한번에 선언
//		int a; 이렇게 한번 하기 보다
//		int b;
//		int c;
//		int d;
//		int e;
		int a,b,c,d,e; // 이렇게 한번에 선언 하기 
		
		// 

		
		
		
	} // main 닫기

}
