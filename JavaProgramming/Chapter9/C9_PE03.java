package chpater9;

import java.awt.*;
import javax.swing.*;

public class C9_PE03 extends JFrame {
	public C9_PE03() {
		setSize(300, 150);
		setTitle("Mile -> Km");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label1 = new JLabel("마일을 입력하시오");
		JTextField tf = new JTextField(10);
		JLabel label2 = new JLabel("->");
		JLabel label3 = new JLabel("0km");
		
		panel.add(label1);
		panel.add(tf);
		panel.add(label2);
		panel.add(label3);
		JButton b = new JButton("변환");
		panel.add(b);
		b.addActionListener(e->{
			String msg = tf.getText();
			double mile = Double.parseDouble(msg);
			label3.setText(mile*1.609+"km");
		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		C9_PE03 f = new C9_PE03();
	}
}
