import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDropdownMenu extends JFrame {
	public TestDropdownMenu() {
		String[] items = { "첫번째 옵션", "두번째 옵션", "세번째 옵션" };
		
		JComboBox<String> combo = new JComboBox<>(items); // 왼쪽 <> 에 적으면 오른쪽에 생략 가능
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selected = combo.getSelectedIndex();
				String str = items[selected];
				System.out.println("선택 문자열 : " + str);
				
				Object selectedObj = combo.getSelectedItem();
				System.out.println(selectedObj.toString());
			}
		});
		
		combo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("아이템 이벤트 확인");
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(combo);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestDropdownMenu().setVisible(true);
	}
}
