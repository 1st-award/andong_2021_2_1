package chapter5;

import java.util.Scanner;

public class Reservation {
	static void printline() {
		System.out.println("--------------------------");
	}
	static void seatNumber() {
		for(int i=0; i<10; ++i) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static void reserveNumber(int[] reserve) {
		for(int num: reserve) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] reserve = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Scanner sc = new Scanner(System.in);
		
		printline();
		seatNumber();
		printline();
		reserveNumber(reserve);
		printline();
		System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
		int select = sc.nextInt();
		reserve[select]++;
		System.out.println("����Ǿ����ϴ�.\n");
		printline();
		seatNumber();
		printline();
		reserveNumber(reserve);
		printline();
	}
}
