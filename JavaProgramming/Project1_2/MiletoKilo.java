import java.util.Scanner;
public class MiletoKilo {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double mile;
        double kilometer;
        System.out.print("mile�� �Է����ּ���: ");
        mile = stdin.nextDouble();
        kilometer = mile*1.609;
        System.out.println(mile + "������ " + kilometer + "ų�ι��� �Դϴ�.");
    }
}