package java01;

import java.util.Scanner;

public class e07_DayInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요 : ");
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("년도를 입력하세요");
			int year = sc.nextInt();
			String result = ((year%4 == 0) && (year%100 != 0)) || (year % 400 == 0) ? "29일" : "28일" ;
			System.out.println(result);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		
		default:
			System.out.println("월을 잘못 입력했습니다.");
			break;
		}
	}

}
