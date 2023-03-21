package com.inter.modle.vo;

import com.inter.common.PrinterDriver;

public class SamsunPrinter implements PrinterDriver{
	
	public void samPrint() {
		System.out.println("삼성프린터 인홰중....");
	}

	@Override
	public void print() {
		samPrint();
		
	}
}
