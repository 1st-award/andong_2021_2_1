package TestInterface_01;

interface Drawable {
	void draw();
}

class Circle implements Drawable {
	int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class TestInterface_01 {
	public static void main(String[] args) {
		Drawable obj = new Circle();
		obj.draw();
	}
}
