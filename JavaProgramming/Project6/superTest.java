package superTest;

class Shape {
	public Shape() {
		System.out.println("shape ������()");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super();
		System.out.println("Rectangle ������()");
	}
}

public class superTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	}
}