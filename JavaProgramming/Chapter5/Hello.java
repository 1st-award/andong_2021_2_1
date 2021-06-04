package chapter5;

public class Hello {
	public static void main(String[] args) {
		String x = null;
		giveMeAString(x);
		System.out.println(x);
	}
	static void giveMeAString(String y) {
		System.out.println(y);
		y = "This is a string";
		System.out.println(y);
	}
}
