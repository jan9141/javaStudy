package org.java.Array;

public class Array4 {
	public static void main(String[] args) {
		System.out.println("�迭");
		
		int[][] arr1=new int[4][3];
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		System.out.println(arr1.length);//�� ����
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);
		
		int a=1;
		for(int i=0;i<arr1.length;i++) {//�� ����
			System.out.println(i+"��");
			for(int j=0;j<arr1[j].length;j++) {
				//1~12���� �ʱ�ȭ
				arr1[i][j]=a++;
				
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
