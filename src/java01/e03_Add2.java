package java01;

import java.util.Scanner;

public class e03_Add2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x; 
		int y;
		int sum;
		System.out.println("첫번째수를 입력해주세요");
		x = sc.nextInt();
		System.out.println("두번째수를 입력해주세요");
		y = sc.nextInt();
		sum = x + y;
		System.out.println("두수의 합 : " + sum);		
	}

}
