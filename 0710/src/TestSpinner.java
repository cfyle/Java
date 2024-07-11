import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TestSpinner extends JFrame {
	public TestSpinner() {
		SpinnerModel numberModel = new SpinnerNumberModel(50, 0, 100, 1); // 시작값 , 최소값 , 최대값, 증가량
		JSpinner spinner = new JSpinner(numberModel);
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinner.getValue());
			}
		});
		
		spinner.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int value = e.getWheelRotation();
				int origin = (Integer) spinner.getValue();
				
				SpinnerNumberModel model = (SpinnerNumberModel) numberModel;
				int max = (Integer) model.getMaximum();
				int min = (Integer) model.getMinimum();
				
				int result = origin - value;
				if (result >= min && result <= max) {
					spinner.setValue(result);
				}
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(spinner);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new TestSpinner().setVisible(true);
	}

}
