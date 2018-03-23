package java_example;

import java.util.Calendar;
import java.util.Scanner;

public class ThirdQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int days = 0;
		int month;
		boolean again = true;
		while (again) {
			System.out.print("달을 입력하세요>>");
			month = console.nextInt();

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				again = false;
				days = 31;

				break;
			case 4:
			case 6:
			case 9:
			case 11:
				again = false;
				days = 30;
				break;
			case 2:

				again = false;
				if (ennun(year))
					days = 29;
				else
					days = 28;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			if (again)
				continue;
			System.out.println(days);
			break;
		}
	}

	public static boolean ennun(int year) {

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

}
