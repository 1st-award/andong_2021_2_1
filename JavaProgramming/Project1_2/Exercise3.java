import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("���� ��: ");
		int money= input.nextInt();
		System.out.print("��ǰ ����: ");
		int price= input.nextInt();
		System.out.println("�ΰ���: "+ (int)price/10);
		//int cash= money-price;
		System.out.println("�ܵ�: "+ (money-price));
		
	}
}