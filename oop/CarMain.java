package org.java.oop;

public class CarMain {
	public static void main(String[] args) {
		
		Car.CityPop="����";
		
		// aCar -> ��ü�������� (������ ��ü�� �ּҰ�)->��ü
		// new ->  ��ü���� ������
		// Ŭ���� -> ����� ���� Ÿ��
		
		Car acar=new Car();
		System.out.println(acar.CityPop);
		//��ü�� �⺻ ���� null
		acar.carName="Acar";
		acar.carCoin=10000;
		acar.carYear=2020;
		acar.carWidth=150;
		
		//private ��� setter
		acar.setOption1("option1"); //private setters
		
		acar.instanceMethod1();
		acar.instanceMethod2();
		acar.instanceMethod3();
		acar.instanceMethod4();
		//private ��� getter
		//�ż����� return���� ȣ��(call)�� ���� return �ȴ�.
		String option1=acar.getOption1();
		System.out.println(option1);
		System.out.println(acar.getOption1());
		System.out.println("=========================");
		//bcar
		Car bcar=new Car();
		
		System.out.println(bcar.CityPop);
		
		bcar.carName="Bcar";
		bcar.carCoin=12000;
		bcar.carYear=20200614;
		bcar.carWidth=200;
		bcar.setOption2("option2"); //private setters
		
		bcar.instanceMethod1();
		bcar.instanceMethod2();
		bcar.instanceMethod3();
		bcar.instanceMethod4();
		System.out.println(bcar.getOption2());
		System.out.println(acar.equals(bcar));
	}
}
