package java_day03;

public class EmpMgr2 {
	
	public static void main(String[] args) {
	//수정내역 : 연산자(산술 연산자 : + , - , *,/) 반영
	//CTRL + F11 실행단축키
		//메모리 (변수)선언문
		//변수 = 수식;
		int 급여; //
		int 인상률;
		급여 = 100;
		인상률= 15;//배율
		System.out.println(급여);
		
		급여 = 급여 + 급여*인상률/100;
		System.out.println("인상된 급여");
		System.out.println(급여);
		급여 = 0;
		//연산자 반영
	
	}
	

}
