package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		System.out.println("Scanner Ŭ���� �̿��ؼ� ���α׷����غ����� if�� Ȱ��");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ؼ�(insert, update,select,delete)");
		String str=scn.nextLine();
		
		if(str.equals("insert")) {
			System.out.println("ȸ�� ���� ����");
		}else if(str.equals("update")) {
			System.out.println("ȸ������ ������ �̵�");
		}else if(str.equals("update")) {
			System.out.println("ȸ������ ������ �̵�");
		}else if(str.equals("select")) {
			System.out.println("ȸ����ȸ ������ �̵�");
		}else if(str.equals("delete")) {
			System.out.println("ȸ��Ż�� ������ �̵�");
		}
		
	}
}
