package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		System.out.println("Scanner 클래스 이용해서 프로그래밍해보세요 if문 활용");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("쿼리문 입력해서(insert, update,select,delete)");
		String str=scn.nextLine();
		
		if(str.equals("insert")) {
			System.out.println("회원 가입 성공");
		}else if(str.equals("update")) {
			System.out.println("회원수정 페이지 이동");
		}else if(str.equals("update")) {
			System.out.println("회원수정 페이지 이동");
		}else if(str.equals("select")) {
			System.out.println("회원조회 페이지 이동");
		}else if(str.equals("delete")) {
			System.out.println("회원탈퇴 페이지 이동");
		}
		
	}
}
