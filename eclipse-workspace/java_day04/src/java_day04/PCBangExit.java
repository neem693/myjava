package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class PCBangExit {

	public static void main(String[] args) {
		//�Է�����
		//�̼����� ���� 10�� ���Ŀ��� ���
		//1.�Էº���: ����, ��
		//2.��º���: �޼���(�̼������ΰ�� '���')
		//3.�������
		//���� �Է¹���.
		//���̷� �����Ǻ� = ������>=19?"���":"�̼���";
		//�̼����� ��� si>=12?"����":"����";
		//����ǰ = ������Ÿ��
		int age =15;
		int cur_si =Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		//------------------
		String msg = "���";
		//------------------
		System.out.print("����>>");
		Scanner console =new Scanner (System.in);
		//�ܼ�â�� �Էµ� ���̸� ������
		age = console.nextInt();
		String adult = age >=19?"����":"�̼���";
		String desc = adult == "�̼���"?(cur_si>=22?"���":"�����"):("�����Ϸ� �Ǽ���");
		System.out.println(desc);

	}

}
