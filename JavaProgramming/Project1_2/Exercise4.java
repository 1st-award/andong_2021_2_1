import java.util.Scanner;

public class Exercise4{
	public static void main(String[] agrs) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("���� ������: ");
		double radius= input.nextDouble();
		double cercle= (4.0/3.0)*(radius*radius*radius);
		System.out.println("���� ����: "+ cercle);
	}
}