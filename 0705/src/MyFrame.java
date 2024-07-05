import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	public MyFrame() {
		super("내 윈도우");
		
		JLabel lbl = new JLabel("텍스트");
		
		add(lbl);
		
		setSize(700, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.setVisible(true);
	}
}
