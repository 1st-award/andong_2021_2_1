package Chapter8;

import java.awt.*;
import javax.swing.*;

public class PizzaFrame extends JFrame{
	public PizzaFrame() {
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pizza Frame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);
		
		JButton b1 = new JButton("�޺�����");
		JButton b2 = new JButton("������������");
		JButton b3 = new JButton("�Ұ������");
		
		panelB.add(b1);
		panelB.add(b2);
		panelB.add(b3);
		
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.setBackground(Color.blue);
		panelA.setBackground(Color.cyan);
		panelB.setBackground(Color.green);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		PizzaFrame p = new PizzaFrame();
	}
}
