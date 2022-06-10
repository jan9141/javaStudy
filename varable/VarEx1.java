package org.java.varable;

public class VarEx1 {
	public static void main(String[] args) {
		System.out.println("변수, 데이터 타입");
		System.out.println("primitive types");
		
		
		// 1byte = 8bit	-2^8~+2^-1	-128~+127
		//정수형 데이터	
		byte b=10; //정수형 데이터1byte를 저장 할수 있는 변수 b를 선언하고10으로 초기화 했다.
		short s=10;// 정수형 데이터 2byte를 저장 할수 있는 변수s를 선언하고 10으로 초기화했다.
		int i=10;// 정수형 데이터 4byte를 저장 할수 있는 변수i를 선언하고 10으로 초기화했다.
		long l=10l;// 정수형 데이터 8byte를 저장 할수 있는 변수l을 선언하고 10으로 초기화했다.
		//실수형 데이터
		float f=1.1f;// 실수형 데이터 4byte를 저장 할수 있는 변수f를 선언하고 1.1f로 초기화 했다.
		double d=1.1;// 실수형 데이터 8byte를 저장 할수 있는 변수d를 선언하고 1.1로 초기화 했다.
		//문자형 데이터
		char ch='a'; // 문자형 데이터 2byte를 저장 할수 있는 변수ch를 선언하고 'a'로 초기화 했다.
		//논리형 데이터
		boolean bool=false; //boolean형 1byte를 저장 할수 있는 변수 bool를 선언하고 false로 초기화 했다.
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}

}
