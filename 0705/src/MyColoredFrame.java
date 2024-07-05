import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyColoredFrame extends JFrame implements ActionListener {
	private JPanel pnl;
	private Random random;

	public MyColoredFrame() {
		super("배경색 테스트");
		random = new Random();

		pnl = new JPanel();

		pnl.setBackground(new Color(85, 44, 140));

		JButton btn = new JButton("색상 변경");
		btn.addActionListener(this);
		pnl.add(btn);
		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		
		pnl.setBackground(new Color(r, g, b));
	}

	public static void main(String[] args) {
		new MyColoredFrame().setVisible(true);
	}

}
