package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void print() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 : ");
		char ch=sc.next().charAt(0);
		System.out.println(ch+" unicode : "+(int)ch);
	}
}
