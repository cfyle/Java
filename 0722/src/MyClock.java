import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyClock extends JFrame {
	public MyClock() {
		super("시계");

		LocalTime time = LocalTime.now();
		JLabel lbl = new JLabel(time.toString());

		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lbl);

		add(pnlCenter);
		
		//                      (인트 값 , 액션이벤트)
		Timer timer = new Timer(1000 / 60, new ActionListener() { // 1000 은 1초
			@Override
			public void actionPerformed(ActionEvent e) {
				LocalTime update = LocalTime.now();
				lbl.setText(update.toString());
			}
		});
		
		timer.start();

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 무한 루프를 사용하게되면  ~ 창이 돌아가지 않는 경우가 많다
//		while (true) {
//			LocalTime update= LocalTime.now();
//			lbl.setText(update.toString());
//		}
	}

	public static void main(String[] args) {
		new MyClock().setVisible(true);
	}
}
