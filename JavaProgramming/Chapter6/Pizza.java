package Circle;

class Circle {
	protected int radius;
	public Circle (int r) {
		radius = r;
	}
}

public class Pizza extends Circle {
	String Pizza;
	public Pizza(String Pizza, int radius) {
		super(radius);
		this.Pizza = Pizza;
		//super(radius);
	}
	void print() {
		System.out.println("������ ����: " + Pizza + ", ������ ũ��: " + radius);
	}
	public static void main(String[] args) {
		Pizza obj = new Pizza("pepperoni", 20);
		obj.print();
	}
}