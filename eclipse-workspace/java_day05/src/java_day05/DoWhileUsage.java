package java_day05;

public class DoWhileUsage {
	// 조건식의 결과가 참인 동안
	// 짝수만 출력
	// 처리기능 : 짝수합 및 홀수합 출력 (전제조건 감안)
	// 반복합에는 누적변수 필요
	public static void main(String[] args) {

		int num = 1;
		int sum_even = 0;
		int sum_odd = 0;
		int sum_all = 0;

		do { // 최대값 = while(num<6)
			if (num % 2 == 1) {
				sum_odd += num;
			} else if (num % 2 == 0) {
				//System.out.println(num + "번 학생");
				sum_even += num;
			}
//			sum_all += num;
			num++;

		}while (num <= 5);
		System.out.println("짝수 합 출력: " + sum_even);
		System.out.println("홀수 합 출력: " + sum_odd);
		//System.out.println("총합 출력: " + sum_all);
		System.out.println(sum_even + sum_odd);

		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num++);
		// System.out.println(num);

	}

}
