package java01;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		//버튼 객체 생성
		JButton button = new JButton("버튼");
		//버튼을 frame에 추가
		this.add(button);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ComponentTest");
		setVisible(true);
	}
}
public class e32_ComponentTest1 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
