package java_day05;
//양수만 입력할 때 까지 입력반복

import java.util.Scanner;

public class ContinueBasic {

	public static void main(String[] args) {

		int num = 0;
		boolean input = true;
		String s;
		Scanner console = new Scanner(System.in);
		// 반복 시작문
		do {
			System.out.print("정수>>");
			num = console.nextInt();
			if (num <= 0) {
				System.out.print("양수만 입력가능");
				continue;
			}
			System.out.println(num);
			System.out.print("프로그램 종료?(y/n)>>");
			s = console.next();
			if (s.equals("y")) {
				System.out.println("프로그램 정상종료");
				break;
			} else {
				continue;
			}
			// 반복할 마지막문---
		} while (input);
	}

}
