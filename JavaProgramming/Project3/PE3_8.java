import java.util.Scanner;

public class PE3_8 { 
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double x, y;
		String select;
		
		System.out.print("연산을 입력하세요: ");
		select = stdin.next();
		System.out.print("숫자 2개를 입력하세요: ");
		x = stdin.nextDouble();
		y = stdin.nextDouble();
		
		if(select == "+") {
			System.out.printf("%f + %f = %f\n", x, y, x+y);
		}
		else if(select == "-") {
			System.out.printf("%f - %f = %f\n", x, y, x-y);
		}
		else if(select == "*") {
			System.out.printf("%f * %f = %f\n", x, y, x*y);
		}
		else if(select == "/") {
			if(y == 0) {
				System.out.printf("%f / %f = %f\n", x, y, 0); 
			}
			else {
				System.out.printf("%f / %f = %f\n", x, y, x/y);
			}
		}
		else {
			System.out.println("Error");
		}
	}
}