package java01;

import javax.swing.JFrame;

public class e31_MyFrame extends JFrame{
	public e31_MyFrame() {
		setTitle("MyFrameTest");
		//Frame 셋팅 메소드 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//끌때 옵션
		setResizable(true);//리사이즈
		setSize(100,100);//사이즈
		setVisible(true);//비져블
	}

	public static void main(String[] args) {
		e31_MyFrame mf = new e31_MyFrame();
	//JFrame상속받아 MyFrame 정의 , 그 안에 main method만들어 객체 생성
	}
}
