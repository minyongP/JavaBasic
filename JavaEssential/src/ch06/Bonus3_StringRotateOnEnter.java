package ch06;
import java.util.Scanner;
public class Bonus3_StringRotateOnEnter {

	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 가능.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		System.out.println("<Enter>키를 입력하면 문자열이 한 글자씩 회전합니다.");
		
		while(true){  
			String key = scanner.nextLine();
			if(key.equals("")) {	//엔터만 입력된 경우
				String first = text.substring(0, 1);
				String last = text.substring(1);
				text = last.concat(first);
				System.out.println(text + ">>");
			}
			else if(key.equals("q")) {  
				break;
			}
			else {
				System.out.print(text+">>");
			}
		}
		System.out.println("exit..");
		scanner.close();
	}

}
