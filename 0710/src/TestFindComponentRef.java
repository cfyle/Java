import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFindComponentRef extends JFrame implements ActionListener {
	private JPanel pnl;
	private JPanel pnlNorth;
	private JButton[] buttons;
	private JButton btnAdd;

	public TestFindComponentRef() {
		super("이벤트 소스 확인");

		buttons = new JButton[5];

		initCompnents();

		penelLayout();

		addButtonListener();

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void addButtonListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}

		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btnNew = createSquareButton("");
				pnl.add(btnNew);
				btnNew.addActionListener(TestFindComponentRef.this);

				buttons = Arrays.copyOf(buttons, buttons.length + 1);
				buttons[buttons.length - 1] = btnNew;

				pack();
			}
		});
	}

	private void penelLayout() {
		for (int i = 0; i < buttons.length; i++) {
			pnl.add(buttons[i]);
		}
		add(pnl);

		pnlNorth.add(btnAdd);
		add(pnlNorth, "North");
	}

	private void initCompnents() {
		pnl = new JPanel();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = createSquareButton("");
		}
		pnlNorth = new JPanel();
		btnAdd = new JButton("추가");
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
		int left = index - 1;
		if (left >= 0) {
			buttons[left].setText("좌");
		}
		int right = index + 1;
		if (right < buttons.length) {
			buttons[right].setText("우");
		}

	}

	public static void main(String[] args) {
		new TestFindComponentRef().setVisible(true);
	}

}
