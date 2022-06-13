package org.java.Array;

public class LottoEx1 {
	public static void main(String[] args) {
		System.out.println("배열 예제");
		//배열 0번지~44번지...1부터 45까지 점수를 배열의 값
		
		// int형 data 45개를 저장 할 수있는 배열 lotto를 선언
		int[] lotto = new int[45];//0번지~44번지
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
			
		}
		
		int box=0;
		
		for(int i=0;i<10000;i++) {
			int idx=(int)(Math.random()*45);
			box=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=box;
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+",");
		}
	}
}
