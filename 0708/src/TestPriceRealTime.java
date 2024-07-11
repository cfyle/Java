import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestPriceRealTime extends JFrame {
	int price = 0;

	public TestPriceRealTime() {
		super("체크박스");

		JCheckBox chk1 = new JCheckBox("단무지 추가 (500원)");
		JCheckBox chk2 = new JCheckBox("피클 추가 (700원)");
		JCheckBox chk3 = new JCheckBox("군만두 추가 (3000원)");

		JLabel lbl = new JLabel();

		chk1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price += chk1.isSelected() ? 500 : 0;
			}
		});

		chk2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price += chk2.isSelected() ? 700 : 0;
			}
		});

		chk3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price += chk3.isSelected() ? 3000 : 0;
			}
		});

		JPanel pnl = new JPanel();
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		pnl.add(lbl);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestPriceRealTime().setVisible(true);
	}
}
