package org.java.Loop;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("for��");

		//������
		//�� 2 3456789
		//�� 123456789
		for(int i=2;i<10;i++) {
			System.out.println(i+"���Դϴ�");
			
			//2��~9��
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("===============================");
		
		//9�ܺ��� 2�ܱ��� �������� ���, for
		//9*9~ 2*1
		
		for(int i2=9;i2>1;i2--) {
			System.out.println(i2+"���Դϴ�");
			
			for(int j2=9;j2>0;j2--) {
				System.out.println(i2+"*"+j2+"="+(i2*j2));
			}
		}
		System.out.println("==================");
		
		// ScannerŬ���� �̿��ؼ� ���۴��� �Է¹޾Ƽ� �������� �Է´�~9�ܱ��� ���
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scn=new Scanner(System.in);
		System.out.println("���۴��Է�:");
		int sNum=scn.nextInt();
		
		System.out.println("�����Է�:");
		int eNum=scn.nextInt();
		
		System.out.println(sNum+" "+eNum);
		if(sNum>eNum) {
			System.out.println("���۴��� ���ܺ��� ũ�ų� ���ƾߵ˴ϴ�.");
		}else {
			
			for(int e=sNum;e<10;e++) {
				System.out.println(e+"���Դϴ�");
				for(int e1=1;e1<10;e1++) {
					System.out.println(e+"*"+e1+"="+(e*e1));
				}
			}
			for(int ee=eNum;ee>1;ee--) {
				System.out.println(ee+"���Դϴ�");
				for(int ee1=9;ee1>0;ee1--) {
					System.out.println(ee+"*"+ee1+"="+(ee*ee1));
				}
			}
		}
		
	}
}
