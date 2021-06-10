package chpater9;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class RPS extends JFrame implements ActionListener{
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	JPanel panel;
	JButton rock, paper, scissor;
	JLabel output, information;
	
	public RPS() {
		setTitle("가위 바위 보");
		setSize(400, 150);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JLabel("Good Luck");
		scissor = new JButton("0. 가위");
		rock = new JButton("1. 바위");
		paper = new JButton("2. 보");
		
		rock.addActionListener(this);
		scissor.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(scissor);
		panel.add(rock);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		RPS rps = new RPS();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		int user = Integer.parseInt(""+b.getText().charAt(0));
		
		Random random = new Random();
		int computer = random.nextInt(3);
		if(user==computer) {
			output.setText("인간과 컴퓨터가 비겼음");
		}
		else if(user == (computer+1)%3) {
			output.setText("인간: " + user + "컴퓨터: " + computer + " 인간 승리");
		}
		else {
			output.setText("인간: "+user+"컴퓨터: " + computer + " 컴퓨터 승리");
		}
	}
}