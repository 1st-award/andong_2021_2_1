import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		double mile= input.nextDouble();
		double kilo= mile*1.609;
		System.out.println(mile+"������ "+ kilo+"ų�ι����Դϴ�.");
	}
}