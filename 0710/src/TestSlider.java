import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TestSlider extends JFrame {
	public TestSlider() {
		JSlider slider = new JSlider(0, 100, 50); // (최소값, 최대값, 시작값)
		slider.setMajorTickSpacing(10); // 눈금 간격
		slider.setMinorTickSpacing(1); // 눈금 간격

		slider.setPaintTicks(true); // 눈금 여부
		slider.setPaintLabels(true);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (slider.getValueIsAdjusting()) {
					System.out.println(slider.getValue());
				}
			}
		});

		JPanel pnl = new JPanel();
		pnl.add(slider);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestSlider().setVisible(true);
	}

}
