package java01;

import java.util.Scanner;

public class e05_findMaxValue {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = n.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = n.nextInt();
		int result = (num1 >= num2) ? num1 : num2 ;
		System.out.printf("두 수 중 큰 수는 %d 입니다.",result);
		
		System.out.print("\n첫번째 숫자를 입력하세요");
		int num3 = n.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		int num4 = n.nextInt();
		System.out.print("세번째 숫자를 입력하세요");
		int num5 = n.nextInt();
		int result1 = (num3 >= num4) ? num3 : num4 ;
		int result2 = (num5 >= result1) ? num5 : result1;
		System.out.printf("세 수 중 가장 큰 수는 %d 입니다.", result2);
		int result3 = (num3 > num4) ? (num3 > num5 ? num3 : num5) : (num4 > num5 ? num4 : num5);
		
		//세 수 중 중간값
		int mid = (num3 >= num4) ? 
				  (num4 >= num5 ? num4 :(num3 >= num5) ? num5 : num3) :
				  (num3 >= num5) ? num3 : (num4 >= num5) ? num5 : num4 ;
		System.out.println("\n중간값은  " + mid +" 입니다.");
		
		int max1 = (num3 >= num4) ? num3 : num4;
		int max2 = (num4 >= num5) ? num4 : num5;
		int max3 = (num3 >= num5) ? num3 : num5;

		int mid1 = (max1 <= max2) ? max1 : max2 ;
		int mid2 = (mid1 < max3) ? mid1 : max3 ;
		
		//세 수를 더해 최대값, 최소값 빼기
		int resultmax1 = (num3 >= num4) ? num3 : num4 ;
		int resultmax2 = (num5 >= resultmax1) ? num5 : resultmax1;
		
		int resultmin1 = (num3 <= num4) ? num3 : num4 ;
		int resultmin2 = (num5 <= resultmin1) ? num5 : resultmin1;
		
		int sum = num3 + num4 + num5 ;
		int summid = sum - (resultmax2 + resultmin2);
		System.out.println("중간값 : " + summid);
		
	}

}


