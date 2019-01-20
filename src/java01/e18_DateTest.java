package java01;

import java.util.Scanner;

class Date{
	private int year;
	private int month;
	private int day;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date(int year) {
		this(year,12,28);
	}
	public Date(int year, int month) {
		this(year, month, 14);
	}
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
public class e18_DateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 월 일을 입력하세요 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		Date d1 = new Date(year, month, day);
		System.out.println(d1);
		Date d2 = new Date(2019);
		System.out.println(d2);
	}
}
