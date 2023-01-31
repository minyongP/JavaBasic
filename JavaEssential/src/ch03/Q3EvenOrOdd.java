package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q3EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		
		try {
			int num = scanner.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		} catch (InputMismatchException e) {
			System.out.println("wrong");
		}
		
		scanner.close();
	}

}
