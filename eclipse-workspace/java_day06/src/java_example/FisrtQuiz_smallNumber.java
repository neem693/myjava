package java_example;

public class FisrtQuiz_smallNumber {
	// �Ҽ��� ���� ������(SmallNumber) ���� ���
	// Ŭ��(���ؽ��� ������)�ڵ�-->�ڵ� �����丵 �ʿ�
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
