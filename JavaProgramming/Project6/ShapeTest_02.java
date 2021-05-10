class Shape {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}
class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
class Triangle extends Shape {
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
class Circle extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest_02 {
	public static void main(String args[]) {
		Shape s = new Rectangle();
		Rectangle r = new Rectangle();
		s.x = 0;
		s.y = 0;
		s.width = 100; // 컴파일 오류가 발생한다. 
		s.height = 100; // s를 통해서는 Rectangle 클래스의 필드와 메소드에 접근할 수 없다.
	}
}