package com.inter.modle.vo;

import com.inter.common.PrinterDriver;

public class LGprinter implements PrinterDriver{
	
	public void printLg() {
		System.out.println("엘지 프린터 인쇄중...");
	}

	@Override
	public void print() {
		printLg();
		
	}
}
