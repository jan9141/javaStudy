package org.java.condition;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		System.out.println("Switch6");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���(insert, select,update,delete)");
		String input=scn.next();//���ڿ� "" / char ''
		
		switch (input) {
		case "insert":
//			System.out.println("ȸ������ �������� �̵��մϴ�");
			
			break;
		case "select":
			System.out.println("ȸ������ �������� �̵��մϴ�");
			break;
		case "update":
			System.out.println("ȸ����ȸ �������� �̵��մϴ�");
			break;
		case "delete":
			System.out.println("ȸ��Ż�� �������� �̵��մϴ�");
			break;
		default:
			System.out.println("������ �Է� ����");
			
		}
		scn.close();
		
		
		
	}
}
