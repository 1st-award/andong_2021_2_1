package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class TwoEvent extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	int count = 0;
	
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("���� ���� ��" + count);
	}
	
	public TwoEvent() {
		setSize(400, 150);
		setTitle("���� �̺�Ʈ");
		
		JPanel panel = new JPanel();
		label = new JLabel("���� ���� ��" + count);
		button = new JButton("����");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		TwoEvent te = new TwoEvent();
	}
}