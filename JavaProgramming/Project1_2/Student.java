public class Student {
	public String name = "Kim";
	public int rollno = 20180001;
	public int age = 20;
	
	public static void main(String[] args) {
		Student S = new Student();
		System.out.printf("학생의 이름: %s\n학생의 학번: %d\n학생의 나이:%d\n", S.name, S.rollno, S.age);
	}
}