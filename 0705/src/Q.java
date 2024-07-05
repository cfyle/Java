import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Listen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("이벤트 발생");
	}

}

public class Q extends JFrame {
	public Q() {
		super("숫자 올리고 내리기");

		JPanel pnl = new JPanel();
		JButton btn = new JButton("[ 더하기 ]");
		JButton btn2 = new JButton("[ 빼기 ]");
		JLabel lbl = new JLabel("숫자 올라기");
		JLabel lbl2 = new JLabel("숫자 내리기");

		btn.addActionListener(new Listen() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("d");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(444, 444);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Q().setVisible(true);

	}
}
