package ch04;
import java.util.InputMismatchException;		//예외 처리 추가
import java.util.Scanner;

class Player{ 
	String userNameString;
	String wordString;
	
	void getWordFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(userNameString+">>");
		String wordString = scanner.next();
		
		this.wordString = wordString;
	}
	
	boolean checkSuccess(String lastWordString) { //끝말 잇기 판별자
		int lastIndexInt = lastWordString.length()-1; //마지막 문자의 인덱스
		char lastChar = lastWordString.charAt(lastIndexInt); //마지막 문자
		char firstChar = wordString.charAt(0); //첫번째 문자
		
		if(lastChar == firstChar) return true;	//판별
		else return false;
	}
}
public class OC_FollowUp {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void run() {  //게임 진행    참가자 배열화 
		System.out.print("참가인원수>>");
		int userNumInt = scanner.nextInt();
		
		Player[] player = new Player[userNumInt];
		
		for(int i=0; i<userNumInt; i++) {
			System.out.print("user name>>");
			String userNameString = scanner.next();
			player[i] = new Player();
			player[i].userNameString = userNameString;
		}
		System.out.println("시작 단어는 '아버지'");
		
		String lastwordsString = "아버지";
		int i = 0;
		
		while(true) {  
			player[i].getWordFromUser(); // 참가자 단어
			
			if(!(player[i].checkSuccess(lastwordsString))) {	//패배
				System.out.println(player[i].userNameString+"이 패배");
				break;
			}
			
			lastwordsString = player[i].wordString;
			
			i++;	//다음 차례
			if(i==userNumInt) i = 0;	//마지막 끝나면 처음인원
		}
	}
	
	public static void main(String[] args) {
		System.out.println("start game");
		
		while(true) {
			try {
				run();
				
				while(true) {  // restart 추가
					System.out.print("restart?(y/n)>>");
					String restartString = scanner.next();
					
					if(restartString.equals("y")) {  
						System.out.println("restart!");
						break;
					}
					else if(restartString.equals("n")) {  
						System.out.println("exit");
						System.exit(0);
					}
					else System.out.println("wrong input");
					continue;
					
				}
			} catch (InputMismatchException e) {
				System.out.println("wrong input");
				scanner.nextLine();
				continue;
			}
		}
	}
}
