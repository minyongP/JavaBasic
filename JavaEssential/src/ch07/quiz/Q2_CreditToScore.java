package ch07.quiz;
import java.util.*;
public class Q2_CreditToScore {

	public static void main(String[] args) {
		var origins = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 5; i++) {
			String tempString = scanner.next();
			char tempChar = tempString.charAt(0);
			origins.add(tempChar);
		}
		for (int i = 0; i < origins.size(); i++) {
			if(origins.get(i)=='A') {
				System.out.print(4.0);
			}
			else if(origins.get(i)=='B') {
				System.out.print(3.0);
			}
			else if(origins.get(i)=='C') {
				System.out.print(2.0);
			}
			else if (origins.get(i)=='D') {
				System.out.print(1.0);
			}
			else if(origins.get(i)=='F') {
				System.out.print(0.0);
			}
			else continue;
			System.out.print(" ");
		}
		

		scanner.close();
	}

}
