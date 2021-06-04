package Chapter8;

import java.awt.*;
import javax.swing.*;

public class Panel extends JFrame {
	public Panel() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		
		JButton button1 = new JButton("Button1");
		button1.setBackground(Color.yellow);
		
		JButton button2 = new JButton("Button2");
		button2.setBackground(Color.green);
		
		panel.add(button1);
		panel.add(button2);
		add(panel);
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Panel p = new Panel();
	}
}