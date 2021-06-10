package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class NoNameClass extends JFrame {
	JButton button;
	JLabel label;
	int count = 0;
	
	public NoNameClass() {
		setSize(400, 150);
		setTitle("이벤트 페이지");
		
		JPanel panel = new JPanel();
		label = new JLabel("현재 증가 값: " + count);
		button = new JButton("증가");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				label.setText("현재 증가 값: " + count);
			}
		});
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		NoNameClass nnc = new NoNameClass();
	}
}