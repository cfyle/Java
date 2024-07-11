import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class TestItemEvents extends JFrame {
	public TestItemEvents() {
		AbstractButton btn = new JButton();
		AbstractButton chk = new JCheckBox();
		AbstractButton rdo = new JRadioButton();
		AbstractButton toggle = new JToggleButton();
		
		toggle.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("토글 버튼이 선택 됨");
				} else {
					System.out.println("토글 버튼의 선택이 취소됨");
				}
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(toggle);
		
		add(toggle);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestItemEvents().setVisible(true);
	}

}
