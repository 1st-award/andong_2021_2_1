package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PE_3 extends JFrame{
	private String[] day = {"1��", "2��", "3��", "4��", "5��"};
	
	public PE_3() {
		setSize(500, 150);
		setTitle("My Frame");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JLabel label = new JLabel("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�. �����ϼ��� �Է��ϼ���.");
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
