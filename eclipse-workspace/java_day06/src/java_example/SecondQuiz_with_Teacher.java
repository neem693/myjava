package java_example;

public class SecondQuiz_with_Teacher {

	public static void main(String[] args) {
		// -------------------------------------
		int num = 0;
		boolean isPrime = true;
		// String prime_msg = "�Ҽ�";
		// -------------------------------------
		// -----------------------------
		num = 7;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				// prime_msg = "��Ҽ�";
				break;
			}
		}

		// ------------------------------
		// ------------------------------
		System.out.println(num +"��(��)" + (isPrime ? "�Ҽ�" : "��Ҽ�"));
		// ------------------------------

	}

}
