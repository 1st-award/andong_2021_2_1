package rps;

import java.util.Random;
import java.util.Scanner;



public class RSP {
	final int SISSOR = 0;
	final int ROCK = 1;
	final int PAPPER = 2;
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("하나를 선택하시요 : 가위(0) 바위(1) 보(2) : ");
		int select = sc.nextInt();
		int result = r.nextInt(3);
		
		if(result == 0) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}
		else if(result == 1) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}
		else {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		if(select == result) {
			System.out.println("비겼습니다.");
		}
		else if(select == (result+1)%3) {
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
	}
}