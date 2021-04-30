import java.util.Scanner;

public class StandardWeight {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.printf("키를 입력하세요: ");
		double tall = stdin.nextInt();
		System.out.printf("몸무게를 입력하세요: ");
		double weight = stdin.nextInt();
		if(weight > (tall - 100) * 0.9) {
			System.out.println("과체중입니다.");
		}
		else if(weight < (tall - 100) * 0.9) {
			System.out.println("저체중입니다.");
		}
		else {
			System.out.println("표준입니다.");
		}
	}
}