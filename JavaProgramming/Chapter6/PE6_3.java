package Chapter6;

interface Animal {
	void walk();
	void fly();
	void sing();
}

class Bird implements Animal {
	public void walk() {
		System.out.println("���� �� ����");
	}
	public void fly() {
		System.out.println("�� �� ����");
	}
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}

public class PE6_3 {
	public static void main(String[] args) {
		Animal obj = new Bird();
		obj.walk();
		obj.fly();
		obj.sing();
	}
}
