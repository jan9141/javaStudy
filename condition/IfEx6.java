package org.java.condition;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		System.out.println("if�� ����");
		
		System.out.println("����, ����, ���������� �Է�, ����, ���, ����(���)");
		//ScannerŬ���� �̿��ؼ� ���� Ÿ���� ������, ���ǹ� if�̿�
		//����(0~100����),����(0~100����), ����(0~100����)	,	����(����), ���(double)
		// ���(double)�� �̿��ؼ� ���� ��� �غ�����
		// 95�̻� A+,90�̻�A
		// 85�̻� B+,80�̻�B
		// 75�̻� C+,70�̻�C
		// 65�̻� D+,60�̻�D
		// 65�̸� F
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է�");
		int kor, math, eng;
		
		
		System.out.println("���� ���� �Է�");
		kor = scn.nextInt();
		System.out.println("���� ���� �Է�");
		math = scn.nextInt();
		System.out.println("���� ���� �Է�");
		eng = scn.nextInt();
		
		int total=kor+math+eng;
		double avg=(double)total/3;
		System.out.println("����"+total+"��");
		System.out.println("���"+avg+"��");
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
