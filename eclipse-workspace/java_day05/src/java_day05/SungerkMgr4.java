package java_day05;

//��������: ���ǿ����� ������ if����� ����
public class SungerkMgr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������: �հݿ��� ���
		//����� 60�̻��� ��� '�հ�', �ƴϸ� '�����'
		int kor=0;
		int eng=0;
		int math=0;
		
		int hap = 0;
		double avg = 0.0;
		boolean pass =false;
		String pass_msg;
		
		
		kor = 55;
		eng = 50;
		math = 65;
		
		//----------------------
		hap = kor + eng + math;//�����������
		avg = (double)hap/3;
		pass = avg>=60.0?true:pass;
		//pass_msg = pass?"�����մϴ�~ �հ��ϼ̽��ϴ�!":"����.. ���а��̿���. ����� ���";
		if(avg >=60.0) {
			pass_msg = "�հ�";
			
		}else {
			pass_msg= "�����";
			
		}
		//----------------------
		
		
		System.out.println("����:" +hap);
		//System.out.println(avg);
		System.out.printf("���:%.2f%n",avg);
		//printf("%.�Ҽ������ڸ���f",��°�);
		System.out.println(pass_msg);
		//�Ҽ��� ����
		int n1 =1;
		double n2 = 1.5;
		
		System.out.printf("%.3f%n",(double)n1 + (int)n2);
		
		System.out.printf("%.3f%n",1.2345);
		//������ �ݿø�
		
		
		

	}

}
