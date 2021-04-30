public class AnswerEquation {
	public static void main(String[] args) {
		for(int i = 0; i < 11; ++i) {
			for(int j = 0; j < 11; ++j) {
				if((3*i) + (10*j) == 100) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}
}