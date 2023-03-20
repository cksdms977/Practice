package com.ploy.controller;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Scanner;


import com.ploy.model.vo.*;

import com.ploy.model.vo.*;

import com.ploy.model.vo.*;

import com.ploy.model.vo.AbstractChildClass;
import com.ploy.model.vo.AbstarctClassTest;

public class PloyController {
	
	public void basicTest() {
		// 다형성에 대해 알아보자
		// 상속관계에 있는 클래스의 부모클래스 타입으로 선언된 변수에는 
		// 자식클래스 객체를 저장할 수 있게 하는 기술이다.
		
		PloyTestParent ptp = new PloyTestParent();
		ptp = new PloyTest(); // 상속관계일때 다형성가능 즉 자식클래스를 부모클래스 타입(변수)에 저장가능
		ptp = new PloyTest2(); // 상속관계이면 이것도 계속 저장가능함. 변수 하나 선언해서 여러가지 데이터 저장가능
		
		
		// Object는 모든것을 다 저장가능 
		Object o;
		o = new PloyTestParent();
		o = new String("이것도 저장되니?");
		o = new Scanner(System.in);
		
		// 자식클래스로 선언된 변수에는 부모클래스 객체를 저장할 수 있을까?
		// 자식타입으로 선언된 것은 부모것을 허용하지 않음
		PloyTest pt;
		// pt = new PloyTest; // 
		
		// 부모타입에 저장된 자식클래스는 업캐스팅되어 저장되기 때문에
		// 자식클래스가 선언한 내용(메소드, 변수)을 읽을 수 없다.
		
		ptp = new PloyTest();
		
		ptp.setParentData("부모멤버에 저장");
		String temp = ptp.getParentData();
		System.out.println(temp);
		
		// 자식메소드에 접근하기 - > 불가능하다
//		ptp.setChildData("부모타입에서 저장시키기!");
		
		PloyTest pt2 = new PloyTest();
		pt2.setParentData("저장하기");
		pt2.setParentData("부모접근하기");
		
		// 부모타입에 저장된 자식클래스객체의 멤버매소드에 접근하려면?
		// 형변환을 사용해서 이용한다.
		
		pt2 = (PloyTest)ptp;
		System.out.println(pt2.getChildData());
		
	}
		
	
	public void testPerson() {
		Person p;
		
		p=new Student("유병승",19,1,"실용음악");
		System.out.println(p.getName()+" "+p.getAge()
							+((Student)p).getGrade()+" "+((Student)p).getMajor());
		
		p=new Teacher("유병승",19,"웹프로그래밍",100);
		System.out.println(p.getName()+" "+p.getAge()
							+((Teacher)p).getSubject()
							+" "+((Teacher)p).getSalary());
		
		printPerson(p);
		printPerson(new Student("최주영", 26, 2, "컴공"));
		printPerson(new Teacher("유병승", 19, "web", 100));
//		printPerson(new Empolyee());
		
		PolyTestDao dao = new PolyTestDao(new Teacher());
		PolyTestDao dao2 = new PolyTestDao(new Student());
		
		Teacher t = new Teacher("유병승", 19, "web", 100);
		Teacher t2 = new Teacher("유병승", 19, "web", 100);
		System.out.println(t.equals(t2));
		
		
	}
	
	public void printPerson(Person p) {
		// instanceof
		
		if (p instanceof Student) {
			System.out.println(p.getName() + " " + p.getAge() + " " + ((Student)p).getGrade() + " "  + ((Student)p).getMajor());
		}else if (p instanceof Teacher) {
			System.out.println(p.getName() + " " + p.getAge() + " " + ((Teacher)p).getSubject() + " "  + ((Teacher)p).getSalary());
		}
		
		
	
	}
	
	public Person makePerson(int type) {
	Person p;
	
	switch(type) {
	case 1 : p = new Person(); break;
	case 2 : p = new Student(); break;
	case 3 : p = new Teacher(); break;
	case 4 : p = new Empolyee(); break;
	default : p = null; break;
	}
	return p;
	
	
	
	}
	
