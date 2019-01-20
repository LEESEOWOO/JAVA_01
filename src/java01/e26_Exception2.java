package java01;

public class e26_Exception2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[5] = 6;
		}
/*		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
			e.printStackTrace();
		}
		모든예외를 다 잡아준다 -> 처리를 한방에 but 어떤 예외인지 알 수 없음
*/
	catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("index가 모자라요");
		}//예외를 잡아 그자리에서 처리
		//해당 예외만 잡아줌. (지금의 경우 배열인덱스) -> 적절한 조취를 할 수 있음.
		
	}
}
