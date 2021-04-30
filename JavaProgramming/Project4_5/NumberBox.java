public class NumberBox {
	public int ivalue;
	public float fvalue;
	
	void print() {
		ivalue = 10;
		fvalue = (float) 1.2345;
		System.out.println("ivalue: " + ivalue + " fvalue: " + fvalue);
	}
	public static void main(String[] args) {
		NumberBox NB = new NumberBox();
		NB.print();
	}
}