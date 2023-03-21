package com.inter.run;

import com.inter.common.PrinterDriver;
import com.inter.controller.PrinterController;
import com.inter.modle.vo.Cannon;
import com.inter.modle.vo.LGprinter;
import com.inter.modle.vo.SamsunPrinter;

public class PrintMain {
	public static void main(String[] args) {
		
//		SamsunPrinter printer = new SamsunPrinter();
//		new PrinterController(printer).print();
//		LGprinter printer = new LGprinter();
//		new PrinterController(printer).print();
		
		PrinterDriver printer = new SamsunPrinter();
		new PrinterController(printer).print();
		printer = new LGprinter();
		new PrinterController(printer).print();
		printer = new Cannon();
		new PrinterController(printer).print();
		
	}
}
