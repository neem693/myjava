package java_example;

public class SecondQuiz_primeNumber {
//�Ҽ�(PrimeNumber) ���
	public static void main(String[] args) {
		
		// -�Է�-----------------
		int num;
		int div_num;
		// ------------------

		// -����-------------------
		for (num = 2; num <= 100; num++) {
			for (div_num = 2; div_num < num; div_num++) {
				if (num % div_num == 0) {
					// --���------------------
					System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
					break;
					// -----------------------
				}
			}
			// ----���----------------------
			if (num == div_num)
				System.out.println(num + "��(��) �Ҽ��Դϴ�.");
			// ----------------------------
		}
		// -----------------------

	}

}
