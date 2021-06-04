import java.util.Scanner;

public class Sphere {
	public static void main(String[] args) {
		Scanner stdin= new Scanner(System.in);
		double radius, boo;
		
		System.out.print("구의 반지름: ");
		radius= stdin.nextDouble();
		boo= 4.0/3.0*Math.pow(radius, 3);
		
		System.out.printf("구의 부피: %f\n", boo);
	}
}