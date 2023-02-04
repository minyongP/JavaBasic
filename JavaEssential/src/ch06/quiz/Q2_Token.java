package ch06.quiz;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q2_Token {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {  
			String line = scanner.nextLine();
			if(line.equals("exit")) break;
			StringTokenizer st = new StringTokenizer(line, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
		scanner.close();
	}
}
