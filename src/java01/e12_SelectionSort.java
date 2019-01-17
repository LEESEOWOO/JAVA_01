package java01;

import java.util.Arrays;

public class e12_SelectionSort {
	//selection sort
	public static void main(String[] args) {		
		int[] arr2 = {3,2,5,4,1};
		int minVal; //최소값 저장 변수
		int minPos; //최소값의 위치를 저장할 변수
			
		for(int j = 0; j<arr2.length; j++) {
				
			minVal = arr2[j]; //리스트의 첫번째 원소를 최소값으로 설정
			minPos = j;
			for(int i = j+1; i< arr2.length; i++) {
				if(minVal > arr2[i]) { //최소값과 현재 위치의 값을 비교해서 현재위치의 값이
					//작으면
					minVal = arr2[i]; //현재값을 최소값으로
					minPos = i;      //현재 인덱스를 최소값 위치 정보로
				}
			}
			//최소값이 있는 데이터과 0번째 위치의 값을 교체
			//최소값 데이터가 있는 위치를 기억해야함
			int tmp = arr2[minPos];
			arr2[minPos] = arr2[j];
			arr2[j] = tmp;
		}
			
		for(int a : arr2) {
			System.out.print(a + " ");
		}		
	}
}
