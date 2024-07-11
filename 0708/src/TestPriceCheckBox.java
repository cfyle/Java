import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestPriceCheckBox extends JFrame {
	public TestPriceCheckBox() {
		super("체크박스");
		
		JCheckBox chk1 = new JCheckBox("단무지 추가 (500원)");
		JCheckBox chk2 = new JCheckBox("피클 추가 (700원)");
		JCheckBox chk3 = new JCheckBox("군만두 추가 (3000원)");
		JButton btnConfirm = new JButton("추가 요금 계산");
		
		btnConfirm.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int price = 0;
				price += chk1.isSelected() ? 500 : 0;
				price += chk2.isSelected() ? 700 : 0;
				price += chk3.isSelected() ? 3000 : 0;
				
				JOptionPane.showMessageDialog(TestPriceCheckBox.this , "추가요금은 " + price + "입니다");
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		pnl.add(btnConfirm);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestPriceCheckBox().setVisible(true);
	}
}
