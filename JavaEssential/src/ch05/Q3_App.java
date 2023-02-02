package ch05;
import java.util.Scanner;
abstract class Calculator{  
	protected int a, b;
	abstract protected int calc();
	protected void input() {  
		Scanner scanner = new Scanner(System.in);
		System.out.print("input 2 integer>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	public void run() {  
		input();
		int res = calc();
		System.out.println("answer = " + res);
	}
}

class Adder extends Calculator{

	@Override
	protected int calc() {
		int res = super.a + super. b;
		return res;
	}  
}

class Subtracter extends Calculator{

	@Override
	protected int calc() {
		int res = super.a - super.b;
		return res;
	}  
}

public class Q3_App{
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter subtracter = new Subtracter();
		
		adder.run();
		subtracter.run();
	}
	
}
