package java_example;

public class SecondQuiz_primeNumber {
//소수(PrimeNumber) 출력
	public static void main(String[] args) {
		
		// -입력-----------------
		int num;
		int div_num;
		// ------------------

		// -연산-------------------
		for (num = 2; num <= 100; num++) {
			for (div_num = 2; div_num < num; div_num++) {
				if (num % div_num == 0) {
					// --출력------------------
					System.out.println(num + "은(는) 소수가 아닙니다.");
					break;
					// -----------------------
				}
			}
			// ----출력----------------------
			if (num == div_num)
				System.out.println(num + "은(는) 소수입니다.");
			// ----------------------------
		}
		// -----------------------

	}

}
