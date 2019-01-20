package java01;
//예외처리
public class e25_Exception {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		//int result = x/y;
		// java.lang.ArithmeticException: 
		try {
			int result = x/y;
		}
		catch(Exception e){
			System.out.println("0으로 나눌수 없음");
		}
		System.out.println("**");
	}
}
