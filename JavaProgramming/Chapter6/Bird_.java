package Bird_;

interface Animal {
	void walk();
	void fly();
	void sing();
}

public class Bird_ implements Animal{
	public void walk() {
		System.out.println("���� �� ����");
	}
	public void fly() {
		System.out.println("�� �� ����");
	}
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
	
	public static void main(String[] args) {
		Bird_ obj = new Bird_();
		obj.walk();
		obj.fly();
		obj.sing();
	}
}
