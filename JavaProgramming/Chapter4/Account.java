package chapter4;

public class Account {
	int balance;
	public Account() {
		balance = 0;
		System.out.println("���ο� ���°� ����� �����ϴ�.");
	}
	void withdraw(int amount) {
		balance -=amount;
		System.out.printf("%d�� ���� ���� �ܰ�: %d\n", amount, balance);
	}
	void deposit(int amount) {
		balance +=amount;
		System.out.printf("%d�� ���� ���� �ܰ�: %d\n", amount, balance);
	}
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(50000);
		Account acc2 = new Account();
		acc2.deposit(100000);
		System.out.println("�� #1 ���� �ܰ�=" + acc1.balance);
		System.out.println("�� #2 ���� �ܰ�=" + acc2.balance);
	}
}
