package org.java.variable2;

import java.util.Scanner;

public class VarExTest {
	public static void main(String[] args) {
//		System.out.println("������ ����");
//		System.out.println("������ ���ڸ� �Է��ϼ���");
//		Scanner scn=new Scanner(System.in);
//		
//		System.out.println("ù��° ���� �Է�");
//		
//		int i1=5*5;
//		double i2=3.14;
//		
		
		System.out.println("���� ���̸� ���Ͻÿ�");
		
		Scanner scn=new Scanner(System.in);
		final double PI=3.14;
		
		System.out.println("������ �Է��ϼ���(������)");
		int radius=scn.nextInt();
		
//		double circleNum=radius*radius*PI;
		int circleNum=(int)(radius*radius*PI);
		
		System.out.println(radius+"*"+radius+"="+PI+"="+(radius*radius*PI));
		System.out.println("���� ����: "+circleNum);
	}
}
