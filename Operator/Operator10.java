package org.java.Operator;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("삼항 연산자");
		
		int i = 10;
		
		System.out.println ( i > 10 ? true : false);
		String rs =	i>10? "10보다 큽니다" : "10보다작습니다";
		boolean bool = i > 10 ? true : false;
		int i2 = i > 10 ? 1 : 0;
		double d = i > 10 ? 1.1 : 0.1;
		char ch = i > 10 ? 'a' : 'b';
		
		System.out.println(rs);
		System.out.println(bool);
		System.out.println(i2);
		System.out.println(d);
		System.out.println(ch);
		

	}
}
