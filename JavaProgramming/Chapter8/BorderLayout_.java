package Chapter8;
import java.awt.*;
import javax.swing.*;

public class BorderLayout_ extends JFrame{
	public BorderLayout_() {
		setTitle("BorderLayoutTest");
		setSize(300, 150);
		setLayout(new BorderLayout());
		
		add(new JButton("Button1"), BorderLayout.NORTH);
		add(new JButton("Button2"), BorderLayout.SOUTH);
		add(new JButton("Button3"), BorderLayout.EAST);
		add(new JButton("Button4"), BorderLayout.WEST);
		add(new JButton("Button5"), BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		BorderLayout_ obj = new BorderLayout_ ();
	}
}
