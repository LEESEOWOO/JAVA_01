package java01;

import java.util.Scanner;

public class e15_MakingSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정사각형 크기는? ");
		int n = sc.nextInt();
		int[][] sq = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sq[i][j] = j+i+1;
				if (sq[i][j]>=10) {
					sq[i][j] = (int)((j+i+1)%10);
				}
				System.out.print(sq[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
