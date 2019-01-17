package java01;

import java.util.Arrays;

public class e13_BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,2,5,4,1};
		int m ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i ; j++) {
				if(arr[j]>arr[j+1]) {
					m = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = m;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
