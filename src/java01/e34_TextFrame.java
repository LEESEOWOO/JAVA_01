package java01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class e34_TextFrame extends JFrame implements ActionListener{
	JTextField id;
	JPasswordField pw;
	JFormattedTextField date;
	JTextArea textArea;
	public e34_TextFrame() throws ParseException{
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		id = new JTextField();
		panel.add(new JLabel("ID : "));
		panel.add(id);
		id.addActionListener(this);
		
		pw = new JPasswordField();
		panel.add(new JLabel("PW : "));
		panel.add(pw);
		pw.addActionListener(this);
		
		MaskFormatter mf = new MaskFormatter("####.##.##");
		mf.setPlaceholderCharacter('_');
		
		date = new JFormattedTextField(mf);
		panel.add(new JLabel("DATE : "));
		panel.add(date);
		date.addActionListener(this);
		
		textArea = new JTextArea(10,30);
		panel.add(textArea);
		add(panel,BorderLayout.NORTH);
		add(textArea,BorderLayout.SOUTH);
		
		setSize(500, 400);
		setTitle("TextFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		try {
			new e34_TextFrame();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == id ||e.getSource() == pw ||e.getSource() == date) {
			String text = "id : " + id.getText() + "\n" +
					"pw : " + pw.getText() + "\n" +
					"date : " + date.getText() + "\n" ;
			textArea.append(text);
		}	
	}
	
}

