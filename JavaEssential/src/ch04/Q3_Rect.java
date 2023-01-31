package ch04;
import java.util.Scanner;
public class Q3_Rect {

	private int widthInt, heightInt;
	public Q3_Rect(int widthInt, int heightInt) {  
		this.widthInt = widthInt;
		this.heightInt =heightInt;
	}
	public int getArea() { return widthInt*heightInt;}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q3_Rect[] rect = new Q3_Rect[4];
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			System.out.print("width & height>> ");
			rect[i] = new Q3_Rect(scanner.nextInt(), scanner.nextInt());
			sum += rect[i].getArea();
		}
		System.out.println(sum);
		scanner.close();
	}

}
