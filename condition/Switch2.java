package org.java.condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		System.out.println("Switch5");
		
		System.out.println("권한을 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int num1=scn.nextInt();
		
		System.out.println("두번째 정수 입력");
		int num2=scn.nextInt();
		
		System.out.println("연산자 입력(+ - * / %)");
		char op=scn.next().charAt(0);
		//String op2=scn.next(); // String
		
		int result=0;
		switch (op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
			
		}// break문 위치
		
//		System.out.println("연산의 결과 : "+num1+" "+op+" "+num2+" = "+result);
		System.out.println("연산의 결과:" + num1 + op + num2 + "=" + result);
		
	}
}
