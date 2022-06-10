package org.java.condition;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		System.out.println("Switch");
		
		System.out.println("권한을 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		
		int key=scn.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("오야 관리자입니다");
			break;
		case 2:
			System.out.println("중간 관리자입니다");
			break;
		case 3:
			System.out.println("일반 사원 입니다");
			break;
		default:
			System.out.println("권한이 없습니다");
		}
		scn.close();
	}
}
