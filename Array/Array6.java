package org.java.Array;

public class Array6 {
	public static void main(String[] args) {
		System.out.println("�迭 ����");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("======================================");
		int[][] score = { // 5�� 3���� ������ �迭
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
			System.out.print((i+1)+"\t"); //��ȣ
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
		System.out.println("����:\t" + k + "\t" +e+ "\t" +m);
		System.out.println("=========================");
		
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length;// �迭�� ����
		
		double totalavg = 0.0; //���� ���� ���
		int totalSum=0; // ���� ����
		System.out.println("�߰���� ����ǥ");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("=========================================");
		for(int i=0;i<scoreLength;i++) {
			int sum=0;
			System.out.print((i+1)+"\t"); //��ȣ
			kor+=score[i][0]; // score�迭�� 0���� �հ�(����)
			eng+=score[i][1]; // score�迭�� 0���� �հ�(����)
			math+=score[i][2]; // score�迭�� 0���� �հ�(����)
			
			for(int j=0;j<score[i].length;j++) { // �� ����(5��)
				System.out.print(score[i][j]+"\t"); // �� ������ ����
				sum += score[i][j]; //����
				totalSum+=score[i][j];
			}
			avg=Math.round(sum/(double)score[i].length); //���(�ݿø�)
			totalavg=Math.round(totalSum/(double)score[i].length); //���� ���� ���(�ݿø�)
							// ����		// ���
			System.out.println(sum + "\t" + avg);
		}
		
		System.out.println("===========================================");
		System.out.println("����:\t" + kor + "\t" + eng + "\t" + math + "\t"+ totalSum + "\t" + totalavg);
	}
}
