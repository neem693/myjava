package java_day05;

import java.util.Calendar;

public class IFUsage {

	public static void main(String[] args) {

		int num = -1;

		//
		/*
		 * if (num > 0) { System.out.println("num�� ���"); }else {
		 * System.out.println("num�� �����̰ų� 0"); }
		 */
		
		//if (num > 0) {
		//	System.out.println("num�� ���");
		//} else {
		//	if (num == 0) {
		//		System.out.println("num�� 0");
		//	} else {
		//		System.out.println("num�� ����");
		//	}
		//}
		//�����̸� �����
		//���,0,���� ���
		
		if(num>0) {
			System.out.println("num�� ���");
		}else if(num ==0) {
			System.out.println("num�� 0");
			
		}else {
			System.out.println("num�� ����");
		}
		
		
		if(num<0) {
			num*=-1;
			//System.out.println(num);
		}

		if (num % 2 == 0) {
			System.out.println("num�� ¦��");
		} else {
			System.out.println("num�� Ȧ��");
		}
		
		//�����̸� �����
		//1~100 ���� ����
		if(num>=1 && num<=100) {
			
		}
		//1~100 ������ �ܺ�
		else if(!(num>=1&&num<=100)) {
			
		}
		//1~100 �ܺ�
		else if(num<1 || num>100) {
			
		}
		//4�� ������ 0�̵ǰ�, 100���� ������ 0�ƴϰų�, 400���� ������ 0�� �� �� ���� ��, True �̰Թٷ� ����
		int year=Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		if(ennun(year)) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("����Դϴ�.");
		}
		
		
		

	}
	public static boolean ennun(int year) {
		
		if(year%4==0&&(year%100!=0||year%400==0))
		return true;
		else return false;
	}
	

}
