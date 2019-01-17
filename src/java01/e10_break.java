package java01;

import java.util.Scanner;

public class e10_break {
	//break문  반복문의 실행을 중단하고 반복문을 빠져나감
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n = 0;
		for (int i = 1; ; i++) {
			System.out.println("점수를 입력하세요");
			int num = sc.nextInt();
			if (num < 0) {
				break;
			}
			sum += num;
			n= i;
		}
		System.out.println("mean : " + sum/n);
	}
}
