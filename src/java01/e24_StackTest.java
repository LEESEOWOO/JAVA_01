package java01;

import java.util.Stack;

//stack : 순서가 있는 데이터의 집합을 LIFO방식으로 관리하는 자료구조

class Coin{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coin(int value) {
		super();
		this.value = value;
	}
}
public class e24_StackTest {
	public static void main(String[] args) {
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(500)); //데이터 넣기
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(10));
	
		while(!coinbox.isEmpty()) {
			Coin c = coinbox.pop(); //데이터 꺼내오기
			System.out.println(c.getValue() + " 원");
		}
	}
}
