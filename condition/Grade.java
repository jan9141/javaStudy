package org.java.condition;

public class Grade {
	//(필드, 프로퍼티)
	private int kor; //인스턴트 멤버 (필드, 프로퍼티)
	private int eng; // 인스턴스 멤버
	private int math;
	//contstruct (생성자)
	public Grade (int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//매서드(method)
	public void sumGrade() {
		System.out.println("국어:"+"kor");
		System.out.println("영어:"+"eng");
		System.out.println("수학:"+"math");
		int sum=kor+eng+math;
		System.out.println("총점:"+sum);
	}
	public void avgGrade() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("평균:"+avg);
	}
	
	public double avgGet( ) {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	}
}
