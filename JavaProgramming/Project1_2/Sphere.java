import java.util.Scanner;

public class Sphere {
	public static void main(String[] args) {
		Scanner stdin= new Scanner(System.in);
		double radius, boo;
		
		System.out.print("���� ������: ");
		radius= stdin.nextDouble();
		boo= 4.0/3.0*Math.pow(radius, 3);
		
		System.out.printf("���� ����: %f\n", boo);
	}
}