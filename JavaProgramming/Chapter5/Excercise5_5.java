package chapter5;

public class Excercise5_5 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		b = a;
		for(int msg : b) {
			System.out.println(msg);
		}
	}
}
