package superTest;

class Shape {
	public Shape() {
		System.out.println("shape 持失切()");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super();
		System.out.println("Rectangle 持失切()");
	}
}

public class superTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	}
}