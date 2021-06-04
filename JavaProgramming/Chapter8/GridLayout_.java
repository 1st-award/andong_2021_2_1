package Chapter8;

import java.awt.*;
import javax.swing.*;

public class GridLayout_ extends JFrame{
	public GridLayout_() {
		setTitle("GridLayoutTest");
		setSize(300, 150);
		setLayout(new GridLayout(0, 3));
		
		add(new Button("Button1"));
		add(new Button("Button2"));
		add(new Button("Button3"));
		add(new Button("Button4"));
		add(new Button("Button5"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		GridLayout_ obj = new GridLayout_();
	}
}
