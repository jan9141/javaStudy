package org.java.variable2;

public class PrintlnEx {
	public static void main(String[] args) {
		
		//�ڵ����� �ٹٲ�
		System.out.println(10+10);	//20
		System.out.println(10+"10");	//1010
		System.out.println(10+10+"10");	//2010
		System.out.println(10+"10"+10);	//101010
		System.out.println(10+10+"");	//"20"
		
		System.out.println("�ڵ� �ٹٲ��� ����");
		System.out.println("%d,1000");// ����c���� ���� ���
		
		int num1=10;
		int num2=10;
		
		System.out.println(num1+"+"+num1+"="+(num1+num2));
	}
}
