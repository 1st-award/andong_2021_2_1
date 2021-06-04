package chpater9;

import java.awt.event.*;
import javax.swing.*;

public class KeyEvent02 extends JFrame {
	int x_pos = 150, y_pos = 150;
	
	public KeyEvent02() {
		setSize(600, 300);
		setTitle("Game");
		
		JPanel panel = new JPanel();
		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\JavaProject\\Chapter9\\src\\doge.jpg");
		JButton b = new JButton();
		b.setIcon(icon);
		panel.add(b);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_UP:	y_pos-=10;	break;
				case KeyEvent.VK_DOWN:	y_pos+=10;	break;
				case KeyEvent.VK_LEFT:	x_pos-=10;	break;
				case KeyEvent.VK_RIGHT:	x_pos+=10;	break;
				}
				b.setLocation(x_pos, y_pos);
			}
			public void keyReleased(KeyEvent e) {	}
			public void keyTyped(KeyEvent e) {	}
		});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		KeyEvent02 ke02 = new KeyEvent02();
	}
}
