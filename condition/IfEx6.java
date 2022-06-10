package org.java.condition;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		System.out.println("if문 예제");
		
		System.out.println("국어, 영어, 수학점수를 입력, 총점, 평균, 학점(평균)");
		//Scanner클래스 이용해서 변수 타입은 적절히, 조건문 if이용
		//국어(0~100정수),영어(0~100정수), 수학(0~100정수)	,	총점(정수), 평균(double)
		// 평균(double)을 이용해서 학점 계산 해보세요
		// 95이상 A+,90이상A
		// 85이상 B+,80이상B
		// 75이상 C+,70이상C
		// 65이상 D+,60이상D
		// 65미만 F
		Scanner scn = new Scanner(System.in);
		System.out.println("점수 입력");
		int kor, math, eng;
		
		
		System.out.println("국어 점수 입력");
		kor = scn.nextInt();
		System.out.println("수학 점수 입력");
		math = scn.nextInt();
		System.out.println("영어 점수 입력");
		eng = scn.nextInt();
		
		int total=kor+math+eng;
		double avg=(double)total/3;
		System.out.println("총점"+total+"점");
		System.out.println("평균"+avg+"점");
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}

		}else if (avg >= 80) {
			if(avg>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else if (avg >= 70) {
			if(avg>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
		}else if (avg >= 60) {
			if(avg>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
		}else {
			System.out.println("F");
		}
	}
}
