package org.java.Loop;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("While");
		// ������ 2��~9��
		int i=2;
		while(i<10) {
			
			System.out.println(i+"���Դϴ�");
			
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++; 
				
			}
			i++;
		}
		
		System.out.println("=================================");
		
		//Scanner���� �Է´�(����)�� �̿��ؼ� �������� ����غ�����.
		//��) 4�Է��ϸ� 4�ܺ��� 9�ܱ��� ���
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���۴��� �Է��ϼ���");
		int num=scn.nextInt();
		int e=num;
		while(e<10) {
			System.out.println(e+"���Դϴ�");
			int e1=1;
			while(e1<10) {
				System.out.println(e+"*"+e1+"="+(e*e1));
				e1++;
			}
			e++;
		}

				
			
			
	}
}
