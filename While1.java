package org.java.Loop;

public class While1 {
	public static void main(String[] args) {
		System.out.println("While");
		
		int i=0;
		
		while(i < 10) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("===================");
		
		int i2=0;
		while(true) {
			System.out.println(i2);
			
			// if���� �̿��ؼ� 0~9������ ��� �ǰ� �غ�����
			if(i2>=9) break;
			i2++;
			
		}

				
			
			
	}
}
