package ch03;
import java.util.Scanner;
import java.util.Random;
public class OC_UpDownGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		int rd = r.nextInt(100);
		int i=0;
		int topNum = 99;
		int bottomNum = 0;
		
		System.out.println("up&down game. find number \n 0~99");	
		
		while(true) {

			i++;
		
			System.out.print(i+">>");
			int answer = scanner.nextInt();
			
			//  정답일 경우
			if(answer == rd) {
				System.out.println("correct");
				System.out.print("re?(y/n)>>");
				String re = scanner.next();
				if(re.equals("y")) {
					//reset
					rd = r.nextInt(100);
					i=0;
					topNum = 99;
					bottomNum = 0;
					continue;}	// retry
				else if(re.equals("n")) {break;}// quit
			}
			
			//wrong
			if(answer < rd) {
				bottomNum = answer;
				System.out.println("high \n" + bottomNum + "~" + topNum);
			}
			if(answer > rd) {
				topNum = answer;
				System.out.println("low \n" + bottomNum + "~" + topNum);
			}
		}
		scanner.close();

	}

}
