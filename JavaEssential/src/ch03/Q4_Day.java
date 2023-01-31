package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q4_Day {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dayStrings = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println("input integer>>");
		try {
			int dayNum = scanner.nextInt();
			
			if(dayNum == -1) {return;}
			
			dayNum %= 7;
			System.out.println(dayStrings[dayNum]);
		} catch (InputMismatchException e) {
			System.out.println("wraning!!");
		}
		scanner.close();
	}
}