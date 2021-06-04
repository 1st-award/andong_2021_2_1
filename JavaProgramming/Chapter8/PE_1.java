package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_1 extends JFrame{
	public PE_1() {
		setSize(300, 150);
		setTitle("My Frame");
		
		JPanel p = new JPanel();
		JLabel tf = new JLabel("자바는 재미있나요?");
		JButton b1 = new JButton("네");
		JButton b2 = new JButton("아니요");
		
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add(p);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		PE_1 f = new PE_1();
	}
}
