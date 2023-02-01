package ch04;
import java.util.Scanner;
class BNPlayer{  
	private String playerNameString;
	public BNPlayer(String playerName) {
		this.playerNameString = playerName;
	}
	public String getName() {return playerNameString;}
}
public class Bonus1_GamblingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BNPlayer[] p = new BNPlayer[2];
		for(int i = 0; i<2; i++) {  
			System.out.print("선수 이름 입력>> ");
			p[i] = new BNPlayer(scanner.next());
		}
		int n=0;
		while(true) {
			System.out.print(p[n].getName() + "<Enter 외 아무거나 입력>");
			scanner.next();
			int[] val = new int[3];
			for(int i=0; i<val.length; i++) {  
				val[i] = (int)(Math.random()*3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if(val[0] == val[1] && val[1] == val[2]) {  
				System.out.println(p[n].getName() + "win");
				break;
			}
			n++;
			n = n%2;
		}
		scanner.close();
	}

}
