package org.java.condition;

public class Grade {
	//(�ʵ�, ������Ƽ)
	private int kor; //�ν���Ʈ ��� (�ʵ�, ������Ƽ)
	private int eng; // �ν��Ͻ� ���
	private int math;
	//contstruct (������)
	public Grade (int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//�ż���(method)
	public void sumGrade() {
		System.out.println("����:"+"kor");
		System.out.println("����:"+"eng");
		System.out.println("����:"+"math");
		int sum=kor+eng+math;
		System.out.println("����:"+sum);
	}
	public void avgGrade() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("���:"+avg);
	}
	
	public double avgGet( ) {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	}
}
