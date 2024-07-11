import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyButton extends JButton {
	public MyButton(String text) {
		super(text);
		setPreferredSize(new Dimension(100, 50));
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		setToolTipText("버튼을 누르면 동작");
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 구현");
			}
		});
	}
}
