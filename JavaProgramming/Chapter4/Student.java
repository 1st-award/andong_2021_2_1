package chapter4;

public class Student {
	String name;
	int sID, age;
	public Student(String name, int sID, int age) {
		this.name = name;
		this.sID = sID;
		this.age = age;
		
		System.out.print("�л��� �̸�: " + this.name + "\n�л��� �й�: " + this.sID
				+ "\n�л��� ����: " + this.age);
	}
	public static void main(String[] args) {
		Student s = new Student("Kim", 20180001, 20);
	}
}
