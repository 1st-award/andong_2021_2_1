/*문제 : 하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 오렌지가 127개가 있다면 상자 몇 개가 필요한가? 또 몇개의 오렌지가 남을까?
  해결방안: 오랜지 개수를 입력받을 정수 함수(countingOrange)와 10개씩 담을 박스(orangeBox) 그리고 남은 오랜지(remainOrange)을 생성하고
         오랜지를 10개씩 담아야하니 box= countingOrange/10, 담고 남은 오랜지를 구하는 식은 remainOrange = O_cnt%10으로 구한다.*/
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