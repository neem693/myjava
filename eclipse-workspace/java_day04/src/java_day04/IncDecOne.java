package java_day04;

public class IncDecOne {

	public static void main(String[] args) {
		int num = 7;
		num = num + 1;
		num+=1;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		
		boolean res = -num -- <=-8;// -8 <=-8 -> T
		System.out.println(res); //T
		System.out.println(num); //8
		num++;
		res = (--num <=-8 || ++num > 8);

		System.out.println(res);
		System.out.println(num);
		
		res = (num+2<=-8 && num*2>8);
		System.out.println(res);
	}

}
