import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCheckBox extends JFrame {
	public TestCheckBox() {
		super("체크박스");
		
		JCheckBox chk1 = new JCheckBox("첫번째 선택지");
		JCheckBox chk2 = new JCheckBox("두번째 선택지");
		JCheckBox chk3 = new JCheckBox("세번째 선택지");
		
		chk1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("아이템 이벤트 발생 확인");
			}
		});
		
		chk1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 확인");
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestCheckBox().setVisible(true);
	}
}
