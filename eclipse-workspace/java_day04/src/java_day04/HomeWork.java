package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int age;
		String allowPc;
		//int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int hour = 23;
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		System.out.print("���̸� �Է��ϼ���:");
		age = console.nextInt();
		console.close();
		allowPc = age<20&&hour>22 ? "û�ҳ� �̹Ƿ� PC���� �� �̻� �̿��� �� �����ϴ�." : "��� �ϼ���.";
		System.out.println(allowPc);

	}

}
