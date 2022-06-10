package org.java.Loop;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("While");
		// 구구단 2단~9단
		int i=2;
		while(i<10) {
			
			System.out.println(i+"단입니다");
			
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++; 
				
			}
			i++;
		}
		
		System.out.println("=================================");
		
		//Scanner에서 입력단(정수)를 이용해서 구구단을 출력해보세요.
		//예) 4입력하면 4단부터 9단까지 출력
		
		Scanner scn = new Scanner(System.in);
		System.out.println("시작단을 입력하세요");
		int num=scn.nextInt();
		int e=num;
		while(e<10) {
			System.out.println(e+"단입니다");
			int e1=1;
			while(e1<10) {
				System.out.println(e+"*"+e1+"="+(e*e1));
				e1++;
			}
			e++;
		}

				
			
			
	}
}
