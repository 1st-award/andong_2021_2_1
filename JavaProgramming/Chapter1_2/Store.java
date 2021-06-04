import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		Scanner stdin= new Scanner(System.in);
		int money, price, vat, remain;
		
		System.out.print("πﬁ¿∫ µ∑: ");
		money= stdin.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price= stdin.nextInt();
		vat= price/10;
		remain= money-price;
		
		System.out.println("∫Œ∞°ºº: "+ vat+ "\n¿‹µ∑: "+ remain);	
	}
}