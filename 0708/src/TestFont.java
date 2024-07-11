import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFontHolder {
	private Font myFont;
	public MyFontHolder() {
		try {
			myFont = Font.createFont(Font.TRUETYPE_FONT, TestFont.class.getResourceAsStream("/font/Jua-Regular.ttf"));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Font getDeriveFont(int style, float size) {
		return myFont.deriveFont(style, size);
	}
}

public class TestFont extends JFrame {
	private MyFontHolder myFontHolder;

	public TestFont() {
		super("텍스트의 폰트 설정");
		myFontHolder = new MyFontHolder();
 

		JLabel lbl = new JLabel("로렘 입숨");
		lbl.setFont(myFontHolder.getDeriveFont(Font.CENTER_BASELINE, 30));
		JPanel pnl = new JPanel();
		
		JLabel lblAnother = new JLabel("다른 레이블");
		lbl.setFont(myFontHolder.getDeriveFont(Font.BOLD, 12));

		pnl.add(lbl);
		pnl.add(lblAnother);
		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestFont().setVisible(true);
	}
}
