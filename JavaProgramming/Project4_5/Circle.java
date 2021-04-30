public class Circle {
	int radius; //반지름
	
	void setRadius(int r) {
		radius = r;
	}
	
	
	double calcArea() {
		return 3.14 * Math.pow(radius, 2);
	}
	
	
	void print() {
		System.out.println("원의 반지름: " + radius  + "\n원의면적: " + calcArea());
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.setRadius(100);
		obj.print();
	}
} 