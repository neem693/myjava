package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class PCBangExit_Idid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력변수 --------------------
		Scanner console = new Scanner(System.in);
		int age;
		//int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int hour = 23;
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		//---------------------------
		
		//출력변수-----------------------
		String allowPc;
		//-----------------------------
		
		System.out.print("나이를 입력하세요:");
		age = console.nextInt();
		console.close();
		allowPc = age<20&&hour>22 ? "청소년 이므로 PC방을 더 이상 이용할 수 없습니다." : "계속 하세요.";
		System.out.println(allowPc);

	}

}
