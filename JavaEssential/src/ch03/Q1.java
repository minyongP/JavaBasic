package ch03;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input alphabat >>");
		String alp= scanner.next();
		char fir = alp.charAt(0);
		
		for(int i='a'; i<=fir; i++) {
			
			System.out.print((char)i);
			
			for(int j=i+1; j<=fir; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
