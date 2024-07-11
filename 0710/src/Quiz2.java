import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Quiz2 extends JFrame {
	public Quiz2() {
		JProgressBar bar = new JProgressBar();
		bar.setStringPainted(true);
		JSlider slider = new JSlider();
		bar.setBounds(128, 130, 222, 25);
		JPanel pnl = new JPanel();

		slider.setMajorTickSpacing(100);
		slider.setMinorTickSpacing(5);

		slider.setPaintLabels(true);
		slider.setPaintTicks(true);

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (slider.getValueIsAdjusting()) {
					bar.setValue(slider.getValue());
				} else if (!slider.getValueIsAdjusting()) {
					bar.setValue(slider.getValue());
				}
			}
		});

		pnl.add(bar);
		pnl.add(slider, "South");

		getContentPane().add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz2().setVisible(true);
	}
}
