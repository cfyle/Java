package image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz2 extends JFrame {
	public Quiz2() {
		super("다음, 확인, 리셋");

		JPanel pnl = new JPanel();
		JButton btnLeft = new JButton("다음");
		JTextField tfLeft = new JTextField(10);
		JButton btnRight = new JButton("확인");
		JTextField tfRight = new JTextField(10);
		JButton btnReset = new JButton("리셋");
		btnRight.setEnabled(false);
		tfRight.setEnabled(false);
		btnReset.setEnabled(false);

		btnLeft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnRight.setEnabled(true);
				tfRight.setEnabled(true);

				btnLeft.setEnabled(false);
				tfLeft.setEnabled(false);
			}
		});

		btnRight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btnReset.setEnabled(true);

				btnRight.setEnabled(false);
				tfRight.setEnabled(false);
			}
		});

		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnRight.setEnabled(false);
				tfRight.setEnabled(false);
				tfLeft.setText("");
				tfRight.setText("");
				btnLeft.setEnabled(true);
				tfLeft.setEnabled(true);
				btnReset.setEnabled(false);

			}
		});

		pnl.add(tfLeft);
		pnl.add(btnLeft);
		pnl.add(tfRight);
		pnl.add(btnRight);
		pnl.add(btnReset);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz2().setVisible(true);
	}
}
