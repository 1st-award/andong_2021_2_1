package chapter4;

class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	int roll() {
		int aDice = (int)(Math.random()*6)+1;
		int bDice = (int)(Math.random()*6)+1;
		System.out.println("주사위1= " + aDice + "주사위2= " + bDice);
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
		System.out.println("(1, 1)이 나오는데 걸린 횟수 = "+ cnt);
	}
}
