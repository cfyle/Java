import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestEventSource extends JFrame implements ActionListener {
	private JPanel pnl;
	private JButton btnLeft;
	private JButton btnCenter;
	private JButton btnRight;

	public TestEventSource() {
		super("이벤트 소스 확인");

		initCompnents();

		penelLayout();
		
		addButtonListener();

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void addButtonListener() {
		btnLeft.addActionListener(this);
		btnCenter.addActionListener(this);
		btnRight.addActionListener(this);
	}

	private void penelLayout() {
		pnl.add(btnLeft);
		pnl.add(btnCenter);
		pnl.add(btnRight);
	}

	private void initCompnents() {
		pnl = new JPanel();
		btnLeft = createSquareButton("왼쪽 버튼");
		btnCenter = createSquareButton("가운데 버튼");
		btnRight = createSquareButton("오른쪽 버튼");
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
		if (source instanceof JButton) {
		JButton btn = (JButton) source;
		btn.setText("변경");
		}
	}
	
	public static void main(String[] args) {
		new TestEventSource().setVisible(true);
	}

}
