package org.java.Operator;

import java.util.Scanner;

public class Operator9 {
	public static void main(String[] args) {
		System.out.println("쉬프트 연산자");

		System.out.println(10>>2);
		System.out.println(10<<2);
		
		int i=10;
		
		System.out.println(i+","+Integer.toBinaryString(i));
		System.out.println((i>>2)+","+Integer.toBinaryString(i>>2));
		System.out.println((i<<2)+","+Integer.toBinaryString(i<<2));
		
	}
}
