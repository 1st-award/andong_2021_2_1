public class ThreeOfFourSum{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=100; ++i) {
			if(i % 3 == 0) {
				sum += i;
			}
			else if(i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println("3�Ǵ� 4�� ����� ��: " + sum);
	}
}