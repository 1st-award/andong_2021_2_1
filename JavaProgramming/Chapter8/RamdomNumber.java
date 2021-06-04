package Chapter8;

import java.awt.*;
import javax.swing.*;

public class RamdomNumber extends JFrame{
	public RamdomNumber() {
		setSize(350, 150);
		setTitle("My Frame");
		setLayout(null);
		
		for(int i=0; i<30; ++i) {
			JLabel n = new JLabel(i+"");
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*100);
			//n.setSize(5, 5);
			// n.setLocation(x, y);
			n.setBounds(x, y, 30, 30);
			add(n);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		RamdomNumber f = new RamdomNumber();
	}
}
