package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_3 extends JFrame{
	private String[] day = {"1일", "2일", "3일", "4일", "5일"};
	
	public PE_3() {
		setSize(500, 150);
		setTitle("My Frame");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
		p1.add(label);
		for(int i=0; i<day.length; ++i) {
			JButton b = new JButton(day[i]);
			p2.add(b);
		}
		
		p1.add(p2);
		p1.add(p3);
		add(p1);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		PE_3 f = new PE_3();
	}
}
