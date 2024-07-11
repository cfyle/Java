import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestGuilogicFlow extends JFrame {
	public TestGuilogicFlow() {
		CardLayout cardLayout = new CardLayout();
		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(cardLayout);

		JPanel pnlFirst = new JPanel();
		pnlFirst.setBackground(Color.RED);
		JPanel pnlSecond = new JPanel();
		pnlSecond.setBackground(Color.BLUE);

		JPanel pnlSouth = new JPanel();
		JButton btnStart = new JButton("처음으로");
		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");
		JButton btnEnd = new JButton("마지막으로");
		pnlSouth.add(btnStart);
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		pnlSouth.add(btnEnd);

		pnlCenter.add(pnlFirst, "First");
		pnlCenter.add(pnlSecond, "Second");
		pnlCenter.add(new JLabel("세번째 화면"), "Third");
		pnlCenter.add(new JLabel("네번째 화면"), "Forth");

		add(pnlCenter);

		add(pnlSouth, "South");

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.first(pnlCenter);
			}
		});

		btnEnd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(pnlCenter);
			}
		});

		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pnlCenter);
			}
		});

		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pnlCenter);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestGuilogicFlow().setVisible(true);
	}

}
