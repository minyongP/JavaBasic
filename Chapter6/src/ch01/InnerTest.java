package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	
	class InClass{
		int iNum = 100;
		
//		static int sInNum = 500;   불가능
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InStaticClass sINnum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
//			num += 10;		외부 클래스 인스턴트 변수 불가
//			inNum += 10;	내부 클래스 인스턴트 변수 불가
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InStaticClass sINnum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}



public class InnerTest {
	
	public static void main(String[] args) {
		/*
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		*/
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
				OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
				System.out.println("정적 내부 클래스 일반 메서드 호출");
				sInClass.inTest();
				System.out.println();
				
				System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
				OutClass.InStaticClass.sTest();

	}

}
