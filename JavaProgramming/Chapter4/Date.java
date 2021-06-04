package chapter4;

import java.util.Scanner;

public class Date {
	int year, month, day;
	String sMonth;
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	void print1() {
		System.out.printf("%d.%d.%d\n", year, month, day);
	}
	
	void print2() {
		switch(month) {
		case 1:
			sMonth = "Jan";	break;
		case 2:
			sMonth = "Feb";	break;
		case 3:
			sMonth = "Mar";	break;
		case 4:
			sMonth = "Apr";	break;
		case 5:
			sMonth = "May";	break;
		case 6:
			sMonth = "Jun";	break;
		case 7:
			sMonth = "Jul";	break;
		case 8:
			sMonth = "Aug";	break;
		case 9:
			sMonth = "Sep";	break;
		case 10:
			sMonth = "Oct";	break;
		case 11:
			sMonth = "Nov";	break;
		case 12:
			sMonth = "Dec";	break;
		}
		System.out.printf("%s %d, %d\n", sMonth, day, year);
	}
	public static void main(String[] args) {
		Date d = new Date(2012, 7, 12);
		d.print1();
		d.print2();
	}
}
