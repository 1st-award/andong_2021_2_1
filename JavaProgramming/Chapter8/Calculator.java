package Chapter8;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	public Calculator() {	
		setTitle("Calculator");
		setSize(500, 250);
		
		JPanel mainP = new JPanel();
		JPanel subP_1 = new JPanel();
		subP_1.setLayout(new GridLayout(0, 5, 3, 3));
		
		JTextField tf = new JTextField(50);
		mainP.add(tf);
		
		for(int i=0; i<labels.length; ++i) {
			JButton b = new JButton(labels[i]);
			b.setBackground(Color.yellow);
			subP_1.add(b);
		}
		
		mainP.add(subP_1);
		add(mainP);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private String[] labels = {"Backspace", "", "", "CE", "C", "7", "8", "9",
			"/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x", 
			"0", "+/-", ".", "+", "="};
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}
