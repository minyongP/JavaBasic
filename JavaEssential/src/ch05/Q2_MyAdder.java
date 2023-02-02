package ch05;
interface AdderInterface{  
	int add(int x, int y);	//sum x, y
	int add(int n);	// sum 1~n , n>0
}
public class Q2_MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		int sum = 0;
		for(int i=1; i<n+1; i++) {  
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Q2_MyAdder adder = new Q2_MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}

}
