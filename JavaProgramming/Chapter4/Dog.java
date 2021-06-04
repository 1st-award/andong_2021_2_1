package chapter4;

public class Dog {
	String breed, color;
	int age;
	public Dog(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
		System.out.printf("(%s, %d %s)\n", this.breed, this.age, this.color);
	}
	void barking() {
		System.out.println("barking()");
	}
	void hungry() {
		System.out.println("hungry()");
	}
	void sleeping() {
		System.out.println("sleeping()");
	}
	public static void main(String[] args) {
		Dog d = new Dog("york", 1, "orange");
		d.barking();
		d.hungry();
		d.sleeping();
	}
}
