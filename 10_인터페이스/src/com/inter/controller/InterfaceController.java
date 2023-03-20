package com.inter.controller;

import com.inter.common.BasicInter;
import com.inter.common.Flyable;
import com.inter.common.Motionable;
import com.inter.modle.vo.BasicInterClass;
import com.inter.modle.vo.Dolphin;
import com.inter.modle.vo.Duck;
import com.inter.modle.vo.Rabbit;

public class InterfaceController {
	
	public void basicInterface() {
		// 기본 인터페이스 이용하기
		// 추상메소드와, static final변수를 갖는 객체이다.
		// 자체생성이 불가능하고, 다른 클래스에 의해서 구현(메소드 재정의)하여 사용됩니다.
		// 인터페이스를 구현한 클래스는 인터페이스의 자식클래스로 설정됨(상속관계적용)
		// 인터페이스타입의 변수에 자식클래스를 저장할 수 있다.
		// 선언하는 방법 : public interface 인터페이스명{ 구현부,,,,, }
		// 클래스에서 구현선언하기
		// public class 클래스명 implements 인터페이스명{}

		BasicInterClass bic = new BasicInterClass();
		bic.test();
		System.out.println(bic.calc(10, 10));
		
		// 선언된 인터페이스는 자료형으로 사용이 가능함.
		BasicInter bi; // new BasicInter(); 이건 인터페이스라거 안되고
		// 하지만 구현한 객체는 저장이 가능하다.
		bi = new BasicInterClass();
		bi.test();
		System.out.println(bi.calc(20, 30));
		Duck d = new Duck();
		
		Flyable f = new Duck(); // 여기에 무조건 Flyable의 타입에 fly가 만들어 져있으니 그것이 Duck에 있는 fly를 실행한다.
		f.fly();
		Motionable m = new Duck();
		m.bark();
		
//		f = new Rabbit(); // 상속관계가 아니기에 들어갈수 없다
		m = new Rabbit(); // 이건 됨 왜냐하면 상속관계이기에
		m.bark();
		
//		animalBark(new Dolphin()); // 돌핀은 울음소리를 선언하지 않아서 안됨
 		animalBark(new Duck()); // 이건 다 가능 울음소리르 선언했기에
		animalBark(new Rabbit());
	}
	
	public void animalBark(Motionable m) {
		m.back();
	}
	
	
	
}
