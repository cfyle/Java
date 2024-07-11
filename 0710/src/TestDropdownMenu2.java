import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDropdownMenu2 extends JFrame {
	public TestDropdownMenu2() {
		Integer[] items = { 100, 200, 300 };
		
		JComboBox<Integer> combo = new JComboBox<Integer>(items);
	
		JPanel pnl = new JPanel();
		pnl.add(combo);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestDropdownMenu2().setVisible(true);
	}
}
