package java01;
//기존배열보다 한칸 큰 배열을 생성하고 추가할 데이터를 매개변수로 받아 마지막칸에 넣어주기
//삭제할 데이터의 인덱스를 매개변수로 받아서 삭제
public class e23_ArrayList<T> {
	T[] arr;
	T[] arr2;
	
	public void add(T data) {
		if (arr == null) {
			arr = (T[])new Object[1];
			arr[0] = data;
		}
		else {
			arr2 = (T[])new Object[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr2[arr.length] = data;
			arr = arr2;
		}
		
	}
	
	public void remove(int index) {
		if(arr == null || arr.length == 1) {
			arr = null;
			return;
		}
		else {
			T[] newArr = (T[]) new Object[arr.length -1];
			for (int i = 0; i < arr.length; i++) {
				if(i<index) newArr[i] = arr[i];
				else if(i == index) continue;
				else newArr[i-1] = arr[i];
			}
			arr = newArr;
		}
	}
	public T get(int i) {
			if(arr == null) return null;
			return arr[i];
		}
		
	public void set(int i, T data) {
		if(arr == null) return;
		else arr[i] = data;	
	}
	public void printArray() {
		if(arr != null)
			for(T d : arr) {
				System.out.print(d + ", ");
			}
		System.out.println("");
	}
	

}
/*제니릭
일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 재사용하는 프로그래밍 기법
제네릭은 컬렉션 라이브러리에 많이 사용된다. 

*/
