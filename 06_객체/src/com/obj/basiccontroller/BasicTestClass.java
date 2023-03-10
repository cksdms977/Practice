package com.obj.basiccontroller;

import java.util.Scanner;

// 접근제한자가 public 으로 선언된 클래스는 프로젝트 내에서 모든 패키지에서 이용가능
// 이용가능이라는 뜻은 new 연산자로 객체화(생성)해서 사용할 수 있다.
public class BasicTestClass {
	
	{
	// default 접근제한자가 선언된 클래스는 
	// 같은 패키지 내부에서만 이용이 가능하다.
	new DefaultTestClass();
	

	FieidTestClass ftc = new FieidTestClass();
	// 같은 패키지내에서 default접근제한자를 사용한 필드에
	// 직접접근이 가능하다.
	System.out.println(ftc.name);
		ftc.name = "유병승";
		//ftc.gender // 여기서 안됨
	}

}




