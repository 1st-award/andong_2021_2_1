import java.util.*;

public class PE3_9 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int max;
		System.out.print("출력할 항의 개수: ");
		max = stdin.nextInt();
		int[] arr = new int[max];
		arr[0] = 0; arr[1] = 1;
		for(int i = 2; i<max; ++i) {
			arr[i]  = arr[i-2] + arr[i-1];
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}