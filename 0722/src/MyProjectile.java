import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

class MovingLabel extends JLabel {
	private int x;
	private int y;

	public MovingLabel(int x, int y) {
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

public class MyProjectile extends JFrame {
	private List<MovingLabel> list;
	private JLabel lbl;
	private boolean pressUp;
	private boolean pressDown;

	public MyProjectile() {
		super("움직이는 요소");

		list = new ArrayList<>();

		URL resource = MyProjectile.class.getResource("/image/춘식90.png");
		ImageIcon icon = new ImageIcon(resource);

		lbl = new JLabel(icon);
		lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl.setBounds(50, 50, 50, 50);

		setLayout(null);
		add(lbl);

		setFocusable(true);
		requestFocus();

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					int x = lbl.getX() + lbl.getWidth();
					int y = lbl.getY();
					MovingLabel lblFire = new MovingLabel(x, y);

					add(lblFire);

					list.add(lblFire);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					movePlayerDown();
					pressDown = true;
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					movePlayerUp();
					pressUp = true;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					movePlayerRight();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					movePlayerLeft();
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
					if (movingLabel.getX() >= MyProjectile.this.getWidth()) {
						list.remove(0);
						remove(movingLabel);
					}
				}
				if (pressUp) {
					movePlayerUp();
				} else if (pressDown) {
					movePlayerDown();
				}
				revalidate();
				repaint();
			}
		});

		timer.start();

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyProjectile().setVisible(true);
	}

	private void movePlayerUp() {
		int x = lbl.getX();
		int y = lbl.getY();

		int preY = y - 5;
		if (preY >= 0) {
			lbl.setLocation(x, preY);
		}
	}

	private void movePlayerDown() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preY = y + lbl.getHeight() + 5;
		if (preY <= getContentPane().getHeight()) {
			y += 5;
			lbl.setLocation(x, y);
		}
	}

	private void movePlayerRight() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preX = x + lbl.getWidth() + 5;
		if (preX <= getContentPane().getWidth()) {
			x += 5;
			lbl.setLocation(x, y);
		}
	}

	private void movePlayerLeft() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preX = x + lbl.getWidth() - 5;
		if (preX <= getContentPane().getWidth()) {
			x -= 5;
			lbl.setLocation(x, y);
		}
	}
}
