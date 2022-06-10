package org.java.condition;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("정수를 입력");
		int  num=scn.nextInt();
		char grade=' ';
		
		switch (num) {
		case 10:	
		case 9:
			grade='A';
			break;
		case 8:	
		case 7:
			grade='B';
			break;
		case 6:	
		case 5:
			grade='C';
			break;
		case 4:	
		case 3:
			grade='D';
			break;
		default:
			grade='F';
			break;
		}
		System.out.println("학점:"+grade);
	}
}
