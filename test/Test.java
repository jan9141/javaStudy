package org.java.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("국어,영어,수학 점수를 입력하고 총점, 평균을 구하시오");
		int kor, math, eng;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("국어 점수 입력");
		kor = scn.nextInt();// 국어 사용자 입력
		System.out.println("영어 점수 입력");
		eng = scn.nextInt();// 영어 사용자 입력
		System.out.println("수학 점수 입력");
		math = scn.nextInt(); // 수학 사용자 입력
		int total=kor+eng+math; // 평균=국어+영어+수학
		double avg=(double)total/3;
		
		System.out.println("총점"+total+"점");
		System.out.println("평균"+avg+"점");
		
		scn.close();
	}
}
