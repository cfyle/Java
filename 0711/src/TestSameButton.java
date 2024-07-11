import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestSameButton extends JFrame {
	public TestSameButton() {
		JButton btn = new JButton("버튼1");
		JPanel pnl = new JPanel();
		
		createCustomButton(btn);
		
		pnl.add(btn);
		pnl.add(new MyButton("버튼2"));
		pnl.add(new MyButton("버튼3"));
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void createCustomButton(JButton btn) {
		btn.setPreferredSize(new Dimension(100, 50));
		btn.setBackground(Color.WHITE);
		btn.setForeground(Color.BLACK);
		btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		btn.setToolTipText("버튼을 누르면 동작");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 구현");
			}
		});
	}
	public static void main(String[] args) {
		new TestSameButton().setVisible(true);
	}
}
