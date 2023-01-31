package ch03;
import java.util.Scanner;
public class Q6_Dictionary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복", "미래"};
		
		while(true) {
			int notExistInt = 0;
			System.out.println("영어 단어를 입력>>");
			String origineString = scanner.next();
			
			if(origineString.equals("exit")) {System.out.println("종료합니다.."); break;
			}
			
			for(int i=0; i<eng.length;i++) {
				if(eng[i].equals(origineString)) {
					System.out.println(kor[i]);
					notExistInt = 1;
				}
			}
			if(notExistInt == 0) {System.out.println("not exist word");
			}
		}
		scanner.close();
	}
}
