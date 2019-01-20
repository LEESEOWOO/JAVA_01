package java01;

class Car{
	private int speed;
	private String color;
	private int mileage;

	private static int numberOfCars;
//	->다른 클래스 CarTest2에서 접근 불가능
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public Car() {
		numberOfCars++;
	}
	//자동차 속도 상수지정
	private static final int INCREASE_AMOUNT = 10;

	public void speedUp() {
		speed += INCREASE_AMOUNT;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car2 [speed=" + speed + ", color=" + color + ", mileage=" + mileage + "]";
	}
	
}
public class e17_CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(); 
		c1.setColor("RED");
		c1.setSpeed(100);
		c1.setMileage(1000);
		c2.setColor("RED");
		c2.setSpeed(200);
		c2.setMileage(2000);

		System.out.println(Math.PI);//정적변수의 예
		System.out.println(Car.getNumberOfCars());
		System.out.println(c1);
		System.out.println(c2);
	}
}
