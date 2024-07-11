import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestMouseEvent extends JFrame {
	public TestMouseEvent() {
		super("마우스 이벤트");
		
		JPanel pnl = new JPanel();
		pnl.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) { //마우스 클릭을 놓을때
				System.out.println("마우스 버튼을 놓을 때");
			}
			
			@Override
			public void mousePressed(MouseEvent e) { // 마우스를 클릭할때
				System.out.println("x 좌표 : " + e.getX());
				System.out.println("y 좌표 : " + e.getY());
				System.out.println("이벤트 발생 버튼: " + e.getButton());
				
				boolean leftMouseButton = SwingUtilities.isLeftMouseButton(e);
				System.out.println("왼쪽 버튼인가요?" + leftMouseButton);
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) { // 패널 영역 밖으로 마우스가 나갈 때
				System.out.println("패널 영역 밖으로 마우스가 나갈 때");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) { // 패널 영역 안에 마우스가 들어올 때
				System.out.println("패널 영역 안에 마우스가 들어올 때");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) { // 클릭할 때
				int clickCount = e.getClickCount();
				if (clickCount == 2) {
					System.out.println("더블 클릭 확인");
				}
			}
		});
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new TestMouseEvent().setVisible(true);
	}

}
