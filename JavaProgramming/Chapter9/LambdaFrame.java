package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class LambdaFrame extends JFrame {
	JButton button;
	JLabel label;
	int count = 0;
	
	public LambdaFrame() {
		setSize(400, 150);
		setTitle("�̺�Ʈ ������");
		
		JPanel panel = new JPanel();
		label = new JLabel("���� ī��Ʈ ��: "+count);
		button = new JButton("����");
		button.addActionListener(e->{
			count++;
			label.setText("���� ī��Ʈ ��: " + count);
		});
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		LambdaFrame lb = new LambdaFrame();
	}
}