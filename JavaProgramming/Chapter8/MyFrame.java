package Chapter8;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300, 200);
		setLocation(1920, 1080);
		setTitle("MyFrame");
		setResizable(true);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.black);
		
		JButton button1 = new JButton("NORTH");
		JButton button2 = new JButton("SOUTH");
		JButton button3 = new JButton("EAST");
		JButton button4 = new JButton("WEST");
		JButton button5 = new JButton("CENTER");
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame obj = new MyFrame();
		System.out.println("Success!");
	}
	
}
