package org.java.Operator;

public class Operator2 {
	public static void main(String[] args) {
		System.out.println("비교 연산자(왼쪽)");
		
		int num1 = 10;
		int num2 = 50;
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		//문자열
		String str1=new String();
		String str2=new String();
		str1="java";
		str2="java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3="java";
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		String userId="m1111";
		String userPw="1111";
		
		if(userId=="m1111") {
			System.out.println("아이디가 같습니다.");
		}
		if(userPw=="1111") {
			System.out.println("비밀번호가 같습니다.");
		}
		
	}
}
