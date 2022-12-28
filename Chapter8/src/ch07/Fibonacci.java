package ch07;

public class Fibonacci {

	int[] value;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		value = new int[number];
	}
	
	public int fibonacciRecur(int n) {		//1¹ø
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
	}
	
	public int fibonacciIter(int n) {		//2¹ø
		
		int ppre = 0;
		int pre = 1;
		int current = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for(int i=2; i<n+1; i++) {
			current = ppre + pre;
			ppre = pre;
			pre = current;
		}
		return current;
	}
	
	public int fibonacciMem(int n) {		//3¹ø
		
		value[0] = 0;
		value[1] = 1;
		int result = 0;
		
		if(n == 0) return value[0];
		if(n == 1) return value[1];
		
		for(int i=2; i< n+1; i++) {
			result = value[i-1] + value[i-2];
			
			if(value[i] == 0) {
				value[i] = result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci(100);
		
		int m = 3;
		
		int result = fib.fibonacciRecur(m);
		System.out.println(result);
		
		result = fib.fibonacciIter(m);
		System.out.println(result);
		
		result = fib.fibonacciMem(m);
		System.out.println(result);
	}

}
