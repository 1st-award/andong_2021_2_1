package Chapter7;
import java.util.Scanner;

public class divideByZero {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수: ");
		x = sc.nextInt();
		System.out.print("젯수: ");
		y = sc.nextInt();
		
		try {
			int result = x/y;
			System.out.println("성공");
		}catch(ArithmeticException e) {
			System.out.println("0으론 나눌 수 없습니다.");
		}
		System.out.println("프로그램을 계속 진행합니다.");
	}
}
