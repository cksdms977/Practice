package com.obj.run;


import java.rmi.StubNotFoundException;

import com.obj.basiccontroller.BaseBallPlayer;
import com.obj.basiccontroller.BasicTestClass;
import com.obj.basiccontroller.FieidTestClass;
// import com.obj.basiccontroller.DefaultTestClass;
import com.obj.model.vo.Student;


public class Main {
	public static void main(String[] args) {
		// 프로젝트내부에 선언된 클래스는 반드시 생성해야만 이용이 가능하다.
		// 클래스를 생성하는 방법은? 
		// new 연산자를 이용해서 생성한다. -> new 클래스명() <- 기본클래스 생성하는 방법(default생성)
		
		// 클래스 선언부에 있는 접근 제한자에 따라서 생성해서 이용할수 있는 범위가 달라진다.
		// BasicTestClass 생성하기
		
		new BasicTestClass();
		
		// defaultTestClass생성하기
		//new DefaultTestClass();
		
		// 프로젝트내에 선언된 클래스명은 하나의 자료형으로 사용한다.
		// 참조형 자료형(Reference type)
		// 클래스를 저장하는 변수를 만들수 도 있다.
		BasicTestClass btc; // 클래스로 생성한 객체를 저장하는 변수를 선언
		btc = new BasicTestClass(); // -> 이렇게 저장해서 클래스를 만들수 있다. btc라는 변수안에 만들어짐
		
		
		// 클래스에 선언된 필드(멤버변수) 이용하기
		// 클래스에 선언된 필드를 이용하려면 클래스를 객체화(생성)해야한다.
		FieidTestClass ftc;
		ftc = new FieidTestClass();
		
		// 필드(멤버변수)에 접근하기 
		System.out.println(ftc.age);
		// 필드에 값 대입하기
		ftc.age = 19;
		System.out.println(ftc.age);
		
		// default 접근하기
		//System.out.println(ftc.name);// 있긴있는데 너는 활용할수 없음
		// private 접근제한자를 사용한 필드 접근
		// System.out.println(ftc.gender); 여기서 접근이 안됨
		// final 필드 접근하기
		
		System.out.println(ftc.HEIGHT);
		// final 필드는 수정이 불가능함
		// ftc.HEIGHT = 190.5; // final이라서 더이상 값을 저장못함
		
		// 베이스볼플레이어 만들기
		// 선수3 명을 만들기
		BaseBallPlayer p1,p2,p3;
		p1 = new BaseBallPlayer(); // 선수 한명 생성
		p1.name = "박찬호";
		p1.age = 49;
		p1.mainHand = "오른손";
		p1.number = 61;
		p1.position = "p";
		p1.power = 100;
		p1.accuracy = 70;
		p2 = new BaseBallPlayer();
		p2.name = "이승엽";
		p2.age = 46;
		p2.mainHand = "왼손";
		p2.number = 36;
		p2.position = "1B";
		p2.accuracy = 70;
		p2.power = 100;
		
		
		
		// 박찬호 정보 출력하기
		
		System.out.println(p1.name + " " + p1.age + " " + p1.mainHand + " " + p1.number +
				" " +  p1.number + " " + p1.number + " " +
				p1.position + " " + p1.power + " " + p1.accuracy);
		
		System.out.println(p2.name + " " + p2.age + " " + p2.mainHand + " " + p2.number +
				" " +  p2.number + " " + p2.number + " " +
				p2.position + " " + p2.power + " " + p2.accuracy);
		
		
		System.out.println("---------------------------------");
		
		// 학생정보를 저장하는 클래스를 선언하고 -> com.obj.model.vo.Student
		// 이름, 나이 , 학년, 반, 키, 주소 저장
		// 모든 필드는 어디서든 접근할 수 있게 설정
		// 아래 학생을 등록 후 출력하기
		// 유병승 19 1 3 180.5 경기도 시흥시
		// 홍길동 33 3 2 174.2 강원도 산골
		// 이순신 54 3 3 167.3 전라남도
		// 신사임당 45 2 1 152.3 강원도 
		
		
		Student student = new Student();
		
		System.out.println(student.name + " " + student.age + " " + student.Class + " " +
				student.group + " " + student.height + " " + student.address); // 초기값으로 읽어줌
		
		student.name = "유병승";
		student.age = 19;
		student.Class = 1;
		student.group = 3;
		student.height = 180.5;
		student.address = "경기도 시흥시";
		
		System.out.println(student.name + " " + student.age + " " + student.Class + " " +
		student.group + " " + student.height + " " + student.address);
		
		
		// 필드로 선언된 변수는 new 연산자로 생성을 하면
		// 기본값으로 초기화 된다. 초기부터 값을 대입하려면?? // 필드에 대입한다.
		Student student2 = new Student();
		System.out.println(student2.name + " " + student2.age + " " + student2.Class + " " +
				student2.group + " " + student2.height + " " + student2.address); // 여기도 같음 
		
		
		student2.name = "홍길동";
		student2.age = 19;
		student2.Class = 3;
		student2.group = 2;
		student2.height = 174.2;
		student2.address = "강원도 산골";
		
		System.out.println(student2.name + " " + student2.age + " " + student2.Class + " " +
				student2.group + " " + student2.height + " " + student2.address);
		
		Student student3 = new Student();
		student3.name = "이순신";
		student3.age = 54;
		student3.Class = 3;
		student3.group = 3;
		student3.height = 167.3;
		student3.address = "전라남도";
		
		
		System.out.println(student3.name + " " + student3.age + " " + student3.Class + " " +
				student3.group + " " + student3.height + " " + student3.address);

		Student student4 = new Student();
		student4.name = "신사임당";
		student4.age = 45;
		student4.Class = 2;
		student4.group = 1;
		student4.height = 152.3;
		student4.address = "강원도";
		
		System.out.println(student4.name + " " + student4.age + " " + student4.Class + " " +
				student4.group + " " + student4.height + " " + student4.address);

		// 필드로 선언된 변수는 new연산자로 생성을 하면
		// 기본값으로 초기화 된다. 초기부터 값을 대입하려면???
		
		//2. 초기화 블럭을 이용해서 초기화 할수 있다.
		// 인스턴스 초기화블록 -> 클래스를 생성(객체화)할때마다 실행
		// static 초기화블록 -> 최초 생성할때 한번만 실행!!
		
		
		
	}
	
	
	
	
}
