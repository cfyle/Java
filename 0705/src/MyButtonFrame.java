import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("이벤트 발생을 확인합니다");
	}

}

public class MyButtonFrame extends JFrame {
	public MyButtonFrame() {
		super("버튼을 테스트합니다");

		JPanel pnl = new JPanel();
		JButton btn = new JButton("눌러봐");
		JButton btnAnother = new JButton("다른 버튼");

		btn.addActionListener(new MyListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 발생을 확인합니다");
			}
		});

		btnAnother.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("다른 버튼의 이벤트를 확인합니다");
			}
		});

		pnl.add(btn);
		pnl.add(btnAnother);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyButtonFrame().setVisible(true);
	}
}
