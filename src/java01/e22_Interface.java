package java01;

interface Fly{
	void Fly();
}
interface NoFly{
	void NoFly();
}
class Animal{
	public void print() {
		System.out.println("동물입니다");
	}
}
class Insect{
	public void print() {
		System.out.println("곤충입니다");
	}
}
class Bird extends Animal implements Fly{

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("날아요~");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
	
}
class Dogg extends Animal implements NoFly{

	@Override
	public void NoFly() {
		// TODO Auto-generated method stub
		System.out.println("걸어다녀요");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
}
class Butterfly extends Insect implements Fly{
	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("날아요~");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
}
class Ant extends Insect implements NoFly{
	@Override
	public void NoFly() {
		// TODO Auto-generated method stub
		System.out.println("걸어다녀요");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
}
public class e22_Interface {
	public static void main(String[] args) {
		Dogg d = new Dogg();
		d.print();
		d.NoFly();
	}
}
