import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame (){
		setTitle("MyFrame");
		setSize(400, 150);
		
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p3.setBackground(Color.blue);
		p2.setBackground(Color.cyan);
		p.setBackground(Color.green);
		
		
		JLabel l = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		p2.add(l);
		
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		p3.add(p2);
		p3.add(p);
		
		add(p3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame obj = new MyFrame();
	}
}
