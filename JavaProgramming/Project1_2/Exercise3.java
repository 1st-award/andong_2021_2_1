import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("πﬁ¿∫ µ∑: ");
		int money= input.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		int price= input.nextInt();
		System.out.println("∫Œ∞°ºº: "+ (int)price/10);
		//int cash= money-price;
		System.out.println("¿‹µ∑: "+ (money-price));
		
	}
}