package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PizzaFrame extends JFrame{
	public PizzaFrame() {
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pizza Frame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		
		panelB.add(b1);
		panelB.add(b2);
		panelB.add(b3);
		
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.setBackground(Color.blue);
		panelA.setBackground(Color.cyan);
		panelB.setBackground(Color.green);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		PizzaFrame p = new PizzaFrame();
	}
}
