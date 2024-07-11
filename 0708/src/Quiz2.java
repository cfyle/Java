import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz2 extends JFrame {

	public Quiz2() {
		super("입력");

		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		JButton btn = new JButton("도망");
		btn.setBounds(199, 129, 81, 23);

		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				int x = (int) (Math.random() * 300);
				int y = (int) (Math.random() * 300);
				btn.setBounds(x, y, 81, 23);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		pnl.add(btn);

		getContentPane().add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz2().setVisible(true);
	}
}
