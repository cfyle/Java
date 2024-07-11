import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TestBorder extends JFrame {
	public TestBorder() {
		super("테두리");
		
		JLabel lbl = new JLabel("레이블");
		lbl.setBorder(new LineBorder(Color.BLACK,1));
		JPanel pnl = new JPanel();
		pnl.add(lbl);
		
		JLabel lblAnother = new JLabel("다른테이블");
		lblAnother.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.ORANGE));
		pnl.add(lblAnother);
		
		add(pnl);
		
		JPanel pnlEast = new JPanel();
		pnlEast.setPreferredSize(new Dimension(300, 0));
		pnlEast.setBorder(BorderFactory.createTitledBorder("제목: 동쪽 패널"));
		add(pnlEast, "East");
		
		JPanel pnlWest = new JPanel();
		pnlEast.setPreferredSize(new Dimension(0, 300));
		pnlEast.setBorder(BorderFactory.createTitledBorder("제목: 서쪽 패널"));
		add(pnlWest, "West");
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TestBorder().setVisible(true);
	}
}
