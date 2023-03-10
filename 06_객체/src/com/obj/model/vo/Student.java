package com.obj.model.vo;
 


public class Student {
	// 학생정보를 저장하는 클래스를 선언하고 -> com.obj.model.vo.Student
			// 이름, 나이 , 학년, 반, 키, 주소 저장
	
	public String name = "홍길동";
	public int age = 10;
	public int Class = 1;
	public int group = 3;
	public double height = 180.5;
	public String address = "";
	
	// 필드로 선언된 변수는 new 연산자로 생성을 하면
	// 기본값으로 초기화 된다. 초기부터 값을 대입하려면?? 여기 필드에 만들어 대입해주면 됨.
	

}
