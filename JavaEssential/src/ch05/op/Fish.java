package ch05.op;

public class Fish extends GameObject{

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int key = (int)(Math.random()*4); // 4¹æÇâÁß ·£´ı
		
		switch (key) {
		case 0:
			if(super.y > 0)
				super.y -= super.distance;
			break;
			
		case 1:
			if(super.y < 19)
				super.y += super.distance;
			break;
			
		case 2:
			if(super.x > 0)
				super.x -= super.distance;
			break;
		
		case 3:
			if(super.x < 9)
				super.x += super.distance;

		default:
			break;
		}
	}

	@Override
	protected char getShape() {
		return '@';
	}

}
