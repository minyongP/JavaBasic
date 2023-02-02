// 자바는 파이썬처럼 배열이 링크드 되어있지 않아 완벽하게 구현되진 않았다.

package ch05;
import java.util.Scanner;
abstract class Shape{  
	abstract void draw();
}

class Editor extends Shape{  
	Scanner scanner = new Scanner(System.in);
	static int i =0;
	private String[] Shape = new String[10];
	
	public void insert() { 
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >>");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Shape[i] = "Line";
			i++;
			break;
		case 2:
			Shape[i] = "Rect";
			i++;
			break;
		case 3:
			Shape[i] = "Circle";
			i++;
			break;
		default:
			break;
		}
	}
	public void delete() {  
		System.out.print("삭제할 도형의 위치>>");
		int loc = scanner.nextInt();
		if(loc > i) {
			System.out.println("삭제할 수 없습니다.");
		}
		else {
			Shape[loc-1] = null;
		}
	}
	public void draw() { 
		for(int j=0; j<i; j++) {  
			System.out.println(Shape[j]);
		}
	}
}
public class Q6_GraphicEditor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Editor e = new Editor();
		
		while(true) {  
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				e.insert();
				break;
			case 2:
				e.delete();
				break;
			case 3:
				e.draw();
				 break;
			case 4:
				System.out.print("종료합니다.");
				System.exit(0);
			default:
				break;
			}
		}
	}

}
