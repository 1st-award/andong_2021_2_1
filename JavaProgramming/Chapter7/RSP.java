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
		System.out.print("�ϳ��� �����Ͻÿ� : ����(0) ����(1) ��(2) : ");
		int select = sc.nextInt();
		int result = r.nextInt(3);
		
		if(result == 0) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}
		else if(result == 1) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}
		else {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		}
		
		if(select == result) {
			System.out.println("�����ϴ�.");
		}
		else if(select == (result+1)%3) {
			System.out.println("�̰���ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
	}
}