package Chapter7;

public class Test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("10+20=");
		System.out.println(sb);
		sb.append(10+20);
		System.out.println(sb);
	}
}
