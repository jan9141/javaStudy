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
			
			// if문을 이용해서 0~9까지만 출력 되게 해보세요
			if(i2>=9) break;
			i2++;
			
		}

				
			
			
	}
}
