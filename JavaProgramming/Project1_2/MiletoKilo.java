import java.util.Scanner;
public class MiletoKilo {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double mile;
        double kilometer;
        System.out.print("mile을 입력해주세요: ");
        mile = stdin.nextDouble();
        kilometer = mile*1.609;
        System.out.println(mile + "마일은 " + kilometer + "킬로미터 입니다.");
    }
}