package org.java.Array;

public class Array1 {
	public static void main(String[] args) {

		System.out.println("�迭");

		// int arr2[] = new int[5];
		// int�� �����͸� ���� �� �� �ִ� �迭 arr1�� �����ߴ�.
		int[] arr1 = new int[5];
		// �ʱ�ȭ
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;
//		arr1[3] = 4;
//		arr1[4] = 5;
//		System.out.println(arr1[0]);
		// for���� �̿��ؼ� arr1�� 01234�� �ʱ�ȭ �ϰ� �ֿܼ� �� ������ ����
		// ��� �غ�����

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 0 + 1;
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}

		System.out.println("�迭�� �Ѱ���:" + arr1.length);
		System.out.println("�迭�� ������ �ε���:" + (arr1.length - 1));

		// int�� �����͸� ���� �� �� �ִ� �迭 arr3�� ���� �ϰ� int�� 12345�� �ʱ�ȭ�ߴ�.
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };//
		// int�� �����͸� ���� �� �� �ִ� �迭 arr4�� ���� �ϰ� int�� 12345�� �ʱ�ȭ�ߴ�.
		int[] arr4 = { 1, 2, 3, 4, 5 };

		char[] chArr = new char[5];
		char[] chArr2 = new char[] { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < chArr2.length; i++) {
			System.out.println("chArr[" + i + "]=" + chArr2[i]);
		}
		String[] strArr = new String[] { "j", "a", "v", "a", "22" };
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr[" + i + "]=" + strArr[i]);
		}
		
		// 1���� 45���� �������� ���ο� �迭 lotto�� �����ϰ� �ֿܼ� ������ ��Ұ��� ����ϼ���
		int[] lotto=new int[45];
		int lottoSize=lotto.length;
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1; //0~44����
			System.out.println("lotto["+i+"]="+lotto[i]);
		}
		
		System.out.println("Math.random()");
		for(int i=0;i<10;i++) {
			System.out.print((int)(Math.random()*45)+",");
		}
	}

}
