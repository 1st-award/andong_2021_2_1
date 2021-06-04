package chapter4;

public class Account {
	int balance;
	public Account() {
		balance = 0;
		System.out.println("새로운 계좌가 만들어 졌습니다.");
	}
	void withdraw(int amount) {
		balance -=amount;
		System.out.printf("%d원 인출 남은 잔고: %d\n", amount, balance);
	}
	void deposit(int amount) {
		balance +=amount;
		System.out.printf("%d원 적금 남은 잔고: %d\n", amount, balance);
	}
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(50000);
		Account acc2 = new Account();
		acc2.deposit(100000);
		System.out.println("고객 #1 계좌 잔고=" + acc1.balance);
		System.out.println("고객 #2 계좌 잔고=" + acc2.balance);
	}
}
