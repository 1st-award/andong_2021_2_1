package chapter5;

import java.util.Scanner;
import java.util.ArrayList;

class User {
	String userID, userPW;
	static int count;
	
	public User(String userID, String userPW) {
		this.userID = userID;
		this.userPW = userPW;
	}
}

public class MiniProject {
	public static void main(String[] args) {
		String userID, userPW;
		int select;
		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();
		do {
			System.out.println("========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("========================");
			System.out.print("번호를 입력하시오: ");
			select = sc.nextInt();
			if(select == 1) {
				System.out.print("Id: ");
				userID = sc.next();
				System.out.print("Password: ");
				userPW = sc.next();
				list.add(new User(userID, userPW));
			}
			else if(select == 2) {
				System.out.print("Id: ");
				userID = sc.next();
				System.out.print("Passowrd: ");
				userPW = sc.next();
				for(User user:list) {
					if(userID.equals(user.userID) && userPW.equals(user.userPW)) {
						System.out.println("Login Success");
					}
				}
			}
			else if(select == 3) {
				for(User user:list) {
					System.out.printf("{%s, %s}\n", user.userID, user.userPW); 
				}
			}
		}while(select!=4);
	}
}
