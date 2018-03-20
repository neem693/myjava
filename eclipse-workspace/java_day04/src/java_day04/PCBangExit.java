package java_day04;

import java.util.Calendar;
import java.util.Scanner;

public class PCBangExit {

	public static void main(String[] args) {
		//입력제어
		//미성년은 오후 10시 이후에는 퇴실
		//1.입력변수: 나이, 시
		//2.출력변수: 메세지(미성년자인경우 '퇴실')
		//3.연산과정
		//나이 입력받자.
		//나이로 성년판별 = 난나이>=19?"퇴실":"미성년";
		//미성년인 경우 si>=12?"오후":"오전";
		//시제품 = 프로토타입
		int age =15;
		int cur_si =Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		//------------------
		String msg = "퇴실";
		//------------------
		System.out.print("나이>>");
		Scanner console =new Scanner (System.in);
		//콘솔창에 입력된 나이를 가져옴
		age = console.nextInt();
		String adult = age >=19?"성년":"미성년";
		String desc = adult == "미성년"?(cur_si>=22?"퇴실":"미퇴실"):("좋은하루 되세요");
		System.out.println(desc);

	}

}
