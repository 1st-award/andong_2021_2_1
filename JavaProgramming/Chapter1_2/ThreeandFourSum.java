public class ThreeandFourSum {
	public static void main(String[] args) {
		int sum= 0;
		
		for(int i= 0; i<101; ++i) {
			if(i%3==0) {
				sum+=i;
			}
			else if(i%4==0) {
				sum+=i;
			}
			else continue;
		}
		
		System.out.println("3 또는 4의 배수의 합: "+ sum);
	}
}