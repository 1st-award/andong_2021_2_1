package Chapter8;

import java.awt.*;
import javax.swing.*;

public class LayoutNull extends JFrame{
	public LayoutNull() {
		setTitle("Absolute Position Test");
		setSize(300, 150);
		setLayout(null);
		
		for(int i=0; i<2; ++i) {
			JButton button = new JButton("Button" + (i+1));
			button.setLocation(i*100, 30);
			button.setSize(90, 20);
			add(button);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		LayoutNull obj = new LayoutNull();
	}
}
