package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDtoMain {
	public static void main(String[] args) {
		
		MemberDto member = new MemberDto();
		
		member.setUserId("jan9");
		member.setUserPw("8285");
		member.setUserName("jjh");
		member.setUserAge(28);
		member.setUserAddr("����� �߶���");
		member.setUserPhone("010-5877-3385");
		member.setDay(new Date()); // ���� �ð�

//		member.toString();
		String userId=member.getUserId();
		String userPw=member.getUserPw();
		String userName=member.getUserName();
		int userAge=member.getUserAge();
		String userAddr=member.getUserAddr();
		String userPhone=member.getUserPhone();
		Date day=member.getDay();
		
		// ��¥�� format
		SimpleDateFormat sDay = 
				new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		String now=sDay.format(day);
		
		
		System.out.println("���̵�: "+userId);
		System.out.println("��й�ȣ: "+userPw);
		System.out.println("�̸�: "+userName);
		System.out.println("����: "+userAge);
		System.out.println("�ּ�: "+userAddr);
		System.out.println("��ȣ: "+userPhone);
		System.out.println("��¥: "+now);
		
		System.out.println("===============================================");
		
		MemberDto mem2 = new MemberDto();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���");
		mem2.setUserId(scn.next());
		System.out.println("��й�ȣ�� �Է��ϼ���");
		mem2.setUserPw(scn.next());
		System.out.println("�̸��� �Է��ϼ���");
		mem2.setUserName(scn.next());
		System.out.println("���̸� �Է��ϼ���");
		mem2.setUserAge(scn.nextInt());
		System.out.println("�ּҸ� �Է��ϼ���");
		mem2.setUserAddr(scn.next());
		System.out.println("��ȣ�� �Է��ϼ���");
		mem2.setUserPhone(scn.next());
		System.out.println("��¥�� �Է��ϼ���");
		mem2.setDay(new Date());// ���� �ð�
		
		System.out.println("���̵�: " + mem2.getUserId());
		System.out.println("��й�ȣ: " + mem2.getUserPw());
		System.out.println("�̸�: " + mem2.getUserName());
		System.out.println("����: " + mem2.getUserAge());
		System.out.println("�ּ�: " + mem2.getUserAddr());
		System.out.println("��ȣ: " + mem2.getUserPhone());
		System.out.println("��¥: " + sDay.format(mem2.getDay()));
		
		scn.close();
	}
}
