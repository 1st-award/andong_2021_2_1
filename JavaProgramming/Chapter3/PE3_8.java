import java.util.Scanner;

public class PE3_8 { 
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double x, y;
		String select;
		
		System.out.print("������ �Է��ϼ���: ");
		select = stdin.next();
		System.out.print("���� 2���� �Է��ϼ���: ");
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