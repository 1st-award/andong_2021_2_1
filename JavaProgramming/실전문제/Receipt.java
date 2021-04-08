import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        int money;
        int price;
        int vat;
        int remain;
        System.out.print("받은 돈: ");
        money = stdin.nextInt();
        System.out.print("상품 가격: ");
        price = stdin.nextInt();
        vat = price / 10;
        remain = money - price;
        System.out.println("부가세: " + vat+ "\n잔돈: " + remain);
    }
}