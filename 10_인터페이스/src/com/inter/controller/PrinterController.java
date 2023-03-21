package com.inter.controller;

import com.inter.common.PrinterDriver;
import com.inter.modle.vo.LGprinter;
import com.inter.modle.vo.SamsunPrinter;

public class PrinterController {
	
//	private SamsunPrinter Printer;
//	private LGprinter printer;
	private PrinterDriver printer;
	
//	public PrinterController(SamsunPrinter printer) {
//		this.Printer = printer;
//	}
	
	public PrinterController(PrinterDriver printer) {
		this.printer = printer;
		
	}
	
	
	public void print() {
//		this.Printer.samPrint();
		this.printer.print();
	}
	
	
}
