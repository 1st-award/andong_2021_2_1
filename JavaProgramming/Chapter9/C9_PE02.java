package chpater9;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class C9_PE02 extends JFrame {
	public C9_PE02() {
		setSize(300, 150);
		setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton("노란색");
		JButton b2 = new JButton("핑크색");
		panel.setBackground(Color.yellow);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.yellow);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.pink);;
			}
		});
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		C9_PE02 f = new C9_PE02();
	}
}
