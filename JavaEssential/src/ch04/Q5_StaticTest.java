package ch04;

class Circle{  
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius = radius;}
}

class CircleManager{	//static 메소드만 가짐
	static void copy(Circle src, Circle dest) {	//src를 dest에 복사
		dest.setRadius(src.getRadius()); 		//src의 반지름을 dest에 복사
	}
	static boolean equals(Circle a, Circle b) { //a와 b의 반지름이 같으면 retrun true
		if(a.getRadius()==b.getRadius()) return true;
		else return false;
	}
}

public class Q5_StaticTest {

	public static void main(String[] args) {
		Circle pizaa = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizaa, waffle);
			if(res == true)
				System.out.println("same size");
			else
				System.out.println("diff size");
			
		CircleManager.copy(pizaa, waffle);
		res = CircleManager.equals(pizaa, waffle);
			if(res == true)
				System.out.println("same size");
			else
				System.out.println("diff size");
	}
}
