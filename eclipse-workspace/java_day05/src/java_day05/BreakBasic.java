package java_day05;

//1~100,5�� 7�� �ּҰ���� 
// ��� : 

public class BreakBasic {

	public static void main(String[] args) {
		int num = 1;
		boolean search = false;

		while (num <= 10) {

			if (num % 5 == 0 && num % 7 == 0) {// 5�� 7�� �ּ� ����� ����

				//System.out.println(num);
				search = true;
				break;// 35,70���� �ϳ��� ������ �ϴ� ���̴�.

			}

			num++;
		}
		if (!search)
			System.out.println("����.");
		else
			System.out.println(num);

	}

}
