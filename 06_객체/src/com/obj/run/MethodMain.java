package com.obj.run;

import java.util.Arrays;
import com.obj.basiccontroller.*;
import com.obj.model.vo.Animal;
import com.obj.basiccontroller.*;
public class MethodMain {

	public static void main(String[] args) {
		// 클래스에 선언된 메소드 호출하기
		// 클래스의 멤버매소드를 호출하려면 클래스를 객체로 생성해야한다.
		MethodTest mt = new MethodTest();
		mt.printMsg();
		
		// 반환형이 있는 메소드 호출하기
//		int result = mt.puls();
//	System.out.println(result);
	
//		mt.printSendMsg("안녕하세요");
//		mt.printSendMsg("월요일도 화이팅!!!");
//		String data = "안녕";
//		mt.printSendMsg(data);
//		
//		result = mt.complexNumber(20, 30);
//		System.out.println(result);
//		
//		mt.numberTest();
//		mt.numberTest();
//		mt.numberTest();
		
//		new MethodTest().numberTest(); // 위의 생성자와 출력값이 다르다. new 쓸때마다 계속 생성됨.
//		new MethodTest().numberTest();
//		new MethodTest().numberTest();
		
		MyMethod mt2 = new MyMethod();
		
//		// 월요일 점심 맛있게 먹어요 출력하는 메소드 작성하기
//		mt2.luch();
//		
		//숫자르 1~5까지 더한수를 반환하는 메소드 작성하기
//		int result2 = mt2.puls();
//		System.out.println(result2);
//		//사용자한테 5번 메세지를 입력받고 입력받은 메세지를 반환하는 메소드 만들기
//		String result3 = mt2.msg();
//		System.out.println(result3);
//		
//		// 정수2개 연산자 한개를 전달받아 계산하는 계산결과를 출력하는 메소드 만들기.
//		mt2.twonumber(1,2,'-');
//		
//		// 정수2개 연산자 한개를 전달받아 계산하는 계산결과를 출력하는 메소드 만들기.
//		double result4 = mt2.calculator(10, 20, '*');
//		System.out.println(result4);
//		if (mt2.calculator(10, 20, '*') < 100) {
//			// 이렇게 사용할수 있다. 수행한 결과문 가지고 이렇게도 사용가능하다.
//		}
//		
//		// 문자열과 문자를 전달받아 문자열에 중복값이 있는지 결과를 반환 해주는 메소드 만들기.
//		boolean flag = mt2.msg2("abdcddf");
//		System.out.println(flag);
//		
//		if (mt2.msg2("abdcddf")) {
//			System.out.println("중복값이 있습니다.");
//		}else {
//			System.out.println("중복값이 없습니다.");
//		}
//	
	int[] intArr = mt.testReturn(); // 배열을 반환받자
	System.out.println(Arrays.toString(intArr));
//	
	Animal a = mt.makeAnimal();
	System.out.println();
	System.out.println(a);
	System.out.println(a.type+a.name+a.weight);
	mt.paramArr(intArr);
	mt.paramObj(a, "강아지");
	System.out.println(a.type + a.name + a.weight);
	// 매개변수, 반환형으로 배열이나 객체를 선언했을때에는 heap영역의
	// 주소를 공유하게됨, -> 원본값을 수정할 수 있게 됨
	
		int su = 10;// 원본값을 수정하는 것은 불가능 return값을 사용해서 다시 대입해서 사용할수밖에없음
		mt.chageInt(su);
		int[] numbers = {1,2,3,4,};
		mt.changIntArr(numbers);
		System.out.println(su);
		System.out.println(numbers[0]);
		
//		//main메소드 메개변수 넣기!
//		System.out.println(args);
//		for (String arg : args) {
//			System.out.println(arg);
//		}
	
	}

}
