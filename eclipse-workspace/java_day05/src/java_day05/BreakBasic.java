package java_day05;

//1~100,5와 7의 최소공배수 
// 기능 : 

public class BreakBasic {

	public static void main(String[] args) {
		int num = 1;
		boolean search = false;

		while (num <= 10) {

			if (num % 5 == 0 && num % 7 == 0) {// 5와 7의 최소 공배수 조건

				//System.out.println(num);
				search = true;
				break;// 35,70에서 하나만 나오게 하는 것이다.

			}

			num++;
		}
		if (!search)
			System.out.println("없다.");
		else
			System.out.println(num);

	}

}
