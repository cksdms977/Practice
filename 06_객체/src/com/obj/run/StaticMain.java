package com.obj.run;

import com.obj.model.vo.StaticTest;
import com.obj.model.vo.*;


public class StaticMain {
		public static void main(String[] args) {
			// static 예약어에 대해 알아보자
			// 필드, 메소드, 초기화블록에 사용할수 있다.
			// static 으로 선언된 필드에 접근하려면???
			// 선언된 클래스명을 이용해서 접근을 해야한다.(프로젝트내에서 공통으로 사용하는 저장공간이다.)
			
			StaticTest.test = "접근되니?";
			System.out.println(StaticTest.test);
			StaticTest st = new StaticTest();
			StaticTest.test = "생성된 객체로 접근";
			
			// static 으로 선언된 메소드 실행하기
			StaticTest.testMethod();
			
//			Math.random(); 이게 static임
			
			// static으로 선언된 필드, 메소드도 접근제한자의 영향을 받는다
			// static 필드는 접근제한자를 private으로 선언한다.
			//StaticTest.count = 100; // 있는데 못보는 private접근제한자
			StaticTest.setCount(100);
			System.out.println(StaticTest.getCount());
			
//			st.setCount(100); 출력할수 있는방법 위에 것과 같다 
//			System.out.println(st.getCount());
			
			
		}
}
