package java_example;

public class FisrtQuiz_smallNumber {
	// 소수점 이하 작은수(SmallNumber) 추출 출력
	// 클린(이해쉬운 정리된)코드-->코드 리펙토링 필요
	public static void main(String[] args) {
		double num, result;
		int y;
		// --------------------
		num = 1.2;
		y = (int) num;
		System.out.println(num);
		System.out.println(y);
		// --------------------
		// --------------------
		num = num - y;
		result = num;
		// --------------------
		// ---------------------
		System.out.printf("%.1f", result);
		// ---------------------
	}

}
