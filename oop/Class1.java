package org.java.oop;

public class Class1 {
	public int num1;
	public int num2;
	public String key;
	public static final String PROJECTNAME="JAVAPROJECT2022";
			
	public void instansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �ż���");
	}
	public int instansMethod2() {
		System.out.println("return���� int�� �ν��Ͻ� �ż���");
		return this.num1+this.num2;
	}
	
	public static void classMethod() {
		System.out.println("Ŭ���� �ż���");
	}
	// setters -> private ��� �ʱ�ȭ
	public void setKey(String key) {
		this.key=key;
		//return;;
	}
	// getters -> private �ɹ� get
	public String getKey() {
		return this.key;
	}
}
