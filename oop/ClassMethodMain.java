package org.java.oop;

public class ClassMethodMain {
	
	public int s1;
	public int s2;
	public static int s3;
	
	public void m1() {
		s1=10;
		s2=20;
		s3=100;
	}
	
	public static void main(String[] args) {
		
		
		s3=10;
		
		ClassMethod c1=new ClassMethod();
		
		c1.method1();//call
		c1.method2(100, 200);
		int sum=c1.method3();
		System.out.println(c1.method3());
		System.out.println(sum);
		
		int sum2=c1.method4(200, 300);
		System.out.println(c1.method4(300, 500));
		System.out.println(sum2);
		
		//Ŭ���� �޼��� ȣ��
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(100, 200);
		
	}
}
