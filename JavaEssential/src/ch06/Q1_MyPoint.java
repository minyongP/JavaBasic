package ch06;
public class Q1_MyPoint { 
	private int a, b;
	public Q1_MyPoint(int a, int b){  
		this.a = a;
		this.b = b;
	}
	public String toString() { 
		return getClass().getName() + "(" + a + "," + b+ ")";
	}
	public static void main(String[] args) {
		Q1_MyPoint a = new Q1_MyPoint(3, 20);
		System.out.println(a);
	}
}
