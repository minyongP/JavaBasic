package ch03;
import java.lang.Math;
import java.util.Scanner;
public class Q8_Rock_Paper_Scissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cpuStrArr[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int n = (int)(Math.random()*3); //0,1,2
			System.out.print("가위 바위 보! >>");
			String userString = scanner.next();
			
			if(userString.equals("그만")) {
				System.out.println("quit...");
				break;
			}
			else if(cpuStrArr[n].equals("가위")) {
				if(userString.equals("가위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "비김");continue;
				}
				else if(userString.equals("바위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "이김");continue;
				}
				else if(userString.equals("보")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "짐");continue;
				}
			}
			
			else if(cpuStrArr[n].equals("바위")) {
				if(userString.equals("가위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "짐");continue;
				}
				else if(userString.equals("바위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "비김");continue;
				}
				else if(userString.equals("보")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "이김");continue;
				}
			}
			
			else if(cpuStrArr[n].equals("보")) {
				if(userString.equals("가위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "이김");continue;
				}
				else if(userString.equals("바위")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "짐");continue;
				}
				else if(userString.equals("보")) {
					System.out.println("user = "+ userString + "cpu = " + cpuStrArr[n] + "비김");continue;
				}
			}
		}
		scanner.close();
	}

}
