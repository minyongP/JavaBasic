package ch05;
class Point{  
	private int x,y;
	public Point(int x, int y) { this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}
public class Q4_ColorPoint extends Point{
	String color;
	public Q4_ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	void setPoint(int x, int y) {  
		move(x, y);
	}
	void setColor(String color) {  
		this.color = color;
	}
	void show() {  
		System.out.println(color + "»öÀ¸·Î(" + super.getX() + "," +super.getY() + ")");
	}

	public static void main(String[] args) {
		Q4_ColorPoint cp = new Q4_ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}
