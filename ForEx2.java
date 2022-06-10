package org.java.Loop;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("for문");

		//구구단
		//단 2 3456789
		//하 123456789
		for(int i=2;i<10;i++) {
			System.out.println(i+"단입니다");
			
			//2단~9단
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("===============================");
		
		//9단부터 2단까지 구구단을 출력, for
		//9*9~ 2*1
		
		for(int i2=9;i2>1;i2--) {
			System.out.println(i2+"단입니다");
			
			for(int j2=9;j2>0;j2--) {
				System.out.println(i2+"*"+j2+"="+(i2*j2));
			}
		}
		System.out.println("==================");
		
		// Scanner클래스 이용해서 시작단을 입력받아서 구구단을 입력단~9단까지 출력
		System.out.println("숫자를 입력하세요");
		Scanner scn=new Scanner(System.in);
		System.out.println("시작단입력:");
		int sNum=scn.nextInt();
		
		System.out.println("끝단입력:");
		int eNum=scn.nextInt();
		
		System.out.println(sNum+" "+eNum);
		if(sNum>eNum) {
			System.out.println("시작단이 끝단보다 크거나 같아야됩니다.");
		}else {
			
			for(int e=sNum;e<10;e++) {
				System.out.println(e+"단입니다");
				for(int e1=1;e1<10;e1++) {
					System.out.println(e+"*"+e1+"="+(e*e1));
				}
			}
			for(int ee=eNum;ee>1;ee--) {
				System.out.println(ee+"단입니다");
				for(int ee1=9;ee1>0;ee1--) {
					System.out.println(ee+"*"+ee1+"="+(ee*ee1));
				}
			}
		}
		
	}
}
