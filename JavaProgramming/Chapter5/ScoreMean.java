package chapter5;

import java.util.Scanner;

public class ScoreMean {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; ++i) {
			System.out.print("������ �Է��ϼ���: ");
			int score = sc.nextInt();
			sum+=score;
		}
		System.out.printf("�հ�: %d\n���: %.1f", sum, (sum/5.0));
	}
}
