import java.util.Scanner;

public class PE3_12 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int sum = 0, num;
		double avg;
		
		for(int i = 0; i<5; ++i) {
			System.out.print("������ �Է��ϼ���: ");
			num = stdin.nextInt();
			sum+= num;
		}
		avg = sum/5.0;
		System.out.printf("�հ�: %d\n���: %.1f\n", sum, avg);
	}
}