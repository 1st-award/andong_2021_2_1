import java.util.Scanner;

public class KeyboardInput2{
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("���� �� �� �Է�: ");
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		
		System.out.printf("%d + %d= %d\n", a, b, a+b);
		System.out.printf("%d - %d= %d\n", a, b, a-b);
		System.out.printf("%d * %d= %d\n", a, b, a*b);
		System.out.printf("%d / %d= %d\n", a, b, a/b);
		System.out.printf("%d %% %d= %d\n", a, b, a%b);
		boolean t= 10>20;
		System.out.printf("%s", t);
		
	}
}