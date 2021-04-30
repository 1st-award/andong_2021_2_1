import java.util.Arrays;

public class ArrayReset {
	static void init(double[] values) {
		for(int i=0; i<values.length; ++i) {
			values[i] = 0;
		}
		System.out.println(Arrays.toString(values));
	}
	public static void main(String[] args) {
		double[] values = {1, 23, 4, 5, 6};
		init(values);
	}
}