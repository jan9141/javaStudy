package org.java.variable2;

public class TypeCasting {
	public static void main(String[] args) {
		
		System.out.println("����ȯ");
		//int�� �Ʒ� ����� �ڵ����� int������ ����ȯ �ȴ�
		byte b1=10;
		byte b2=20;
		//byte + byte = int + int
		byte b3=(byte)(b1+b2);
		int i=b1+b2;
		System.out.println(i);
		//ū�� + ������ >> ū������ �ڵ����� ����ȯ
		int i2=10;
		double d=1.1;
		int i22=(int)(i2+d);
		//int i3= i2+d;//double + double
		double d2=i2+d;
		System.out.println(d2);
		
		int i3=i2+(int)d;
		int i4=(int)(i2+d);
		System.out.println(i3);
		System.out.println(i4);
		
		
	}
}