import java.util.Scanner;

public class KeyboardInput2{
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정수 두 개 입력: ");
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