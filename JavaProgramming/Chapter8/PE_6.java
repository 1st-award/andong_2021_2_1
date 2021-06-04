package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_6 extends JFrame{
	private String[] phone = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
								"*", "0", "#", "send", "", "end"};
	public PE_6 () {
		setSize(350, 250);
		
		JPanel p2 = new JPanel();
		
		JTextField tf = new JTextField(250);
		add(tf);
		
		p2.setLayout(new GridLayout(5, 3));
		p2.setLayout(null);
		for(int i=0; i<phone.length; ++i) {
			JButton b = new JButton(""+phone[i]);
			p2.add(b);
		}
		add(p2);
		
		JButton b = new JButton("clear");
		add(b, BorderLayout.EAST);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		PE_6 f = new PE_6();
	}
}
