class ArrayArgument {
	private double min;
	
	public double minArray(double[] list) {
		min = list[0];
		for(int i = 1; i<list.length; ++i) {
			if(min > list[i]) {
				min = list[i];
			}
		}
		return min;
	}
}

public class ArrayArgumentTest {
	public static void main(String[] args) {
		ArrayArgument arr = new ArrayArgument();
		double[] a= {1.1, 2.2 ,3.3, 4.4, 0.1, 0.2};
		double[] b= {-2.0, 3.0, -9.0, 2.9, 1.5};
		
		System.out.println("첫 번째 배열의 최솟값: " + arr.minArray(a));
		System.out.println("두 번째 배열의 최솟값: " + arr.minArray(b));
	}
}