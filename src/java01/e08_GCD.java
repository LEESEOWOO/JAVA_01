package java01;

import java.util.Scanner;
//두 수의 최대공약수
public class e08_GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 2;
		int c = a;
		int d = b;
		while (i>0) {
			i = c%d;
			c = d;
			d = i;
			}
		System.out.println(a +"와"+b+"의 최대공약수는 "+ c +"입니다.");
	}
	
}
