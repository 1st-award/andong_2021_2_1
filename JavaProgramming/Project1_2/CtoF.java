import java.util.Scanner;

public class CtoF{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.printf("ȭ���µ��� �Է��Ͻÿ�: ");
		int a= input.nextInt();
		double temp= 5.0/9.0*(a-32);
		
		System.out.println("�����µ��� "+ temp);
	}
}