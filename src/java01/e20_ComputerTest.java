package java01;

class Calculate {
	public double areaCircle(double r) {
		return r*r*3.14;
	}
}
class Computer extends Calculate{

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}	
}
public class e20_ComputerTest {
	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		System.out.println(c1.areaCircle(5));
		Computer a1 = new Computer();
		System.out.println(a1.areaCircle(5));
	}
}
/*메소드 오버라이딩
상속된 메소드의 내용이 자식클래스에 맞지 않을 경우 자식 클래스에서 동일한 메소드를 정의 하는 것
부모 메소드와 동일한 return타입, 메소드이름, 매개변수 리스트를 가져야 한다.*/
	
	
