package chapter5;

class BankAccount {
	private int money;
	
	BankAccount(int money) {
		this.money = money;		
	}
	BankAccount() {
		this(0);
	}
	int getMoney() {
		return money;
	}
	public int transfer(int amount, BankAccount otherAccount) {
		money -= amount;
		otherAccount.money += amount;
		return 0;
	}
}

public class Bank {
	public static void main(String[] args) {
		BankAccount custom1 = new BankAccount(10000);
		BankAccount custom2 = new BankAccount(0);
		
		System.out.printf("myAccount1 : 현재 잔액은 %d 입니다.\n", custom1.getMoney());
		System.out.printf("myAccount2 : 현재 잔액은 %d 입니다.\n", custom2.getMoney());
		custom1.transfer(1000, custom2);
		System.out.println("transfer(1000)");
		System.out.printf("myAccount1 : 현재 잔액은 %d 입니다.\n", custom1.getMoney());
		System.out.printf("myAccount2 : 현재 잔액은 %d 입니다.\n", custom2.getMoney());
	}
}