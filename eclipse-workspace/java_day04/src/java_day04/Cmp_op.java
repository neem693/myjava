package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class Cmp_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 6;
		// 실제 시간(24시)
		int si = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int bun = Calendar.getInstance().get(Calendar.MINUTE);

		System.out.println(si + "시");
		System.out.println(5 < 6);
		System.out.println(n1 < n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(si >= 12);

		String ampm = si >= 12 ? "오후" : "오전";
		System.out.println("시간대=" + ampm);
		//-------------------------------------------------
		System.out.println(si +"시" + bun + "분");

	}

}
