package java_day05;
//����� �Է��� �� ���� �Է¹ݺ�

import java.util.Scanner;

public class ContinueBasic {

	public static void main(String[] args) {

		int num = 0;
		boolean input = true;
		String s;
		Scanner console = new Scanner(System.in);
		// �ݺ� ���۹�
		do {
			System.out.print("����>>");
			num = console.nextInt();
			if (num <= 0) {
				System.out.print("����� �Է°���");
				continue;
			}
			System.out.println(num);
			System.out.print("���α׷� ����?(y/n)>>");
			s = console.next();
			if (s.equals("y")) {
				System.out.println("���α׷� ��������");
				break;
			} else {
				continue;
			}
			// �ݺ��� ��������---
		} while (input);
	}

}
