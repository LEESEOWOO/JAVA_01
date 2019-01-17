package java01;

public class e16_ZigZag_array {
	public static void main(String[] args) {
		int[][] zigzag = new int[5][5];
		for (int i = 0; i < zigzag.length; i++) {
			for (int j = 0; j < zigzag[i].length; j++) {
				if(i%2 == 0) {
					zigzag[i][j] = (j+1) + 10*(int)(i/2);
				}
				else zigzag[i][j] =(10-j) + 10*(int)(i/2);
			}
		}
		for (int i = 0; i < zigzag.length; i++) {
			for (int j = 0; j < zigzag[i].length; j++) {
				System.out.print(zigzag[i][j] + "\t");
			}
			System.out.println("");
		}
		//
		System.out.println("----------");
		int num = 1;
		int count = 5;
		int[][] matrix = new int[5][5];
		for (int i = 0; i < count; i++) {
			if(i%2 == 0) {	
				for (int j = 0; j < count; j++) {
					matrix[i][j] = num ;
					num++;
					}
				}
			else  {
				for (int j = count-1; j >= 0; j--) {
					matrix[i][j] = num;
					num++;
					}
				}
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
