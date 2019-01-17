package java01;

import java.util.Scanner;

public class e06_pay_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int payper = 8350;
		//int RATE = 8350; 더 이상 바뀌지 않는 수 대문자로 명명
		int pay;
		System.out.println("시간을 입력하세요 : ");
		double time = sc.nextDouble();
		if (time > 8){
			pay =(int) (8*payper + (time-8)* payper *1.5);
			
		}
		else pay = (int)(time * payper);
		System.out.println("하루 일당은 "+ pay + " 원 입니다.");
		sc.close();
	}

}
