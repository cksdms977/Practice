package com.inherit.run;

import com.inherit.controller.*;
import com.inherit.model.vo.*;

public class Main {

	public static void main(String[] args) {
		
//		new InheritContoller().basicInheritTest();
//		new InheritContoller().overrideTest();
		
		FinalTestClass ftc = new FinalTestClass();
		
		ftc.setTest("사용은 문제없음");
		System.out.println(ftc.getTest());
	}

}
