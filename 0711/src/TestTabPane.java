import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class TestTabPane extends JFrame {
	public TestTabPane() {
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.add("첫번째 텝", new JLabel("표시될 컴포넌트 1"));
		tabPane.add("두번째 텝", new JLabel("표시될 컴포넌트 2"));
		tabPane.add("세번째 텝", new JLabel("표시될 컴포넌트 3"));
		
		add(tabPane);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestTabPane().setVisible(true);
	}
}