	public void objArrPolyTest() {
		// 객체 배열의 다형성 적용하기
		Person[] persons = new Person[9];
		persons = new Person[] {
				  new Student("최주영", 26, 2, "컴공"),
				  new Student("이동제", 26, 1, "자동차"),
				  new Teacher("유병승", 19, "web", 100), 
				  new Teacher("이다영", 25, "java", 80),
				  new Empolyee("김현영",26,"디자인", "개발자"),
				  new Empolyee("최솔",29,"연구팀", "개발자"),
		
		
		};
		
		Teacher[] teachers = new Teacher[4];
		Student[] students = new Student[3];
		Empolyee[] employees = new Empolyee[2];
		
		Teacher[] teacherAge = new Teacher[teachers.length];
		
		// 이렇게 일일이 다 안쓰고 밑에 Person의 안에 다 넣어 놓으면 모두 확인할수 있다.
//		int index = 0;
//		for (Teacher t : teachers) {
//			if (t != null && t.getAge() >= 20) {
//				teacherAge[index++] = t;
//			}
//		}
		int index = 0;
		Person[] ageSearch = new Person[persons.length];
		
		for (Person p : persons) {
			if (p != null && p.getAge() >= 25) {
				ageSearch[index++] =  p;
			}
		}
		
		for (Person p : ageSearch) {
			if (p != null) {
				System.out.println(p.getName() + " " + p.getAge());

			}
			
		}
		
		// persons에 저장된 student, teacher, employee의 수와
		// 전체 저장사람수를 구하시오.
		int countStudent = 0; int countTeacher = 0; int Employee = 0; int totalConunt = 0;
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				countStudent ++;
			}else if (persons[i] instanceof Teacher) {
				countTeacher++;
			}else if (persons[i] instanceof Empolyee) {
				Employee++;
			}
			
			totalConunt++;
			
		}
		System.out.println("학생 : " + countStudent);
		System.out.println("선생님 : " + countTeacher);
		System.out.println("회사원 : " + Employee);
		System.out.println("총합 : " + totalConunt);
		
		
	}
	
	
	public void dynamicBind() {
		
		DynamicBindTest dbt = new DynamicBindTest();
		System.out.println(dbt.toString());
		Object obj = new DynamicBindTest(); // 원래 Object를 실행해야 하는데, DynamicBindTest가 새로 왔기에 실행하게됨. 
											// 단 Object를 실행했기에, 보이지 않는다
		System.out.println(obj.toString());
		
		
		// 원래는 이렇게 형변환을 이용해서 사용하게 됨.
//		Animal a = new Animal();
//		System.out.println(((Cat)a).catbark());
		
//		a = new Dog();
//		System.out.println(((Dog)a).dogbark());
		
		// 하지만 동적바인딩을 하게 되면 바뀜
		Animal a = new Cat();
		a.bark();
		a = new Dog();
		a.bark();
		
		// 저장된 동물의 울음소리 출력하는 기능
		Animal [] animals = new Animal[10];
		animals[0] = new Dog("뽀삐", "강아지", 6);
		animals[1] = new Cat("뽀송", "고양이", 3);
		animals[2] = new Dog("복실이", "강아지", 7);
		animals[3] = new Cat("뽀짝이", "고양이", 3);
		animals[4] = new Dog("바둑이", "강아지", 5);
		animals[5] = new Cow("등심이", "소", 13);
		animals[6] = new Chicken();
		
		for (int i = 0; i < animals.length; i++) {// 울음소리 이렇게 하면 바로 할수 있다.
			if (animals[i] != null) {
				animals[i].bark();
			} 
			
		}
		
	}
	
	public void abstractClasstest() {
		// 추상클래스 이용하기 
		// 자료형으로 이용가능하다.
		AbstarctClassTest act;
//		act = new AbstarctClassTest();
		act = new AbstractChildClass();
		act.getTitle();
		act.getWritter();
	}
	
	
	
	
	
	}


	
