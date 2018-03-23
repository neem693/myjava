package java_example;

public class SecondQuiz_with_Teacher {

	public static void main(String[] args) {
		// -------------------------------------
		int num = 0;
		boolean isPrime = true;
		// String prime_msg = "소수";
		// -------------------------------------
		// -----------------------------
		num = 7;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				// prime_msg = "비소수";
				break;
			}
		}

		// ------------------------------
		// ------------------------------
		System.out.println(num +"은(는)" + (isPrime ? "소수" : "비소수"));
		// ------------------------------

	}

}
