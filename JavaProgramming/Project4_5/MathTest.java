class Math {
	int add(int x, int y) {
		return x + y;
	}
}

public class MathTest {
	public static void main(String[] args) {
		Math obj = new Math();
		System.out.println("2�� 3�� ���� " + obj.add(2, 3));
		System.out.println("7�� 8�� ���� " + obj.add(7, 8));
	}
}