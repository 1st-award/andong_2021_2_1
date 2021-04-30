import java.util.ArrayList;

class Person {
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}


public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("È«±æµ¿", "010123456789"));
		list.add(new Person("±èÀ¯½Å", "1230985012334"));
		
		for(Person obj : list) {
			System.out.println(obj.name + obj.tel);
		}
		
	}
}