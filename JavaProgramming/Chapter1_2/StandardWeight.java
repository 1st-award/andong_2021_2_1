import java.util.Scanner;

public class StandardWeight {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.printf("Ű�� �Է��ϼ���: ");
		double tall = stdin.nextInt();
		System.out.printf("�����Ը� �Է��ϼ���: ");
		double weight = stdin.nextInt();
		if(weight > (tall - 100) * 0.9) {
			System.out.println("��ü���Դϴ�.");
		}
		else if(weight < (tall - 100) * 0.9) {
			System.out.println("��ü���Դϴ�.");
		}
		else {
			System.out.println("ǥ���Դϴ�.");
		}
	}
}