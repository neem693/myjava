package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class PCBangExit_Idid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Էº��� --------------------
		Scanner console = new Scanner(System.in);
		int age;
		//int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int hour = 23;
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		//---------------------------
		
		//��º���-----------------------
		String allowPc;
		//-----------------------------
		
		System.out.print("���̸� �Է��ϼ���:");
		age = console.nextInt();
		console.close();
		allowPc = age<20&&hour>22 ? "û�ҳ� �̹Ƿ� PC���� �� �̻� �̿��� �� �����ϴ�." : "��� �ϼ���.";
		System.out.println(allowPc);

	}

}
