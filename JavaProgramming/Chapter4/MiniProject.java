package chapter4;

class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	int roll() {
		int aDice = (int)(Math.random()*6)+1;
		int bDice = (int)(Math.random()*6)+1;
		System.out.println("�ֻ���1= " + aDice + "�ֻ���2= " + bDice);
		return aDice + bDice;
	}
	
	void setValue(int set) {
		value = set;
	}
	
	int getValue() {
		return value;
	}
}

public class MiniProject {
	public static void main(String[] args) {
		Dice d = new Dice();
		int cnt = 1;
		
		while(true) {
			if(d.roll() == 2) break;
			cnt++;
		}
		System.out.println("(1, 1)�� �����µ� �ɸ� Ƚ�� = "+ cnt);
	}
}
