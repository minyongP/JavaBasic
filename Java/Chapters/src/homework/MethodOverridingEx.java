package homework;

class Shape{ //도형의슈퍼클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Corcle");
	}
}

public class MethodOverridingEx {

	static void paint(Shape p) { // Shape을 상속받은 모든 객체들이 매개 변수로 넘어올 수 있음
		p.draw();
	}
	
	public static void main(String[] args) {

		Line line = new Line();
		paint(line); // Line의 draw()실행. "Line" 출력
		
		//다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(new Shape()); //Shape의 draw() 실행, "Shape출력
		paint(new Line()); //오버라이딩된 메소드 Line의 draw() 실행, "Line" 출력
		paint(new Rect()); 
		paint(new Circle());
	}

}
