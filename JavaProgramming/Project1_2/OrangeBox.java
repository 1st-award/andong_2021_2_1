/*���� : �ϳ��� ���ڿ� �������� 10���� ���� �� �ִٰ� ����. �������� 127���� �ִٸ� ���� �� ���� �ʿ��Ѱ�? �� ��� �������� ������?
  �ذ���: ������ ������ �Է¹��� ���� �Լ�(countingOrange)�� 10���� ���� �ڽ�(orangeBox) �׸��� ���� ������(remainOrange)�� �����ϰ�
         �������� 10���� ��ƾ��ϴ� box= countingOrange/10, ��� ���� �������� ���ϴ� ���� remainOrange = O_cnt%10���� ���Ѵ�.*/
import java.util.Scanner;

public class OrangeBox {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        int countingOrange;
        int remainOrange;
        int boxOrange;
        System.out.print("�������� ������ �Է��ϼ���: ");
        countingOrange = stdin.nextInt();
        boxOrange = countingOrange/10;
        remainOrange = countingOrange%10;
        System.out.printf("%d�ڽ��� �ʿ��ϰ� %d���� �����ϴ�.\n", boxOrange, remainOrange);
    }
}