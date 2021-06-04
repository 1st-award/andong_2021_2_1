import java.util.Scanner;

public class PE3_10 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double sum= 0, max= 0;
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		
		for(double x : arr) {
			sum += x;
			if(max<x) {
				max = x;
			}
			System.out.print(x + " ");
		}
		System.out.printf("\n합은 %.1f\n최대값은%.1f\n", sum, max);
	}
}