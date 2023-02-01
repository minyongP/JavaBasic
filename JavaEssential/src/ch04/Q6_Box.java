package ch04;

public class Q6_Box {
	private int width, height;
	private char fillChar;
	public Q6_Box() {  
		this.width = 10;
		this.height = 1;
	}
	public Q6_Box(int width, int height) {  
		this.width = width;
		this.height = height;
	}
	public void draw() {  
		for(int i=0; i<height; i++) {  
			for(int j=0; j<width; j++) {  
				System.out.print(fillChar);
			}
			System.out.println();
		}
	}
	public void fill(char c) {  
		this.fillChar = c;
	}
	
	public static void main(String[] args) {

		Q6_Box a = new Q6_Box();
		Q6_Box b = new Q6_Box(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}

}
