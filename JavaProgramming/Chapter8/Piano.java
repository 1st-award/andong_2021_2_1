package Chapter8;

import java.awt.*;
import javax.swing.*;

public class Piano extends JFrame{
	public Piano() {
		setTitle("My Piano");
		setSize(610, 300);
		setLayout(null);
		
		for(int i=0; i<10; i++) {
			JButton button = new JButton("C" + i);
			button.setLocation(i*60, 100);
			button.setSize(50, 150);
			add(button);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Piano obj = new Piano();
	}
}
