package com.inter.modle.vo;

import com.inter.common.PrinterDriver;

public class Cannon implements PrinterDriver{

	@Override
	public void print() {
		System.out.println("캐논 프린터 출력중...");
	}

}
