package Chapter6;

class Circle {
	protected int radius;
	public Circle(int r) {
		radius = r;
	}
}

class Pizza extends Circle {
	String PizzaName;
	public Pizza(String PizzaName, int r) {
		super(r);
		this.PizzaName = PizzaName;
	}
	void print() {
		System.out.println("피자의 종류 : " + PizzaName + ", 피자의 크기 : " + radius);
	}
	
}

public class PE6_1 {
	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}
}
