package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {
	public static void main(String[] args) {
		// �� ���ڿ� ������(+-*/)�Է� �޾Ƽ� ������ �ż��带 ����
		// while���� �̿��ؼ� ���� �ݺ� -> z�� �Է��ϸ� while���� ����
		// �� ���� �Է� setter
		// + sum(), -sub(),*multi(),/div() ȣ�� �ǵ��� �غ�����
		Calculator1 calc = new Calculator1();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("ù��° ���� �Է�");
			int num1 = scn.nextInt();

			System.out.println("�ι�° ���� �Է�");
			int num2 = scn.nextInt();

			System.out.println("�����ڸ� �Է�");
			String op = scn.next();
			
			calc.setNum1(num1);
			calc.setNum2(num2);
			
			if (op.equals("+")) {
				calc.sum();
			}else if (op.equals("-")) {
				System.out.println(calc.getNum1() + "-" + calc.getNum2() + "=" + calc.sub());
			}else if (op.equals("*")) {
				System.out.println(calc.getNum1() + "*" + calc.getNum2() + "=" + calc.multi());
			}else if (op.equals("/")) {
				System.out.println(calc.getNum1() + "/" + calc.getNum2() + "=" + calc.div());
			}else if (op.equals("z")) {
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println("������ �Է� ����");
			}
			
		}
		scn.close();
	}
}
