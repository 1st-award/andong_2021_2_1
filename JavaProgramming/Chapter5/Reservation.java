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
		System.out.print("몇번째 좌석을 예약하시겠습니까?");
		int select = sc.nextInt();
		reserve[select]++;
		System.out.println("예약되었습니다.\n");
		printline();
		seatNumber();
		printline();
		reserveNumber(reserve);
		printline();
	}
}
