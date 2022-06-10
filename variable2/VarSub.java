package org.java.variable2;

//클래스 VarSub
public class VarSub {
	
	//멤버: 필드, 메서드, 생성자
	
	//필드(속성)
	public int num1; //인스턴스 멤버(변수)
	public static int num2; // 클래스 멤버(변수)
	private int num3;
	
	public void sum() {
		System.out.println(num1+num2);
	}
	//인스턴스 메서드 method
	public void method(int num1,int num2 ) {
		
		// 지역변수 (매서드)num1, num2, num3
		int num3=num1+num2;
		
		System.out.println(num3);
	}
}
