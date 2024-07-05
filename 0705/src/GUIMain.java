import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Window");
		
		JLabel lblText = new JLabel("텍스트를 표현할 수 있는 컴포넌트");
		frame.add(lblText);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
