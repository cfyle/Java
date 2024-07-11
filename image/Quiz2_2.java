package image;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Quiz2_2 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */

	public Quiz2_2() {
		setPreferredSize(new Dimension(500, 500));
		setLayout(null);

		JButton btnNewButton = new JButton("변환");
		btnNewButton.setBounds(159, 132, 97, 23);

		add(btnNewButton);

		JLabel lblNewLabel = new JLabel("마일을 킬로미터로 변환");
		lblNewLabel.setBounds(12, 10, 137, 15);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(270, 37, 72, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("거리를 마일 단위로 입력하시오");
		lblNewLabel_1.setBounds(12, 84, 244, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_3.setBounds(80, 218, 295, 23);
		add(lblNewLabel_3);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				lblNewLabel_3.setText(textField.getText() + "마일은" + (a * 1.6) + "킬로미터 입니다");

			}
		});

	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new Quiz2_2());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}