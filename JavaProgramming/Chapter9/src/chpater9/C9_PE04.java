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
		setTitle("�� �����̱�"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLayout(new BorderLayout()); 
		// �гμ��� 
		panel1.setSize(500, 100); 
		panel1.setBackground(Color.yellow); 
		panel2.setSize(500, 100); 
		panel2.setLayout(new FlowLayout()); 
		
		// �г�1������ �̹����гη� ������ ���� Ŭ���� ó�� 
		
		// �г�2���� 
		button1 = new JButton("�������� �̵�"); 
		button2 = new JButton("���������� �̵�"); 
		panel2.add(button1); 
		panel2.add(button2); 
		button1.addActionListener(this); 
		button2.addActionListener(this); 
		// ���� ���� 
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
			button3 = new JButton("�������� �̵�"); 
			button3.addActionListener(e -> 
			{ 
				x -= 20; 
 
			}); 
			button4 = new JButton("���������� �̵�"); 
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