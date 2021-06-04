import java.util.Scanner;

public class NumtoStrNum {
	public static void main(String[] args) {
		Scanner stdin= new Scanner(System.in);
		int num;
		String strnum;
		
		System.out.print("정수를 입력하세요: ");
		num= stdin.nextInt();
		
		switch(num) {
		case 1:
			strnum= "ONE";
			break;
		case 2:
			strnum= "TWO";
			break;
		case 3:
			strnum= "THREE";
			break;
		case 4:
			strnum= "FOUR";
			break;
		case 5:
			strnum= "FIVE";
			break;
		case 6:
			strnum= "SIX";
			break;
		case 7:
			strnum= "SEVEN";
			break;
		case 8:
			strnum= "EIGHT";
			break;
		case 9:
			strnum= "NINE";
			break;
		default:
			strnum= "OTHER";
		}
		System.out.println(strnum);
	}
}