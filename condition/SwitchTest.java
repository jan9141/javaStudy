package org.java.condition;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("알파벳을 입력하세요");
		
		Scanner scn = new Scanner(System.in);
		
		
		String ch=scn.next();
		switch (ch) {
		case "A":	// A이나a
		case "a":
			System.out.println("A입니다");
			break;
		case "B":	// B이나b
		case "b":
			System.out.println("B입니다");
			break;
		case "C":	// C이나c
		case "c":
			System.out.println("C입니다");
			break;
		default:
			System.out.println("A,B,C이외의 알파벳입니다");
		}
		
		
		System.out.println("정수를 입력(0~100)");
		int num = scn.nextInt(); //정수입력 (정수)
		char grade = ' ';
		switch (num) {
		case 100: case 99: case 98: case 97: case 96: case 95: 
		case 94: case 93: case 92: case 91: case 90: 
			grade='A';
			break;
		case 89: case 88: case 87: case 86: case 85: 
		case 84: case 83: case 82: case 81: case 80: 
			grade='B';
			break;
		case 79: case 78: case 77: case 76: case 75: 
		case 74: case 73: case 72: case 71: case 70: 
			grade='C';
			break;
		case 69: case 68: case 67: case 66: case 65: 
		case 64: case 63: case 62: case 61: case 60: 
			grade='D';
			break;
		case 59: case 58: case 57: case 56: case 55: 
		case 54: case 53: case 52: case 51: case 50: 
			grade='F';
			break;
		default:
			grade='F';
			
		}
		System.out.println("학점:"+grade);
		scn.close();
	}
}
