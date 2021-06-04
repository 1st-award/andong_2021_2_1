package Chapter7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PE7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시요: ");
		String token = sc.nextLine();
		StringTokenizer stn = new StringTokenizer(token);
		int count = stn.countTokens();
		while(stn.hasMoreTokens()) {
			System.out.printf("%s, ", stn.nextToken());
		}
		System.out.printf("\n모두 %d개의 단어가 있습니다.\n", count);
	}
}
