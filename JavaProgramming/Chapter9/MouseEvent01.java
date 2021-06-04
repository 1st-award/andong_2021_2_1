package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class MouseEvent01 extends JFrame{
	int x_pos = 150, y_pos = 150;
	
	public MouseEvent01() {
		setSize(600, 300);
		setTitle("Game");
		
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\JavaProject\\Chapter9\\src\\doge.jpg");
		button.setIcon(icon);
		button.setLocation(x_pos, y_pos);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {	
			public void mousePressed(MouseEvent e) {
				x_pos = e.getX();
				y_pos = e.getY();
				
			button.setLocation(x_pos, y_pos);
			}
			public void mouseReleased(MouseEvent e) {	}
			public void mouseClicked(MouseEvent e) {	}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {	}
		});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MouseEvent01 me01 = new MouseEvent01();
	}
}
