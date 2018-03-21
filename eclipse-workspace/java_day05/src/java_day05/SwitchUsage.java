package java_day05;

public class SwitchUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;

		switch (n) {

		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("몰라");
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		}
		// --------------------------
		switch (n % 2) {
		case 0:
			System.out.println("정수 n은 짝수입니다.");
			break;
		case 1:
			System.out.println("정수n은 홀수입니다.");
			break;
		default:
			System.out.println("잘못된 값이 들어왔습니다.");
		}

	}

}
