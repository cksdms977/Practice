package com.ploy.run;

import com.ploy.controller.*;
import com.ploy.model.vo.*;

public class Run {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new PolyContoller().basicTest();
//		new PloyController().testPerson();
//		Person p=new PloyController().makePerson(1);
//		Student s=(Student)new PloyController().makePerson(2);
//		System.out.println(p);
//		System.out.println(s);
		
		new PloyController().objArrPolyTest();
		new PloyController().dynamicBind();
		
		
		
	}
}
