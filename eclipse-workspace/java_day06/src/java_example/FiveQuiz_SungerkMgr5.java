package java_example;

import java.util.ArrayList;
import java.util.Scanner;

//��������: ����ó�� ��Ȯ�� �ݺ�
public class FiveQuiz_SungerkMgr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������: �հݿ��� ���
		// ����� 60�̻��� ��� '�հ�', �ƴϸ� '�����'
		Scanner console = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		int hap = 0;
		double avg = 0.0;
		boolean pass = false;
		boolean again = true;
		String pass_msg, exit = "N";
		while (again) {

			System.out.print("������ ������ �Է��Ͻʽÿ�");
			kor = console.nextInt();

			System.out.print("������ ������ �Է��Ͻʽÿ�");
			eng = console.nextInt();

			System.out.print("������ ������ �Է��Ͻʽÿ�");
			math = console.nextInt();

			// ----------------------
			hap = kor + eng + math;// �����������
			avg = (double) hap / 3;
			pass = avg >= 60.0 ? true : pass;
			// pass_msg = pass?"�����մϴ�~ �հ��ϼ̽��ϴ�!":"����.. ���а��̿���. ����� ���";
			if (avg >= 60.0) {
				pass_msg = "�հ�";

			} else {
				pass_msg = "�����";

			}
			// ----------------------

			System.out.println("����:" + hap);
			// System.out.println(avg);
			System.out.printf("���:%.2f%n", avg);
			// printf("%.�Ҽ������ڸ���f",��°�);
			System.out.println(pass_msg);
			System.out.print("�����Ͻðڽ��ϱ�?(y�� ����)>>");
			exit = console.next();
			if (exit.equals("y") || exit.equals("Y")) {
				System.out.println("���α׷��� �����մϴ�.");
				again = false;
			}
		}
		// �Ҽ��� ����
		// int n1 = 1;
		// double n2 = 1.5;
		//
		// System.out.printf("%.3f%n", (double) n1 + (int) n2);
		//
		// System.out.printf("%.3f%n", 1.2345);
		// ������ �ݿø�

	}

}
