package com.obj.run;

import com.obj.model.vo.Person;

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
		
	}

}
