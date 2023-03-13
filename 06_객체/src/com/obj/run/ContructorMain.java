package com.obj.run;

import com.obj.model.vo.Person;
import com.obj.model.vo.Animal;

public class ContructorMain {

	public static void main(String[] args) {
		// 클래스의 생성자 활용하기
		// 클래스는 생성해서 이용을 해야한다.
		// 이때 클래스를 생성할때 이용하는 것이 생성자다!!
		// 모든 클래스선언에는 반드시 생성자선언 코드가 있어야 한다.!
		
		Person p = new Person(); // 기본생성자를 호출한 구문
		System.out.println(p.name + " " + p.age + " " + p.height + " " + p.gender);
		// 매게변수 있는 생성자 호출하기
		Person p1 = new Person("최주영", 26, 178.4, '여'); // 매게변수 호출할수 있음 
		Person p2 = new Person("김중근", 28, 177.3, '여');
		
		System.out.println(p1.name + p1.age + p1.height + p1.gender);
		System.out.println(p2.name + p2.age + p2.height + p2.gender);
		
		// 매개변수있는 생성자 이용하기
		// 동물정보 저장할 수 있는 클래스 만들기 com.obj.model.vo
		// 종류, 이름, 몸무게, 길이, 서식지
		// 개 뽀삐 5kg, 50cm 우리집
		// 거북이, 꼬북이, 1.2kg, 5cm, 어항
		Animal cat = new Animal("고양이", "엉", 4.5, 40, "솔이집");
		
		Animal a = new Animal("개", "뽀삐", 5, 50, "우리집");
		
		System.out.print(a.type + " " + a.name + " " + a.weight + "kg" + " " + a.length + "cm" + " " + a.habitat);
	
		Animal b = new Animal("거북이", "꼬북이", 1.2, 5, "어항" );
		
		System.out.print(b.type + " " + b.name + " " + b.weight + "kg" + " " + b.length + "cm" + " " + b.habitat);
		
		System.out.println("-------------------------");
		Person p3 = new Person("윤지환", '남');
		System.out.println(p3.name + p3.gender);
		
		Person p4 = new Person("윤주호", 26);
		System.out.println(p4.name + p4.age);
	
	
	}

}