package Chapter6;

class Shape {
	protected int x=  5, y= 5;
	void print() {
		System.out.println("x좌표: " + x + "y좌표 : " + y);
	}
}
public class Rectangle extends Shape{
	int width, height;
	int x, y;
	public Rectangle() {
		System.out.println(x + " " +  y);
	}
	double calcArea() {
		return width * height;
	}
	void draw() {
		System.out.println("(" + x + "," + y + ") 위치에 가로: " + width + 
				"세로: " + height);
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.width = 3;
		obj.height = 5;
		obj.x = 1; obj.y = 2;
		obj.calcArea();
		obj.draw();
		obj.print();
	}
}
