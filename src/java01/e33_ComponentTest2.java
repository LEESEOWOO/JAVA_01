package java01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		//JFrame 속성 설정
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ComponentTest2");
		
		//패널생성. JPanel : 컴포넌트를 가질 수 있는 컨테이너
		JPanel jp = new JPanel();
		//레이블 ㅣ 편집이 불가능한 텍스트
		JLabel label = new JLabel("안뇽");
		//버튼 : 시용자가 클릭했을 때 이벤트를 발생하여 원하는 동작을 하게 되는데에 이용됨.
		JButton btn = new JButton("첫번째 버튼");
		
		//패널에 컴포넌트 추가
		jp.add(label);
		jp.add(btn);
		add(jp); //프레임에 패널 추가
		
		JButton btn1 = new JButton();
		btn.setText("두번째버튼");
		JButton btn2 = new JButton("세번째버튼");
		btn2.setEnabled(false);
		
		jp.add(btn1);
		jp.add(btn2);
		add(jp);
		
		//텍스트필드 : 입력이 가능한 한줄의 텍스트 창
		JTextField jf1 = new JTextField(10);
		JTextField jf2 = new JTextField(20);
		//입력가능 여부
		jf2.setEditable(false);
		
		jp.add(jf1);
		jp.add(jf2);
		add(jp);
		
		setVisible(true);
		
		
		
	}
	
}
public class e33_ComponentTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
