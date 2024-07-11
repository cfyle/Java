import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestKeyEvent extends JFrame {
	TestKeyEvent() {
		JTextField tfInput = new JTextField(10);
		tfInput.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("사용자가 유니코드 형태의 문자를 입력했을 때");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("눌러진 키를 놓을 때");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
//				System.out.println("사용자가 누른 키의 코드 : " + keyCode);
//				String keyText = KeyEvent.getKeyText(keyCode);
//				System.out.println(keyText);

				if (keyCode == 27) {
					tfInput.setText("");
				}
			}
		});

		JPanel pnl = new JPanel();
		pnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pnl.grabFocus();
			}
		});

		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("사용자가 패널에 키를 입력");
			}
		});

		pnl.add(tfInput);

		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestKeyEvent().setVisible(true);
	}
}
