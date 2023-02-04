package ch06.quiz;
import java.util.Scanner;
public class Bonus2_Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {  
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(sb.equals("exit")) {  
				System.out.println("exit..");
				break;
			}
			int index = (int)(Math.random()*s.length());	//변경할 문자 위치 선택
			while(true) {  
				int i = (int)(Math.random()*26); //알파벳 중에서 선택
				char c = (char)('a' + i);
				if(!(sb.equals(c))) {
					sb.replace(index, index+1, Character.toString(c));		//char를 String으로 변환해주고 replace메소드 사용
					break;
				}
			}
			System.out.println(sb);
		}
		scanner.close();
	}

}
