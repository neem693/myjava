package java_example;

import java.util.ArrayList;
import java.util.Scanner;

//수정내역: 성적처리 재확인 반복
public class FiveQuiz_SungerkMgr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수정내역: 합격여부 출력
		// 평균이 60이상인 경우 '합격', 아니면 '재시험'
		Scanner console = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		int hap = 0;
		double avg = 0.0;
		boolean pass = false;
		boolean again = true;
		String pass_msg, exit = "N";
		while (again) {

			System.out.print("국어의 점수를 입력하십시오");
			kor = console.nextInt();

			System.out.print("영어의 점수를 입력하십시오");
			eng = console.nextInt();

			System.out.print("수학의 점수를 입력하십시오");
			math = console.nextInt();

			// ----------------------
			hap = kor + eng + math;// 총점연산수식
			avg = (double) hap / 3;
			pass = avg >= 60.0 ? true : pass;
			// pass_msg = pass?"축하합니다~ 합격하셨습니다!":"에구.. 불학격이에요. 재시험 고고";
			if (avg >= 60.0) {
				pass_msg = "합격";

			} else {
				pass_msg = "재시험";

			}
			// ----------------------

			System.out.println("총점:" + hap);
			// System.out.println(avg);
			System.out.printf("평균:%.2f%n", avg);
			// printf("%.소수이하자리수f",출력값);
			System.out.println(pass_msg);
			System.out.print("종료하시겠습니까?(y시 종료)>>");
			exit = console.next();
			if (exit.equals("y") || exit.equals("Y")) {
				System.out.println("프로그램을 종료합니다.");
				again = false;
			}
		}
		// 소수점 예제
		// int n1 = 1;
		// double n2 = 1.5;
		//
		// System.out.printf("%.3f%n", (double) n1 + (int) n2);
		//
		// System.out.printf("%.3f%n", 1.2345);
		// 끝수는 반올림

	}

}
