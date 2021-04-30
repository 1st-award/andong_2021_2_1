public class PE3_7 {
	public static void main(String[] args) {
		for(int x = 1; x<100; ++x) {
			for(int y = 1; y<100; ++y) {
				for(int z = 1; z<100; ++z) {
					if(x*x + y*y == z*z) {
						System.out.printf("%d %d %d\n", x, y, z);
					}
				}
			}
		}
	}
}