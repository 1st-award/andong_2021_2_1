class MyMath { //�Ű� ������ �ٸ��� �޼ҵ� �̸��� ���Ƶ� �ȴ�. �̰��� �޼ҵ� �ߺ����Ƕ�� �Ѵ�.
	// �������� �����ϴ� �޼ҵ�
	int square(int i) {
		return (int) Math.pow(i, 2);
	}
	
	
	// �Ǽ����� �����ϴ� �޼ҵ�
	double square(double i) {
		return (double) Math.pow(i, 2);
	}	
}

public class MyMathTest {
	public static void main(String[] args) {
		MyMath obj = new MyMath();
		System.out.printf("%d\n%.4f\n", obj.square(10), obj.square(3.14));
	}
}