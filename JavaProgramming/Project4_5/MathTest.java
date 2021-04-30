class Math {
	int add(int x, int y) {
		return x + y;
	}
}

public class MathTest {
	public static void main(String[] args) {
		Math obj = new Math();
		System.out.println("2와 3의 합은 " + obj.add(2, 3));
		System.out.println("7와 8의 합은 " + obj.add(7, 8));
	}
}