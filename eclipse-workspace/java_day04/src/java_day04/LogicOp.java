package java_day04;

public class LogicOp {

	public static void main(String[] args) {
		int num1  =10,num2 =20;
		boolean res = false;
		res = (num1==10 && num2 ==20);
		System.out.println(res);
		
		res = (num1<10&&num2==20);
		System.out.println(res);
		
		res = (num1<10 || num2==20);
		System.out.println(res);
		
		res = (!(num1<10) && !(num2==20));
		System.out.println(res);
		
		res = (!(num1<10 && num2==20));
		System.out.println(res);
		
		res=(-num1==10);
		System.out.println(res);//False
		

		res=(+num1==10);
		System.out.println(res);//False

	}

}
