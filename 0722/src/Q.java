import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

class coordinate extends JLabel {
	private int x;
	private int y;

	public coordinate(int x, int y) {
		this.x = x;
		this.y = y;

		setBounds(x, y, 50, 50);
		setText("-");
	}

	public void update() {
		x += 5;
		setBounds(x, y, 50, 50);
	}
}

class MoveSmile extends JFrame {
	private List<MovingLabel> list;
	private JLabel lbl;
	private JLabel lbl2;
	private boolean pressUp = false;
	private boolean pressDown = false;
	private JTextField score;

	public MoveSmile() {
		super("비트코인 먹기 게임");
		
		Random r = new Random();

		list = new ArrayList<>();

		URL resource = MoveSmile.class.getResource("/image/스마일.png");
		ImageIcon icon = new ImageIcon(resource);
		
		URL resource2 = MoveSmile.class.getResource("/image/비트코인.png");
		ImageIcon icon2 = new ImageIcon(resource2);

		lbl = new JLabel(icon);
		lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl.setBounds(50, 50, 50, 50);
		
		lbl2 = new JLabel(icon2);
		lbl2.setBounds(50, 50, 50, 50);

		setLayout(null);
		add(lbl);
		add(lbl2);
		
		score = new JTextField(10);
		add(score, "North");

		setFocusable(true);
		requestFocus();

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					int x = lbl.getX();
					int y = lbl.getY();
					int preY = y + lbl.getHeight() + 5;
					if (preY <= getContentPane().getHeight()) {
						y += 5;
						lbl.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					int x = lbl.getX();
					int y = lbl.getY();

					int preY = y - 5;
					if (preY >= 0) {
						lbl.setLocation(x, preY);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int x = lbl.getX();
					int y = lbl.getY();
					int preX = x + lbl.getWidth() + 5;
					if (preX <= getContentPane().getWidth()) {
						x += 5;
						lbl.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					int x = lbl.getX();
					int y = lbl.getY();
					int preX = x + lbl.getWidth() - 5;
					if (preX <= getContentPane().getWidth()) {
						x -= 5;
						lbl.setLocation(x, y);
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					pressUp = false;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					pressDown = false;
				}
			}
		});
		Timer timer = new Timer(17, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (MovingLabel m : list) {
					m.update();
				}
				if (!list.isEmpty()) {
					MovingLabel movingLabel = list.get(0);
					if (movingLabel.getX() >= MoveSmile.this.getWidth()) {
						list.remove(0);
						remove(movingLabel);
					}
				}
				
				revalidate();
				repaint();
			}
		});

		timer.start();

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Q {
	public static void main(String[] args) {
		new MoveSmile().setVisible(true);
	}
}
