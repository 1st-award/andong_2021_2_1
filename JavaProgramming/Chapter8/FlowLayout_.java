package Chapter8;

import java.awt.*;
import javax.swing.*;

public class FlowLayout_ extends JFrame{
	public FlowLayout_() {
		setTitle("FlowLayoutTest");
		setSize(300, 150);
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FlowLayout_ obj = new FlowLayout_();
	}
}
