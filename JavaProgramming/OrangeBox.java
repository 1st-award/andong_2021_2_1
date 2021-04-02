import java.util.Scanner;

public class OrangeBox {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        int countingOrange;
        int remainOrange;
        int boxOrange;
        System.out.print("오렌지의 개수를 입력하세요: ");
        countingOrange = stdin.nextInt();
        boxOrange = countingOrange/10;
        remainOrange = countingOrange%10;
        System.out.printf("%d박스가 필요하고 %d개가 남습니다.\n", boxOrange, remainOrange);
    }
}