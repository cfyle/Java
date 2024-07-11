import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestRadio extends JFrame{
	public TestRadio() {
		super("라디오 버튼");
		
		JRadioButton rdoBoneless = new JRadioButton("순살");
		rdoBoneless.setSelected(true);
		JRadioButton rdoBone = new JRadioButton("뼈");
		
		rdoBoneless.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("사용자가 순살 버튼을 눌렀음");
			}
		});
		
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("상태 바뀜");
			}
		};
		
		rdoBone.addItemListener(itemListener);
		rdoBoneless.addItemListener(itemListener);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdoBoneless);
		btnGroup.add(rdoBone);
		
		JPanel pnl = new JPanel();
		pnl.setBorder(BorderFactory.createTitledBorder("뼈/순살 선택"));
		pnl.add(rdoBoneless);
		pnl.add(rdoBone);
		
		add(pnl);
		
		JRadioButton rdoFried = new JRadioButton("후라이드");
		rdoFried.setSelected(true);
		JRadioButton rdoSeasoned = new JRadioButton("양념");
		
		ButtonGroup btnGroup2 = new ButtonGroup();
		btnGroup2.add(rdoFried);
		btnGroup2.add(rdoSeasoned);
		
		JPanel pnlEast = new JPanel();
		pnlEast.add(rdoFried);
		pnlEast.add(rdoSeasoned);
		
		add(pnlEast, "East");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestRadio().setVisible(true);
	}
}
