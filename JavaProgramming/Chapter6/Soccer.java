package Sports;

class Sports {
	String getName() {
		return "���� �������� ����";
	}
	int getPlayers() {
		return 0;
	}
}

public class Soccer extends Sports{
	String getName() {
		return "�౸";
	}
	int getPlayers() {
		return 11;
	}
	
	public static void main(String[] args) {
		Soccer obj = new Soccer();
		System.out.println("����̸�: " + obj.getName());
		System.out.println("����ڼ�: " + obj.getPlayers());
	}
}
