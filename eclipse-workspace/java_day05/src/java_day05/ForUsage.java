package java_day05;

public class ForUsage {
	
	public static void main(String[] args) {
		int num;
		for(num =1;num<=5;num++) {
			System.out.println(num + "번 학생");
		}
		num=1;
		while (num < 6) {
			System.out.println(num++ + "번 학생");
		}
		
	}

}
