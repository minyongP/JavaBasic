package ch06.quiz;
import java.util.Scanner;
import java.lang.StringBuffer;

public class OP_Histogram {
	static String writingString() {
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		while(true) {  
			String line = scanner.nextLine();
			if(line.equals(";")) {
				break;
			}
			sb.append(line);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String smallLetter = writingString().toLowerCase();
		
		int cnt[] = new int[26];
		
		for(int i=0; i<smallLetter.length(); i++) {  
			char temp = smallLetter.charAt(i);
			if(Character.isAlphabetic(temp))
				cnt[(int)(smallLetter.charAt(i)-'a')]++;
		}
		System.out.println("히스토그램을 그립니다.");
		for(int i=0; i<26; i++) {  
			System.out.print((char)(i+65));
			System.out.print("("+cnt[i]+")");
			for(int j=0; j<cnt[i]; j++) {  
				System.out.print('-');
			}
			System.out.println();
		}
		
	}

}
