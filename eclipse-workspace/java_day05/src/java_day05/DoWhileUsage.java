package java_day05;

public class DoWhileUsage {
	// ���ǽ��� ����� ���� ����
	// ¦���� ���
	// ó����� : ¦���� �� Ȧ���� ��� (�������� ����)
	// �ݺ��տ��� �������� �ʿ�
	public static void main(String[] args) {

		int num = 1;
		int sum_even = 0;
		int sum_odd = 0;
		int sum_all = 0;

		do { // �ִ밪 = while(num<6)
			if (num % 2 == 1) {
				sum_odd += num;
			} else if (num % 2 == 0) {
				//System.out.println(num + "�� �л�");
				sum_even += num;
			}
//			sum_all += num;
			num++;

		}while (num <= 5);
		System.out.println("¦�� �� ���: " + sum_even);
		System.out.println("Ȧ�� �� ���: " + sum_odd);
		//System.out.println("���� ���: " + sum_all);
		System.out.println(sum_even + sum_odd);

		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num);

	}

}
