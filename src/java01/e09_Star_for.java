package java01;

public class e09_Star_for {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("----------");
		for (int k = 1; k < 6; k++) {
			for (int l = 0; l < k; l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("----------");
		for (int m = 0; m <5; m++) {
			for (int n = 5; n >m; n--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("----------");
		for (int o = 0; o < 5; o++) {
			for (int q = 0; q < o; q++) {
				System.out.print(" ");
			}	

			for (int p = 5; p >o; p--) {
				System.out.print("*");
			}
			System.out.println("");
			}
		
		}
}
