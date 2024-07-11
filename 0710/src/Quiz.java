import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz extends JFrame implements ActionListener {
	private JPanel pnl;
	private JButton[] buttons;
	private JButton btnAdd;

	public Quiz() {
		super("이벤트 소스 확인");

		buttons = new JButton[20];

		initCompnents();

		penelLayout();

		addButtonListener();
		getContentPane().setLayout(null);

		getContentPane().add(pnl);
		pnl.setLayout(new GridLayout(0, 5, 0, 0));

		setSize(700, 585);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void addButtonListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}

	private void penelLayout() {
		for (int i = 0; i < buttons.length; i++) {
			pnl.add(buttons[i]);
		}
	}

	private void initCompnents() {
		pnl = new JPanel();
		pnl.setBounds(0, 0, 684, 546);
		for (int i = 0; i < buttons.length; i++) {
			if (i < 5) {
				buttons[i] = createSquareButton("A" + (i + 1));
			} else if (5 <= i && i < 10) {
				buttons[i] = createSquareButton("B" + (i - 4));
			} else if (10 <= i && i < 15) {
				buttons[i] = createSquareButton("C" + (i - 9));
			} else if (15 <= i && i < 20) {
				buttons[i] = createSquareButton("D" + (i - 14));
			} else {
				buttons[i] = createSquareButton("E" + (i - 19));
			}
		}

	}

	private JButton createSquareButton(String text, int pixel) {
		JButton sqaureButton = new JButton(text);
		sqaureButton.setPreferredSize(new Dimension(pixel, pixel));
		return sqaureButton;
	}

	private JButton createSquareButton(String text) {
		return createSquareButton(text, 150);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		int index = -1;

		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] == source) {
				index = i;
			}
		}
		int choice = index;
		if (choice >= 0) {
			buttons[choice].setText("예약완료");
		}

	}

	public static void main(String[] args) {
		new Quiz().setVisible(true);
	}
}
