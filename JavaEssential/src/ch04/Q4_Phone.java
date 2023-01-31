package ch04;
import java.util.Scanner;
public class Q4_Phone {

	private String nameString, telString;
	
	public Q4_Phone(String nameString, String telString) {  
		this.nameString = nameString;
		this.telString = telString;
	}
	public void getTel() {
		System.out.println(nameString+"의 번호는 "+ telString + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>> ");
		int num = scanner.nextInt();
		
		Q4_Phone[] phone = new Q4_Phone[num];
		
		for(int i=0; i<num; i++) {  
			System.out.print("이름과 번호(번호는 연속적 입력)>> ");
			phone[i] = new Q4_Phone(scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
		
		while(true) {  
			System.out.print("검색할 이름>> ");
			String serchNameString = scanner.next();
			
			for(int i=0; i<num; i++) {  
				if(serchNameString.equals("exit")) {  
					System.out.println("exit...");
					System.exit(0);
				}
				else if(serchNameString.equals(phone[i].nameString)) {  
					phone[i].getTel();
					break;
				}
				else if(!serchNameString.equals(phone[i].nameString) && i == (num-1)){ 
					System.out.println(serchNameString + " 이 없습니다.");
				}
			}
		}
	}

}
