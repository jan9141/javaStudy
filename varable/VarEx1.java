package org.java.varable;

public class VarEx1 {
	public static void main(String[] args) {
		System.out.println("����, ������ Ÿ��");
		System.out.println("primitive types");
		
		
		// 1byte = 8bit	-2^8~+2^-1	-128~+127
		//������ ������	
		byte b=10; //������ ������1byte�� ���� �Ҽ� �ִ� ���� b�� �����ϰ�10���� �ʱ�ȭ �ߴ�.
		short s=10;// ������ ������ 2byte�� ���� �Ҽ� �ִ� ����s�� �����ϰ� 10���� �ʱ�ȭ�ߴ�.
		int i=10;// ������ ������ 4byte�� ���� �Ҽ� �ִ� ����i�� �����ϰ� 10���� �ʱ�ȭ�ߴ�.
		long l=10l;// ������ ������ 8byte�� ���� �Ҽ� �ִ� ����l�� �����ϰ� 10���� �ʱ�ȭ�ߴ�.
		//�Ǽ��� ������
		float f=1.1f;// �Ǽ��� ������ 4byte�� ���� �Ҽ� �ִ� ����f�� �����ϰ� 1.1f�� �ʱ�ȭ �ߴ�.
		double d=1.1;// �Ǽ��� ������ 8byte�� ���� �Ҽ� �ִ� ����d�� �����ϰ� 1.1�� �ʱ�ȭ �ߴ�.
		//������ ������
		char ch='a'; // ������ ������ 2byte�� ���� �Ҽ� �ִ� ����ch�� �����ϰ� 'a'�� �ʱ�ȭ �ߴ�.
		//���� ������
		boolean bool=false; //boolean�� 1byte�� ���� �Ҽ� �ִ� ���� bool�� �����ϰ� false�� �ʱ�ȭ �ߴ�.
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}

}
