package org.java.oop;

public class Class1Main {
	public static void main(String[] args) {
		
		
		//�ν��Ͻ�ȭ(��üȭ)
		// new ��ü���� ������
		// c1 ��ü�� �ּҰ�
		// ��ü. -> ��ü ���� ������
		Class1 c1=new Class1();
		// c1,num1,num2,key�� �ʱ�ȭ ��ȣ �ֿܼ� ���
		c1.num1=1;
		c1.num2=2;
		c1.setKey("key");//private setters
		
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());//private getters
		
		Class1 c2=new Class1();
		c2.num1=10;
		c2.num2=20;
		c2.setKey("key2");//private setters
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());//private getters
		System.out.println(c1.equals(c2));
		
		
		// Ŭ���� ��� static -> �ν��Ͻ� ���� ���� ���,
		System.out.println("������Ʈ��:"+Class1.PROJECTNAME);
		Class1.classMethod();
		
		
	}
}
