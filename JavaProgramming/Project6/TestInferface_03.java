package TestInterface_03;

interface Printable {
	void print();
}

interface Drawable {
	void draw();
}

public class TestInferface_03 implements Printable, Drawable{
	public void print() {
		System.out.println("�����ͷ� ���� ����մϴ�.");
	}
	public void draw() {
		System.out.println("ȭ�鿡 ���� �׸��ϴ�.");
	}
	public static void main(String[] args) {
		TestInferface_03 obj = new TestInferface_03();
		obj.print();
		obj.draw();
	}
}
