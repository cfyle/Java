import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class t1 extends JFrame {
	private JPanel contentPane;

	public static void main(String[] args) {
		new t1().setVisible(true);
	}

	public t1() {
		BuyLotto lt = new BuyLotto();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		getContentPane().add(lt);
	}
}
