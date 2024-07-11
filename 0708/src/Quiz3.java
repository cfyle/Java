import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz3 extends JFrame {
	int a = 250;
	int b = 250;

	public Quiz3() {
		super("움직여");

		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		JButton btn = new JButton("ㅇㅇ");
		btn.setBounds(250, 250, 20, 20);

		btn.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int x = 1;
				int y = 1;

				int keyCode = e.getKeyCode();
				if (keyCode == 37) {

					btn.setBounds(a -= x, b, 20, 20);
				}
				if (keyCode == 38) {
					btn.setBounds(a, b -= y, 20, 20);
				}
				if (keyCode == 39) {
					btn.setBounds(a += x, b, 20, 20);
				}
				if (keyCode == 40) {
					btn.setBounds(a, b += y, 20, 20);
				}

			}
		});

		pnl.add(btn);

		getContentPane().add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz3().setVisible(true);
	}
}
