package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class NoNameClass extends JFrame {
	JButton button;
	JLabel label;
	int count = 0;
	
	public NoNameClass() {
		setSize(400, 150);
		setTitle("�̺�Ʈ ������");
		
		JPanel panel = new JPanel();
		label = new JLabel("���� ���� ��: " + count);
		button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				label.setText("���� ���� ��: " + count);
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