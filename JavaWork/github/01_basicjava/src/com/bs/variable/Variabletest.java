package com.bs.variable;

public class Variabletest {
	public static void main(String[] args) {
		// 변수선언, 값 대입(저장)하기
		int age; 
		age = 19;
		// 변수를 출력하기
		// age변수의 값(저장된)을 출력하기
		System.out.println(age);
		// 변수값을 저장할때는 변수의 자료형과 리터럴의 자료형이 같아야한다.
//		age = 3.14; // 변수타입이 다르기때문에 출력이 안됨
		
		// 문자, 문자열 저장하기
		
		char alpha; 
		alpha = 'A';
		System.out.println(alpha);
		
		String address; 
		address = "경기도 시흥시";
		System.out.println(address);
		
		 // 실수 저장하기
		float height; 
		height = 180.5F; // 뒤에 F를 붙여줘야 한다. 왜냐하면 원래 180.5는 double 형이기 때문이다. 
		System.out.println(height);
	
		double weight;
		weight = 65.5;
		System.out.println(weight);
		
		// 변수는 한개값만 저장이 가능하다.
		age = 50;
		System.out.println(age); // 위에서 출력한 age = 19 값은 없어지고 50으로 출력함
		
		// 변수에 값을 대입하기 위해서는 반드시 먼저 선언이 되어있어야 한다.
//		name = "유병승"; 이렇게 하면 변수가 출력이 안된다. 변수를 먼저 선언해줘야 한다.
//		String name; 
		
		
		long account; 
//		accunt = 300000000000; // 그냥 숫자 쓰면 int로 인식한다 만약 더 많은 범위를 사용하기 위해서는 뒤에 L을 넣어준다 
		account = 30000000000L; // 그냥 숫자 쓰면 int로 인식한다 만약 더 많은 범위를 사용하기 위해서는 뒤에 L을 넣어준다 
		
		//변수를 선언과 동시에 값을 대입할 수 있다.
		String email = "cksdms977@naver.com";
		System.out.println(email);
		
		// 다수 값을 저장
		int a, b, c; 
		a = 100;
		b = 200;
		c = 300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
			
		
		byte bnum;
		bnum = 100; // java에서 byte,short는 리터럴에 타비표시를 하지 않아도 자동으로 리터럴 자료형을 변환하여 대입해줌.
		System.out.println(bnum);
		short snum = 500;
		System.out.println(snum);
//		bnum = 128; // 단 해당하는 범위에 맞아야 한다. byte 표시할수 있는 영역을 넘어서면 출력이 안된다.
		
		// 상수 선언하기 : 선언된 저장공간에 한번만 값을 대입할 수 있는 것
		// 대입 후 수정은 불가능함. 
		// 에러코드, 지정된 레벨저장할때 사용 (명칭쓸때 무조건 대문자로 쓰기)
		final int AGE;
		// final String ADMIN_NAME; // 스트링 변수를 쓸때 이렇게 _를 사용해준다
		AGE = 19;
		System.out.println(AGE);
		// AGE = 50; // 파이널 변수는 최초의 값을 고정하기 때문에 이후에 변수값을 바꿀수 없다.
		
		
		
		
	}

}
