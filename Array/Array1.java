package org.java.Array;

public class Array1 {
	public static void main(String[] args) {

		System.out.println("배열");

		// int arr2[] = new int[5];
		// int형 데이터를 저장 할 수 있는 배열 arr1을 선언했다.
		int[] arr1 = new int[5];
		// 초기화
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;
//		arr1[3] = 4;
//		arr1[4] = 5;
//		System.out.println(arr1[0]);
		// for문을 이용해서 arr1를 01234로 초기화 하고 콘솔에 각 번지의 값을
		// 출력 해보세요

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 0 + 1;
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}

		System.out.println("배열의 총갯수:" + arr1.length);
		System.out.println("배열의 마지막 인덱스:" + (arr1.length - 1));

		// int형 데이터를 저장 할 수 있는 배열 arr3를 선언 하고 int형 12345로 초기화했다.
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };//
		// int형 데이터를 저장 할 수 있는 배열 arr4를 선언 하고 int형 12345로 초기화했다.
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
		
		// 1부터 45까지 정수값을 새로운 배열 lotto에 저장하고 콘솔에 각각의 요소값을 출력하세요
		int[] lotto=new int[45];
		int lottoSize=lotto.length;
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1; //0~44번지
			System.out.println("lotto["+i+"]="+lotto[i]);
		}
		
		System.out.println("Math.random()");
		for(int i=0;i<10;i++) {
			System.out.print((int)(Math.random()*45)+",");
		}
	}

}
