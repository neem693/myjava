package java_day01;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("C:\\Users\\inc>");
		String s=console.next();
		console.close();
		System.out.println(s);
		System.out.println(" C:\\Users\\inc 디렉터리\r\n" + 
				"\r\n" + 
				"2018-03-14  오전 11:43    <DIR>          .\r\n" + 
				"2018-03-14  오전 11:43    <DIR>          ..\r\n" + 
				"2018-03-14  오후 12:15    <DIR>          .eclipse");

	}

}
