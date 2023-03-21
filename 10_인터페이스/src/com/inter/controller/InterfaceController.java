package com.inter.controller;

import java.util.function.Function;
import java.util.function.Predicate;

import com.inter.common.BasicInter;
import com.inter.common.CalculatorInterface;
import com.inter.common.Flyable;
import com.inter.common.Motionable;
import com.inter.common.ParentInterface;
import com.inter.common.StringInterface;
import com.inter.modle.vo.BasicInterClass;
import com.inter.modle.vo.Dolphin;
import com.inter.modle.vo.Duck;
import com.inter.modle.vo.Fruit;
import com.inter.modle.vo.InterInheritClass;
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
	
	// 인터페이스 상속하기
	// 다중 상속이 가능하다.
	
	public void interInheritTest() {
		
		ParentInterface pif = new InterInheritClass(); // 이렇게 하면 ParentInterface의 있는 메소드만 실행됨. 
		System.out.println(pif.add(10, 20)); 
		
		Flyable f = new InterInheritClass();
		((InterInheritClass)f).PrintTest("테스트");
		if (f instanceof InterInheritClass) {
			System.out.println("InterInheritClass 야!!");
		}
	}
	
	public void extraInterface() {
		// 익명클래스를 이용해서 인터페이스 구현하기
		BasicInter bi = new BasicInter() {
			
			@Override
			public void test() {
			System.out.println("익명클래스 구현");
		}

			@Override
			public int calc(int a, int b) {
				return a + b;
			}
	};
	int result = bi.calc(10, 20);
	System.out.println(result);
	
	animalBark(new Motionable() {
		

	@Override
	public void bark() {
		System.out.println("엉엉!");
	}

	@Override
	public void forward() {
		System.out.println("움직임!");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
});
	// 인터페이스에 선언되어있는 추상클래스가 한개일 경우
	// FunctnalTnterface로 람다표현식으로 이용해서 간단하게 표현이 가능함.
	Flyable f = new Flyable() {
		
		@Override
		public void fly() {
			// TODO Auto-generated method stub
		System.out.println("수퍼매앤 !!!");
		
		}
	};
	// 위에 있는 식을 이른식으로 간단하게 표현할수 있음 ([매개변수]) -> { return } 
	
	f = () -> {System.out.println("람다로 날다.");};
	f.fly();
	
	// 매개변수 있고, 반환형이 없는 함수형 인터페이스
	CalculatorInterface ci = (int a, int b) -> {System.out.println(a + b);};
	ci.calc(20, 30);
	
	StringInterface si = (String a) -> {return a + " 람다로 출력하기";};
	System.out.println(si.strCheck("우와 신기하다!"));
	// 이렇게 return 값이 있을때 로직이 없고 바로 리턴을 구현하면 retrun 예약어를 생략할수 있음 {}사용 하지 않음
	si = (String b) -> b + "로직없이 바로 리턴";
	System.out.println(si.strCheck("많이 어려워요?"));
	
	Predicate <String> p = (String str) -> str.length() > 0;
	System.out.println(p.test("유병승"));
	Function <String, Fruit> fun = (str) -> {Fruit f1 = new Fruit(); f1.setName(str); return f1;};
	
	Fruit fruit = fun.apply("샤인머스켃");
	System.out.println(fruit);
	
	
	
	
	}
	
	
	
}
	

