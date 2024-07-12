import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFonts {
	private static Font font = new Font("돋움체", Font.PLAIN, 14);
	
	public static Font getDotumFont() {
		return font;
	}
}

public class TestFrame extends JFrame {
	private MyPanelFactory factory;	
	private int count;
	private JLabel lblCount;

	private void setLabelCount() {
		lblCount.setText(String.valueOf(count));
	}

	public TestFrame() {
		factory = new MyPanelFactory();

		lblCount = new JLabel();
		lblCount.setFont(MyFonts.getDotumFont());
		setLabelCount();

		JPanel pnlCenter = factory.emptyWhiteJpanel();
		JButton btnPlus = new JButton("증가");
		JButton btnMinus = new JButton("감소");

		TestFrameButtonListener listener = new TestFrameButtonListener();
		btnPlus.addActionListener(listener);
		btnMinus.addActionListener(listener);

		pnlCenter.add(btnPlus);
		pnlCenter.add(lblCount);
		pnlCenter.add(btnMinus);

		add(pnlCenter);

//		add(factory.emptyWhiteJpanel());
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class TestFrameButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("증가")) {
				count++;
				setLabelCount();
			} else if (actionCommand.equals("감소")) {
				count--;
				setLabelCount();
			}
		}
	}

	private class MyPanelFactory {
		public JPanel emptyWhiteJpanel() {
			JPanel pnl = new JPanel();
			pnl.setPreferredSize(new Dimension(500, 500));
			pnl.setBackground(Color.white);
			return pnl;
		}
	}

	public static void main(String[] args) {
		new TestFrame().setVisible(true);
	}

}
