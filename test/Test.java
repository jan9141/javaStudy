package org.java.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("����,����,���� ������ �Է��ϰ� ����, ����� ���Ͻÿ�");
		int kor, math, eng;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���� ���� �Է�");
		kor = scn.nextInt();// ���� ����� �Է�
		System.out.println("���� ���� �Է�");
		eng = scn.nextInt();// ���� ����� �Է�
		System.out.println("���� ���� �Է�");
		math = scn.nextInt(); // ���� ����� �Է�
		int total=kor+eng+math; // ���=����+����+����
		double avg=(double)total/3;
		
		System.out.println("����"+total+"��");
		System.out.println("���"+avg+"��");
		
		scn.close();
	}
}
