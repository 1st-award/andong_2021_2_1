import java.util.ArrayList;

public class PE3_6 {
	public static void main(String[] args) {
		int cnt = 0;
		System.out.print("2���� 100������ ��� �Ҽ�: ");
		for(int x = 2; x<101; ++x) {
			for(int y = 2; y<x; ++y) {
				if(x%y == 0) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.print(x + " ");
			}
			else {
				cnt = 0;
			}
		}
	}
}