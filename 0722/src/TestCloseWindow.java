import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestCloseWindow extends JFrame{
	public TestCloseWindow() {
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("창이 열렸을 때 실행");
			}
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("최소화 버튼을 눌렀을 때");
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("최소화 했다가 다시 돌아올때");
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("창이 비활성화 될 때");
			}
			@Override
			public void windowClosing(WindowEvent e) {
//				System.out.println("닫으려고 할 때");
				int input = JOptionPane.showOptionDialog(TestCloseWindow.this
						, "정말로 창을 닫으시겠습니까?"
						, "확인"
						, JOptionPane.YES_NO_OPTION
						, JOptionPane.QUESTION_MESSAGE
						, null
						, null
						, null);
				
				if (input == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("창이 닫혔을 때");
			}
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("창이 활성화 될 때");
			}
		});
	}
	public static void main(String[] args) {
		new TestCloseWindow().setVisible(true);
	}
}
