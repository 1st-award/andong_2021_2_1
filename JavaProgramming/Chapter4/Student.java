package chapter4;

public class Student {
	String name;
	int sID, age;
	public Student(String name, int sID, int age) {
		this.name = name;
		this.sID = sID;
		this.age = age;
		
		System.out.print("학생의 이름: " + this.name + "\n학생의 학번: " + this.sID
				+ "\n학생의 나이: " + this.age);
	}
	public static void main(String[] args) {
		Student s = new Student("Kim", 20180001, 20);
	}
}
