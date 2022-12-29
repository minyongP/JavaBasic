package test5;

public class Adder implements AdderInterface{

											//인터페이스 상속
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int add(int n) {
		return n * (n + 1) / 2;
	}
	
	public static void main(String args[]) {

		Adder oper = new Adder();
		System.out.println(oper.add(1,10));
		System.out.println(oper.add(100));
	}
}