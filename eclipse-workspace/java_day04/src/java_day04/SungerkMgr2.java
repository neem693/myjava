package java_day04;

public class SungerkMgr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=0;
		int eng=0;
		int math=0;
		
		int hap = 0;
		double avg = 0.0;
		kor = 1;
		eng = 2;
		math = 4;
		
		//----------------------
		hap = kor + eng + math;//�����������
		avg = (double)hap/3;
		//----------------------
		
		System.out.println("���� = " +hap);
		//System.out.println(avg);
		System.out.printf("%.2f%n",avg);
		//printf("%.�Ҽ������ڸ���f",��°�);
		
		int n1 =1;
		double n2 = 1.5;
		
		System.out.printf("%.3f%n",(double)n1 + (int)n2);
		
		System.out.printf("%.3f%n",1.2345);
		//������ �ݿø�
		
		
		

	}

}
