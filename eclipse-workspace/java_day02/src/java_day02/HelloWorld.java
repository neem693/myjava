package java_day02;

public class HelloWorld {
//메인메소드(기능)
//메소드명()
	public static void main(String[] args) {
		//객체지향적 : 편리한 사용성 (기능들을 종류별로 별도의 클래스 파일에 분리 저장(모듈(파일)화)
		System.out.println("HelloWorld...");
		//HelloWorldSub의 sub() 호출하여 실행시킴
		Hws.sub();
		//JVM메소드의 { }에 작성된 코드를 실행
		System.out.println("ByeWorld");
	}
	
}
