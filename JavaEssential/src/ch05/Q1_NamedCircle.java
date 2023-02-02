package ch05;
class Circle{  
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return radius;}
}

public class Q1_NamedCircle extends Circle{
	private String name;
	public Q1_NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	void show() {  
		System.out.println(name + ", ¹ÝÁö¸§ = " + getRadius());
	}

	public static void main(String[] args) {  
		Q1_NamedCircle w = new Q1_NamedCircle(5, "Waffle");
		w.show();
	}

}
