package game;

import java.util.Random;

public class Die {
	int side;
	Random obj = new Random();
	public Die() {
		side = 1;
	}
	int roll() {
		return obj.nextInt(6)+1;
	}
	void setValue(int v) {
		side = v;
	}
	int getValue() {
		return side;
	}
	public String toString() {
		return "현재 주사위 상태: "+ side;
	}
}
