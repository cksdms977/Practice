package com.obj.basiccontroller;

public class FieidTestClass {
		// 클래스에서 필드(멤버변수)선언하기
		// 클래스의 기능에 다라 저장할 데이터가 있다면? 필드를 선언한다. 그래서 관리한다
		// 필드 = 변수임 , 필드 선언하는 방식은? 
		// 변수선언과 비슷하다, 대신 선언부앞에 접근제한자를 사용한다(무조건써야함)
		// 접근제한자는 
		// public : 모든패키지에서 직접접근하여 데이터를 저장, 수정할 수 있음
		// protected : 상속받은 클래스 또는 같은패키지에 있는 클래스에서 직접접근해서 데이터를 저장, 수정할수있음
		// default(생략) : 같은 패키지에 있는 클래스에서 직접접근해서 데이터를 저장, 수정할 수 있음
		// private : 클래스 내부에서만 직접접근해서 데이터를 저장, 수정할수있음
		// 객체지향의 정보 은닉으로 일반적인 클래스의 필드는 모두 private으로 선언함!!!
	
		public int age;
		String name; // public안썼으니 default임
		private char gender; // 이건 그냥 코드자체이고 안에 아무것도 없음 이용하려면 객체화해야함(new 써서)
		
		public final double HEIGHT = 180.5; // 여기서 상수(하나의 고정값만 하기를 원한다면)
		// -> 여기서 상수(final 고정값은) 반드시 선언과 동시에 초기화를 해줘야 한다.!!!
		
		
		{
			System.out.println(gender);
			gender = '여'; // private 여기는 실행이 된다.
		}
	

}
