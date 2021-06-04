package chapter5;

public class Test {
	static void print1(int[] item) {
		for(int i : item) {
			System.out.println(i);
		}
		item[0] = 0;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		b= a;
		System.out.println(a);
		System.out.println(b);
		print1(a);
		print1(b);
	}
}
