package org.java.variable2;

import java.util.Scanner;

public class VarExTest {
	public static void main(String[] args) {
//		System.out.println("반지름 넓이");
//		System.out.println("정수형 숫자를 입력하세요");
//		Scanner scn=new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자 입력");
//		
//		int i1=5*5;
//		double i2=3.14;
//		
		
		System.out.println("원의 넓이를 구하시오");
		
		Scanner scn=new Scanner(System.in);
		final double PI=3.14;
		
		System.out.println("반지름 입력하세요(정수형)");
		int radius=scn.nextInt();
		
//		double circleNum=radius*radius*PI;
		int circleNum=(int)(radius*radius*PI);
		
		System.out.println(radius+"*"+radius+"="+PI+"="+(radius*radius*PI));
		System.out.println("원의 넓이: "+circleNum);
	}
}
