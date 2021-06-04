package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_5 extends JFrame{
	public PE_5() {
		setTitle("My Frame");
		setSize(400, 150);
		setLayout(new GridLayout(0, 5));
		
		for(int i=0; i<20; ++i) {
			JButton b = new JButton(i+"");
			int R = (int)(Math.random()*255);
			int G = (int)(Math.random()*255);
			int B = (int)(Math.random()*255);
			Color nc = new Color(R, G, B);
			b.setBackground(nc);
			add(b);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		PE_5 f = new PE_5();
	}
}
