public class PrimeNumber {
	public static void main(String[] args) {
		int confirm = 1;
		System.out.print("2���� 100���� ��� �Ҽ�: ");
		for(int i = 2; i<101; ++i) {
			for(int j = 2; j<i; ++j) {
				if(i % j == 0) {
					confirm = 1;
					break;
				}
			}
			if(confirm == 0) {
				System.out.printf("%d ", i);
			}
			confirm = 0;
		}
	}
}