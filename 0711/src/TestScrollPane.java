import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestScrollPane extends JFrame {
	public TestScrollPane() {
		JTextArea ta = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ta);
		
		add(scrollPane);
		
		setSize(500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestScrollPane().setVisible(true);
	}
}
