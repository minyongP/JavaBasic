package ch05;
interface BNShape{  
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {  
		System.out.println("--다시 그립니다.--");
		draw();
	}
}
class BNCircle implements BNShape{
	int radius;
	public BNCircle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.print("반지름 " + radius + " ");
	}

	@Override
	public double getArea() {
		return radius*radius*PI;
	}  
	
}
public class Bonus_ShapeApp {

	public static void main(String[] args) {
		BNShape coin = new BNCircle(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}

}
