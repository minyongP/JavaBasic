package ch05.op;
import java.util.Scanner;
public class Bear extends GameObject{
	Scanner scanner = new Scanner(System.in);
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		System.out.print("aswd move >>");
		String key = scanner.next();
		
		switch (key) {
		case "a":
			if(super.y > 0)
				super.y -= super.distance;
			break;
			
		case "s":
			if(super.x < 9)
				super.x += super.distance;
			break;
			
		case "w":
			if(super.x > 0)
				super.x -= super.distance;
			break;
			
		case "d":
			if(super.y < 19)
				super.y += super.distance;
			break;

		default:
			break;
		}
	}

	@Override
	protected char getShape() {
		return 'b';
	}

}
