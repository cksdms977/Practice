package com.bs.variable;

public class StringTest {
	public static void main(String[] args) {
		// 문자열 자료형 이용하기
		String name = "유병승"; // 
		// String 은 앞단어가 대문자이기에 class이다. -> (원래는) class는 new연산자를 이용해서 생성해서 써야함.
		// java에서 기본자료형처럼 사용할수 있게 해줌....
		
		name = new String ("김재훈");
		System.out.println(name);
		
		// 문자열 타입의 값에 + 연산을 하면 대상이되는 값을 결합해줌
		String msg = "유병승" + " java 선생님";
		System.out.println(msg);
		
		// 다른타입과 문자열타입에 + 연산을 하면??? - > 결합연산! 
		msg = 19 + "살 유병승";
		System.out.println(msg);
		
		int age = 19;
		name = "유병승";
		
		msg = name + age; // "유병승" + 19
		System.out.println(msg);
		
		msg = 20 + age + name; // +연산은 이항연산이기 때문에 int + int 값들은 서로 계산을 하게됨 
		System.out.println(msg); //39 유병승
		
		msg = 20 + (age + name); // ()를 넣어주면 우선적으로 처리해줌
		System.out.println(msg); //2019유병승
		
		// 출력해보기
		// 본인의 이름, 나이, 키, 주소, 전화번호를 각 변수에 저장하고 
		//* 데이터에 맞는 자료형으로 선택
		// 출력 결과 : 나의 이름은 OOO이고 나이는 OO살이고 키는 OOO.OO, 주소는 OOOO 성별은 O이다.
		
		String name1 = "김찬은";
		int age1 = 27;
		double height = 176.7;
		String address = "서울시 광진구 중곡동";
		char gender = 'M';
		String phone = "010-8455-3039";
				
		System.out.println("나의 이름은 " + name1 + " 나이는 " + age1 + " 키는 " 
							+ height + " 주소는 " + address + " 성별은 " + gender + "이다.");
		String print = "나의 이름은 " + name1 + " 나이는 " + age1 + " 키는 " 
				+ height + " 주소는 " + address + " 성별은 " + gender + "이다."; // 이렇게 출력해도 된다.
		
		// String은 클래스로 유용한 기능을 가지고 있음
		// 1. String 변수에 저장된 문자열의 길이를 알려주는 기능(메소드)
		// -> length(); 
		// "문자열".length();
		// 문자열변수명.length();
		System.out.println("유병승".length());
		System.out.println(address.length());
		int count = address.length(); // 문자 길이를 알기위해서 length를 사용 int를 사용함
		System.out.println(count);
		
		// 2. 문자열 변수에 저장된 문자열의 특정문자만 가져오는 기능
		// charAt(번호)
		// "이다영".charAt(0) -> 이
		// name.charAt(1) -> 병
		System.out.println("이다영".charAt(0));
		System.out.println(name1.charAt(1));
		char ch = "이다영".charAt(2);
		System.out.println(ch);
		//주의 없는 번호를 대입하면 에러가 발생함.
//		ch = "윤지환".charAt(3); // 정상적으로 처리가 안됨 "윤지환"이름에는 012까지 범위 밖에 없음
//		System.out.println(ch);
		
		
		
		
		
	}

}
