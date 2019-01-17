package java01;

import java.util.Scanner;

public class e14_rainfall_2d_array {
	//3년 동안 연도별 강수량.
	//사용자에게 분기별 강수량 입력받아 연도별 강수량 출력. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] rainfall = new int[3][4];
		int[] sumyear = new int[3];
		for (int i = 0; i < rainfall.length; i++) {
			for (int j = 0; j < rainfall[i].length; j++) {
				System.out.println(i + "년차 " + (j+1) +"분기 강수량 입력 : ");
				rainfall[i][j] = sc.nextInt();
				sumyear[i] += rainfall[i][j];
			}
				
		}
		for (int i = 0; i < sumyear.length; i++) {
			System.out.println(i + "년차 강수량 :" + sumyear[i]);
		}
	}

}
