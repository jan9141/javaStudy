package org.java.condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		System.out.println("Switch5");
		
		System.out.println("������ �Է��ϼ���");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int num1=scn.nextInt();
		
		System.out.println("�ι�° ���� �Է�");
		int num2=scn.nextInt();
		
		System.out.println("������ �Է�(+ - * / %)");
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
			
		}// break�� ��ġ
		
//		System.out.println("������ ��� : "+num1+" "+op+" "+num2+" = "+result);
		System.out.println("������ ���:" + num1 + op + num2 + "=" + result);
		
	}
}
