package com.inter.modle.vo;

import com.inter.common.ChildInterface;

public class InterInheritClass implements ChildInterface{

	@Override
	public int add(int su, int su2) {
		return su + su2;
	}

	@Override
	public String addStr(String str, String str1) {
		return str + str1;
	}

	@Override
	public void PrintTest(String str) {
		
	}

	@Override
	public void fly() {
				
	}
	
}
