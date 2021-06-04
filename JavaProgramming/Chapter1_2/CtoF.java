import java.util.Scanner;

public class CtoF{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.printf("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		int a= input.nextInt();
		double temp= 5.0/9.0*(a-32);
		
		System.out.println("¼·¾¾¿Âµµ´Â "+ temp);
	}
}