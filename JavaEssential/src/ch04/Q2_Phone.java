package ch04;
import java.util.Scanner;
public class Q2_Phone {
	private String nameString, telString;
	public Q2_Phone(String nameString, String telString) {  
		this.nameString = nameString;
		this.telString = telString;
	}
	public String getName() {return nameString;}
	public String getTel() {return telString;}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q2_Phone[] phone = new Q2_Phone[2];
		for(int i=0; i<2; i++) {  
			System.out.print("이름과 전화번호 >>");
			phone[i] = new Q2_Phone(scanner.next(), scanner.next());
		}
		System.out.println(phone[0].getName()+"의 번호 " + phone[0].getTel());
		System.out.println(phone[1].getName()+"의 번호 " + phone[1].getTel());
		
		scanner.close();
	}

}
