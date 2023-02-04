package ch06.quiz;
import java.lang.Math;
public class Q3_Jackpot {

	public static void main(String[] args) {
		while(true) {
			int num[] = new int[3];
			for(int i=0; i<3; i++) {  
				num[i] = (int)(Math.random()*3)+1;
				System.out.print(num[i]+"    ");
			}
			System.out.println();
			if(num[0] == num[1] && num[1] == num[2]) {  
				System.out.println("¼º°ø");
				System.exit(0);
			}
		}
	}
}
