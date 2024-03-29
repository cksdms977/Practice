package com.inherit.controller;

import com.inherit.model.vo.*;

import com.inherit.run.*;
import com.inherit.run.*;

public class InheritContoller extends Parent {
	
	public void basicInheritTest() {
		// 기본 상속에 대해 알아보자
		// 모든 클래스는 Object 클래스를 상속받았다.(별도의 선언코드가 없어도 상속받음, 그냥 기본구조임)
		//
		
		BasicTest bt = new BasicTest();
		bt.equals("test");
		bt.hashCode();
		
		// 클래스의 상속관계 설정하기
		// 상속 : 두개의 클래스간의 부모(super), 자식(sub) 관계를 설정
		// 방법 : 클래스 선언부 extends예약어를 사용해서 선언함
		// 예) public class Test(자식, subclass) extends SuperTest(부모,) { 클래스 선언부 }
		// SuperTest 클래스에 선언된 내용을 Test가 가져와 쓰는것
		
		BasicTest bt2 = new BasicTest();
		bt2.setTitle("상속");
		System.out.println(bt2.getTitle());
		
		bt2.seNumber(100);
		System.out.println(bt2.getNumber());
		
		String result = bt2.infoBasicTest();
		System.out.println(result);
		
		double test = weight;// 이렇게 부모에 있는것들을 쓸수있음. 대신 extends를 해야됨
		
		// 매게변수있는 생성자로 생성하기
		BasicTest bt3 = new BasicTest("생성자", 100, 65.5);
		System.out.println(bt3.infoBasicTest());
		
		// 학생 2명 저장하기
		// 최주영, 26, 남 , 0101111, 경기도 안양시, 공공데이터, 선생을 갈굼, 상
		// 정상준 26, 남, 0102222, 서울시 구로구, 공공데이터, 힘들어함, 중상
		
		// 선생 1명
		// 유병승, 19, 남, 0101234, 경기도 시흥시, 웹프로그래밍, 100, 100
		
		Student s = new Student("최주영", 26, '남', "0101111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		
		
//		student.setName("최주영");
//		student.setAge(26);
//		student.setGender('남');
//		student.setAddress("0101111");
//		student.setAddress("경기도 안양시");
//		student.setJoinclass("공공데이터");
//		student.setIssue("선생을 갈굼");
		
		Student s2 = new Student("정상준", 26, '남', "0102222", "서울시 구로구", "공공데이터", "힘들어함", '상');
		
//		student2.setName("전상준");
//		student2.setAge(26);
//		student2.setGender('남');
//		student2.setAddress("0102222");
//		student2.setAddress("서울시 구로구");
//		student2.setJoinclass("공공데이터");
//		student2.setIssue("힘들어함");
		
		System.out.println(s.getName() + " " + s.getAge() + " " +
		s.getGender() + " " + s.getJoinclass() 
		+ " " + s.getLevel() + " " + s.getIssue());		
		
		System.out.println(s2.infoStudent());		
		
		Teacher t = new Teacher("유병승", 19, '남', "0101234", "경기도 시흥시", "웹프로그래밍", 100, 100);
//		t.setName("유병승");
//		t.setAge(19);
//		t.setGender('남');
//		t.setAddress("0101234");
//		t.setAddress("경기도 시흥시");
//		t.setSalary(100);
//		t.setCareer(100);
		
		System.out.println(t.infoTeacher());
		
		// 직원
		// 홍길동 20 남 010555 강원도 산골 행정팀 50 10 
		
	}
	
	public void overrideTest() {
		// override : 메소드를 재정의
		// 클래스가 상속관계일때 부모클래스에 선언된 메소드를 자식클래스가 재정의하는 것
		OverrideChild oc = new OverrideChild();
		oc.printMsg();
		
//		Teacher t = new Teacher();
		Student s = new Student();
//		System.out.println(t.info());
		
		// Object클래스의 메소드를 재정의해서 사용
		// equals : 객체간의 동등성 비교를 하기 위해 선언한 메소드 
		// hashCode : 객체의 유일한 값을 정수로 출력(주소)
		// toString : 생성된 객체의 대표하는 문자를 반환(필드의 값을 반환 )
		// clone : 생성된 객체를 복사해주는 기능
		
		// equals 재정의하기
		Student s1 = new Student("최주영", 26, '남', "0101111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		
		Student s2 = new Student("최주영", 26, '남', "0101111", "경기도 안양시", "공공데이터", "선생을 갈굼", '상');
		
		Student s3 = new Student("정상준", 26, '남', "0102222", "서울시 구로구", "공공데이터", "힘들어함", '상');
		
		System.out.println(s1 == s2); // 위의 데이터는 다 같지만 new라는 연산자로 인해서 새로 생성되서 만들기때문에 주소값이 서로 다름
										// ==은 주소값을 비교한다.
		System.out.println(s1.equals(s2)); // 이렇게 하면 그냥 기본값들만 비교하기때문에 재정의를 해야함 즉 내용을 다시 해야함ㄴ
		
		System.out.println(s1.equals(s3));
		
		
//		BasicTest bt = new BasicTest("test", 100, 10.5);
//		BasicTest bt2 = new BasicTest("test", 100, 10.5);
		
		// toString 메소드 오버라이딩
		// 생성된 객체의 정보를 출력해주는 기능을 하는 메소드
		// 클래스에 toString이 오버라이딩 되어있으면? 변수명을 출력했을때
		// 자동으로 toString 메소드를 호출하여 지정된 정보를 출력한다.
		System.out.println(s1);
		System.out.println(s1.toString());
		
		// hashcode Ovrride(재정의)하기
		// 객체를 지칭하는 정수값을 출력해주는 함수
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//clone : 객체복사 메소드
		// 깊은 복사를 구현
		//oc.clone();
		Student copyStudent = s1.clone();
		System.out.println(copyStudent);
		copyStudent.setAge(50);
		System.out.println(s1);
		System.out.println(copyStudent);
		
		// Teacher 
		// t = 유병승, 20, 여, 010123, 경기도 광명시, 웹프로그래밍, 10, 100
		// t2 = 유병승, 19, 여, 010123, 경기도 과천시, 웹프로그래밍, 5, 80
		// t3 = 유병승, 20, 여, 010123, 경기도 이천시, 웹프로그래밍, 10, 100
		// 세객체를 모두 비교해서 같은 객체와 다른 객체를 구분하기
		// 조건 : 이름 , 나이, 과목, 경력이 동일하면 같은 객체 
		// 출력 : 모든 객체의 정보를 변수를 이용해서 출력하기;
		
		// StudentManage 업데이트 
		// 1. 저장된 데이터와 동일한 학생은 저장하지 않는다.
		// 2. 출력시 infoSudent()를 변수로 대체하기
	
		Teacher t = new Teacher("유병승", 20, '여', "0010123", 
								"경기도 광명시", "웹프로그래밍", 10, 100);
	
		Teacher t2 = new Teacher("유병승", 19, '여', "010123", 
								"경기도 과친시", "웹프로그래밍", 5, 80);
		Teacher t3 = new Teacher("유병승", 20, '여', "010123", 
								"경기도 이천시", "웹프로그래밍", 10, 100);
	
		System.out.println(t.equals(t2));
		System.out.println(t.equals(t3));
		
		System.out.println(t + "\n" + t2 + "\n" + t2);
		
		
	
	}
		

	
		
	}

