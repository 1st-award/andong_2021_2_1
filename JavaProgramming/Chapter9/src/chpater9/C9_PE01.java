package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class C9_PE01 extends JFrame{
	public C9_PE01() {
		setSize(300, 150);
		setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		JButton button = new JButton("��ư�� �����ÿ�");
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				button.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
			public void mouseReleased(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {	}
			public void mouseExited(MouseEvent e) {	}
			public void mouseClicked(MouseEvent e) {	}
		});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		C9_PE01 f = new C9_PE01();
	}
}
