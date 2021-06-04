package ShapeTest;

import java.util.ArrayList;

class Shape {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	private int width, hegith;
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

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> arrayOfShapes= new ArrayList<Shape>();
		arrayOfShapes.add(new Rectangle());
		arrayOfShapes.add(new Triangle());
		arrayOfShapes.add(new Circle());
		
		for(Shape obj : arrayOfShapes) {
			obj.draw();
		}
	}
}
