package ch07.quiz;
import java.util.*;
class Location{  
	private int x, y;
	public Location(int x, int y) {  
		this.x=x; this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
}
public class Q7_Location {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var loc = new ArrayList<Location>();
		
		loc.add(new Location(0, 0));
		System.out.println("쥐가 이동한 위치 (x, y) 5개 입력");
		for (int i = 0; i < 5; i++) {
			System.out.print(">>");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			loc.add(new Location(x, y));
		}
		loc.add(new Location(0, 0));
		
		double sum;
		double totalMove=0;
		
		for (int i = 1; i < loc.size(); i++) {
			Location p1 = loc.get(i-1);
			double x1 = p1.getX();
			double y1 = p1.getY();
			
			Location p2 = loc.get(i);
			double x2 = p2.getX();
			double y2 = p2.getY();
			
			double diffX = x2-x1;
			double diffY = y2-y1;
			
			sum = diffX*diffX + diffY*diffY;
			totalMove += Math.sqrt(sum);
		}
		System.out.println("총 이동 거리는 " + totalMove);
		scanner.close();
	}

}

