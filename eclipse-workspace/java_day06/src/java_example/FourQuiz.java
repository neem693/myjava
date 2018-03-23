package java_example;

import java.util.Stack;

public class FourQuiz {
//12345->1+2+3+4+5 = 15

	public static void main(String[] args) {
		int num=123456;
		int hap=0;
		boolean again= true;
		
		while(again) {
			hap+=num%10;
			num= num/10;
			if(num<10) {
				hap+=num;
				again = false;
			}
		}
		System.out.println(hap);
		

	}

}
