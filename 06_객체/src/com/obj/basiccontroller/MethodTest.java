package com.obj.basiccontroller;

import com.obj.model.vo.Animal;


public class MethodTest {
	
	private int count;
	
	
	public MethodTest( ) {}
	
	//메소드는 클래스가 제공하는 기능을 의미한다.
	
	//1. 반환형이 없고 매개변수도 없는 메소드 선언하기
	// 반환형이 없음 : void
	// 매개변수 없음 : ()
	// 접근제한자(public) [예약어] 반환형 메소드명([매개변수선언]) {기능구현}
	public void printMsg() {
		System.out.println("PrintMsg실행함!");
	}//반환없는 메소드 선언 => 정확하게 말하면 이게 멤버매소드임 그래서 호출할려면 객체화 해야함.
	
	//2. 반환형있고 매개변수 없는 메소드 구현하기
	// 반환형에는 반환할 값의 타입을 선언을 한다.
	// 특정값을 더하고 결과를 반환하는 기능
	public int puls() {
		int su = 100;
		int su2 = 200;
		// 여기에는 반환형을 처리하는 예약어를 사용해야한다 -> return 값 or 변수를 작성할수있다.
		return su + su2;
	}
	
	//3. 반환형이 없고 매개변수가 있는 메소드
	// 호출하는 곳에서 전달한 문자열를 출력해주는 기능
	public void printSendMsg(String msg) {
		System.out.println("전달한 메세지 : " + msg);
	
	}
	
	//4. 반환형도 있고 메개변수도 있는 메소드
	// 정수 두개를 전달받아 두값을 곱한 결과를 반환하는 기능을 만들기
	public int complexNumber(int su, int su2) {
		
		//return su*su2; // 이거랑 밑에부문이랑 같다. 방법 2두가있음
		int result = su*su2;
		return result;
	}
	
	// 메소드 구현부 -> 메소드의 {} 내부에는
	// 변수선언(메소드 안에있는 변수선언 한 것은 (안에서만 사용가능하기때문에) = 지역변수), 조건문, 반복문, 필드 등 모두 사용가능
	
	// 1~10까지 출력해주는 메소드 만들기(짝수출력)
	public void numberTest() {
		this.count += 1; // 필드에 선언된것은 가져와서 쓸수있다. 초기화 이미 되어있음
		int count = 0;
		count +=1;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				
			}
			System.out.println();
			//지역변수와 멤버변수와의 차이점
			System.out.println("필드출력 : " + this.count);
			System.out.println("지역변수 : " + count);
		}
		
	}
	
	// com. obj.basiccontroller.MyMethod
	// 월요일 점심 맛있게 먹어요 출력하는 메소드 작성하기
	
	//숫자르 1~5까지 더한수를 반환하는 메소드 작성하기
	
	//사용자한테 5번 메세지를 입력받고 입력받은 메세지를 반환하는 메소드 만들기
	
	// 정수2개 연산자 한개를 전달받아 계산하는 계산결과를 출력하는 메소드 만들기.
	
	// 정수2개 연산자 한개를 전달받아 계산결과를 반환하는 메소드 만들기
	
	// 문자열과 문자를 전달받아 문자열에 중복값이 있는지 결과를 반환 해주는 메소드 만들기.
	
	//-----------------------------------------------------------------
	
	// java의 메소드 반환값은 한개만 가능하다.
	
		//return 10, 20, 30, 40 ; // 다수의 값을 넘길수 없다.
		// 다수 값을 반환하거나 전달(매개변수)받을려면?
		//1. 배열이나 
		//2. 클래스를 선언한다.
		public int[] testReturn() {
		//	return new int[] {10, 20, 30, 40};
			int[] returnvalue = {10, 20,30,40};
			return returnvalue;
			
		}
		
	
	public Animal makeAnimal() {
		return new Animal();
	}
	
	public void paramArr(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(i);
		}
	}
		
		public void paramObj (Animal animal, String type) {
			animal.type = type;
		}
		
		public void chageInt(int num) {
			num += 20;
			
		}
		public void changIntArr(int intArr[]) {
			intArr[0] = 200;
		
		
		}
		
		
	}
	
	

