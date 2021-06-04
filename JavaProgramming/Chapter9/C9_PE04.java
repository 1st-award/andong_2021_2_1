package chpater9;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class C9_PE04 extends JFrame implements ActionListener{ 
	static int x = 230, y = 40; 
	JPanel panel1 = new MyPanel(); 
	JPanel panel2 = new JPanel(); 
	JButton button1, button2, button3, button4 ;
	private Window label; 
	class MyPanel extends JPanel { 
		public MyPanel(){ 
			addKeyListener(new KeyListener(){ 
				public void keyPressed(KeyEvent e){ 
					int keycode = e.getKeyCode(); 
					switch(keycode){ 
					case KeyEvent.VK_LEFT : x-=20; 
					repaint(); break; 
					case KeyEvent.VK_RIGHT : x+= 20; 						repaint(); break; 
					
					}
				}
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
				} 
			}); 
			this.requestFocus(); 
			setFocusable(true); 
		} 
		public void paint(Graphics g) { 
			super.paint(g); 
			g.setColor(Color.red); 
			g.fillOval(x, y, 50, 50); 
		} 
	} 
	C9_PE04() { 
		setSize(500, 200); 
		setTitle("원 움직이기"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLayout(new BorderLayout()); 
		// 패널설정 
		panel1.setSize(500, 100); 
		panel1.setBackground(Color.yellow); 
		panel2.setSize(500, 100); 
		panel2.setLayout(new FlowLayout()); 
		
		// 패널1설정은 이미지패널로 위에서 따로 클래스 처리 
		
		// 패널2설정 
		button1 = new JButton("왼쪽으로 이동"); 
		button2 = new JButton("오른쪽으로 이동"); 
		panel2.add(button1); 
		panel2.add(button2); 
		button1.addActionListener(this); 
		button2.addActionListener(this); 
		// 최종 실행 
		add(panel1, BorderLayout.CENTER); 
		add(panel2, BorderLayout.SOUTH); 
		setVisible(true); 
	} 
	
	@Override public void actionPerformed(ActionEvent g) { 
		if (g.getSource() == button1) { 
			x -= 20; 
			repaint(); 
		} 
		else if (g.getSource() == button2) { 
			x += 20; 
			repaint(); 
		} 
		else
		{
			button3 = new JButton("왼쪽으로 이동"); 
			button3.addActionListener(e -> 
			{ 
				x -= 20; 
 
			}); 
			button4 = new JButton("오른쪽으로 이동"); 
			button4.addActionListener(e -> 
			{ 
             x += 20; 
 
			}); 
		}
	}
	
	public static void main(String[] args) { 
		new C9_PE04(); 
	} 
}