package org.java.oop;

public class Car {
	
	//���
	//�ν��Ͻ� ��� (�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	//final ����� ������ ���ÿ� �ʱ�ȭ �ؾߵȴ�. ���� �Ұ�
	//public static final String CITY="����";
	public static String CityPop;
	
	
	//private stter,getter �ż��� ����
	private String option1;
	private String option2;
	
	// setters -> private ��� �ʱ�ȭ
	public void setOption1(String option1) {
		this.option1=option1;
	}
	//getters -> private ��� get
	public String getOption1() {
		return this.option1;
	}
	// setters -> private ��� �ʱ�ȭ
	public void setOption2(String option2) {
		this.option2=option2;
	}
	//getters -> private ��� get
	public String getOption2() {
		return this.option2;
	}
	
	
	//�ν��Ͻ� ��� (�ż���)
	public void instanceMethod1() {
		System.out.println("�ڵ����̸�: "+this.carName);
	}
	//�ν��Ͻ� ��� (�ż���)
	public void instanceMethod2() {
		System.out.println("�ڵ�������: "+this.carCoin);
	}
	//�ν��Ͻ� ��� (�ż���)
	public void instanceMethod3() {
		System.out.println("�������: "+this.carYear);
	}
	//�ν��Ͻ� ��� (�ż���)
	public void instanceMethod4() {
		System.out.println("�ڵ����԰�: "+this.carWidth);
	}
}
