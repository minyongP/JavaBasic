package ch06;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q4_TokenSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(line, "+");
		int sum=0;
		while(st.hasMoreTokens()) { 
			String temp = st.nextToken().trim();
			sum += Integer.parseInt(temp);

		}
		System.out.println("гую╨ " + sum);
		scanner.close();
	}

}
