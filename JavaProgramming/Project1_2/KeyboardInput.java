import java.util.Scanner;

public class KeyboardInput {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("몇 번째 프로그램인지 입력하세요: ");
		String s= input.next();
		System.out.println(s+"번째로 작성해 보는 자바 프로그램 입니다.");
	}
}
