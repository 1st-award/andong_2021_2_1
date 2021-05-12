package TestInterface_03;

interface Printable {
	void print();
}

interface Drawable {
	void draw();
}

public class TestInferface_03 implements Printable, Drawable{
	public void print() {
		System.out.println("프린터로 원을 출력합니다.");
	}
	public void draw() {
		System.out.println("화면에 원을 그립니다.");
	}
	public static void main(String[] args) {
		TestInferface_03 obj = new TestInferface_03();
		obj.print();
		obj.draw();
	}
}
