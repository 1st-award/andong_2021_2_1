package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_2 extends JFrame{
	public PE_2() {
		setSize(300, 150);
		setTitle("My Frame");
		
		JPanel p = new JPanel();
		JLabel lb = new JLabel("ī���� ��");
		JTextField tf = new JTextField("0");
		JButton b1 = new JButton("����");
		
		p.add(lb);
		p.add(tf);
		p.add(b1);
		add(p);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		PE_2 f = new PE_2();
	}
}
