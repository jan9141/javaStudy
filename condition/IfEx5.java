package org.java.condition;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		System.out.println("if문 조건이 여러개일때 ");
		// grade가 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D
		// 60미만이면 F를 콘솔에 출력하는 프로그래밍을 하세요
		// if~else if 를 사용해보세요

		Scanner scn = new Scanner(System.in);
		System.out.println("점수 입력");
		int grade = scn.nextInt();
		if (grade >= 90) {
			if (grade >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}

		} else if (grade >= 80) {
			if (grade >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}

		} else if (grade >= 70) {
			if (grade >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (grade >= 60) {
			if (grade >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D-");
			}
		} else {
			System.out.println("F");
		}
		
	}
}
