package chapter5;

public class MyMetricTest {
	static double kiloToMile(double kilo) {
		return kilo*0.6214;
	}
	static double mileToKilo(double mile) {
		return mile*1.61;
	}
	public static void main(String[] args) {
		System.out.println("1km�� ���Ϸ� �ٲٸ� " + kiloToMile(1));
		System.out.println("1������ ų�η� �ٲٸ� " + mileToKilo(1));
	}
}
