package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class CountFrame extends JFrame {
	JButton button;
	JLabel label;
	int count = 0;
	
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText("���� ���� ��" + count);
		}
	}
	
	public CountFrame() {
		setSize(400, 150);
		setTitle("�̺�Ʈ ������");
		
		JPanel panel = new JPanel();
		button = new JButton("����");
		label = new JLabel("���� ���� ��"+count);
		button.addActionListener(new MyListener());
		
		panel.add(label);
		panel.add(button);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		CountFrame cf = new CountFrame();
	}
}