package java_day05;

import java.util.Calendar;

public class IFUsage {

	public static void main(String[] args) {

		int num = -1;

		//
		/*
		 * if (num > 0) { System.out.println("num은 양수"); }else {
		 * System.out.println("num은 음수이거나 0"); }
		 */
		
		//if (num > 0) {
		//	System.out.println("num은 양수");
		//} else {
		//	if (num == 0) {
		//		System.out.println("num은 0");
		//	} else {
		//		System.out.println("num은 음수");
		//	}
		//}
		//음수이면 양수로
		//양수,0,음수 경우
		
		if(num>0) {
			System.out.println("num이 양수");
		}else if(num ==0) {
			System.out.println("num이 0");
			
		}else {
			System.out.println("num이 음수");
		}
		
		
		if(num<0) {
			num*=-1;
			//System.out.println(num);
		}

		if (num % 2 == 0) {
			System.out.println("num은 짝수");
		} else {
			System.out.println("num은 홀수");
		}
		
		//음수이면 양수로
		//1~100 사이 내부
		if(num>=1 && num<=100) {
			
		}
		//1~100 나머지 외부
		else if(!(num>=1&&num<=100)) {
			
		}
		//1~100 외부
		else if(num<1 || num>100) {
			
		}
		//4로 나눠서 0이되고, 100으로 나눠서 0아니거나, 400으로 나눠서 0이 될 수 있을 때, True 이게바로 윤년
		int year=Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		if(ennun(year)) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		
		
		

	}
	public static boolean ennun(int year) {
		
		if(year%4==0&&(year%100!=0||year%400==0))
		return true;
		else return false;
	}
	

}
