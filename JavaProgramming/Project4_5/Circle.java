public class Circle {
	int radius; //������
	
	void setRadius(int r) {
		radius = r;
	}
	
	
	double calcArea() {
		return 3.14 * Math.pow(radius, 2);
	}
	
	
	void print() {
		System.out.println("���� ������: " + radius  + "\n���Ǹ���: " + calcArea());
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.setRadius(100);
		obj.print();
	}
} 