package java01;

public class e11_Star2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i<6) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
			}
			
			}
			else {
				for (int j = 0; j <10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		System.out.println("--------------");
		//
		for (int i = 0; i <10; i++) {
			if (i<5) {
				for (int j = 5; j >i; j--) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j <i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		System.out.println("--------------");
		//
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("--------------");
		
		//
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2*i +1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = i; j < 11-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	
	}

}
