package org.java.Array;

public class Array6 {
	public static void main(String[] args) {
		System.out.println("배열 성적");
		System.out.println("번호\t국어\t수학\t영어\t종합\t평균");
		System.out.println("======================================");
		int[][] score = { // 5행 3열의 다차원 배열
				{100,66,77},
				{88,66,88},
				{80,46,97},
				{70,88,80},
				{100,90,88}
			};
		
		int k=0;
		int m=0;
		int e=0;
		double a1=0.0;
		
		for(int i=0;i<score.length;i++) {
			
			int s=0;
			System.out.print((i+1)+"\t"); //번호
			k+=score[i][0];
			m+=score[i][0];
			e+=score[i][0];
			
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				s+=score[i][j];
			}
			
			a1=Math.round((double)s/score[i].length);
			
			System.out.println(s+"\t"+a1);
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println("총점:\t" + k + "\t" +e+ "\t" +m);
		System.out.println("=========================");
		
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length;// 배열의 길이
		
		double totalavg = 0.0; //종합 총점 평균
		int totalSum=0; // 종합 총점
		System.out.println("중간고사 성적표");
		System.out.println("번호\t국어\t수학\t영어\t종합\t평균");
		System.out.println("=========================================");
		for(int i=0;i<scoreLength;i++) {
			int sum=0;
			System.out.print((i+1)+"\t"); //번호
			kor+=score[i][0]; // score배열의 0번지 합계(국어)
			eng+=score[i][1]; // score배열의 0번지 합계(영어)
			math+=score[i][2]; // score배열의 0번지 합계(수학)
			
			for(int j=0;j<score[i].length;j++) { // 행 실행(5행)
				System.out.print(score[i][j]+"\t"); // 각 과목의 점수
				sum += score[i][j]; //총점
				totalSum+=score[i][j];
			}
			avg=Math.round(sum/(double)score[i].length); //평균(반올림)
			totalavg=Math.round(totalSum/(double)score[i].length); //종합 총점 평균(반올림)
							// 총점		// 평균
			System.out.println(sum + "\t" + avg);
		}
		
		System.out.println("===========================================");
		System.out.println("총점:\t" + kor + "\t" + eng + "\t" + math + "\t"+ totalSum + "\t" + totalavg);
	}
}
