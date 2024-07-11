import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Quiz extends JFrame {
	private JTextField inputPie1;
	private JTextField inputPie2;
	private JTextField inputPie3;

	public Quiz() {

		int price = 0;

		setSize(new Dimension(700, 500));
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("돈미새 피자가게");
		lblTitle.setBounds(0, 0, 684, 44);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTitle);

		JCheckBox side1 = new JCheckBox("오븐 스파게티(6,000원)");
		side1.setBounds(391, 79, 162, 23);
		getContentPane().add(side1);
		price += side1.isSelected() ? 6000 : -6000;

		JCheckBox side2 = new JCheckBox("윙&봉(5,000원)");
		side2.setBounds(391, 135, 162, 23);
		getContentPane().add(side2);
		price += side2.isSelected() ? 5000 : -5000;

		JCheckBox side3 = new JCheckBox("갈릭 디핑소스(500원)");
		side3.setBounds(391, 185, 162, 23);
		getContentPane().add(side3);
		price += side3.isSelected() ? 5000 : -500;

		JPanel pnl = new JPanel();

		getContentPane().add(pnl);

		JRadioButton pizza1 = new JRadioButton("불고기 피자(20,000원)");
		pizza1.setBounds(43, 79, 162, 23);
		getContentPane().add(pizza1);

		JRadioButton pizza2 = new JRadioButton("고구마 피자(22,000원)");
		pizza2.setBounds(43, 135, 162, 23);
		getContentPane().add(pizza2);

		JRadioButton pizza3 = new JRadioButton("시카고 피자(30,000원)");
		pizza3.setBounds(43, 185, 162, 23);
		getContentPane().add(pizza3);

//		ButtonGroup pizzaGroup = new ButtonGroup();
//		pizzaGroup.add(pizza1);
//		pizzaGroup.add(pizza2);
//		pizzaGroup.add(pizza3);

		JButton btnCancel = new JButton("전체 취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				side1.setSelected(false);
				side2.setSelected(false);
				side3.setSelected(false);
			}
		});
		btnCancel.setBounds(349, 248, 97, 23);
		getContentPane().add(btnCancel);

		JButton btnAllChoice = new JButton("전체 선택");
		btnAllChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				side1.setSelected(true);
				side2.setSelected(true);
				side3.setSelected(true);
			}
		});
		btnAllChoice.setBounds(488, 248, 97, 23);
		getContentPane().add(btnAllChoice);

		inputPie1 = new JTextField();
		inputPie1.setBounds(213, 80, 22, 21);
		getContentPane().add(inputPie1);
		inputPie1.setColumns(2);

		inputPie2 = new JTextField();
		inputPie2.setBounds(213, 136, 22, 21);
		getContentPane().add(inputPie2);
		inputPie2.setColumns(2);

		inputPie3 = new JTextField();
		inputPie3.setBounds(213, 186, 22, 21);
		getContentPane().add(inputPie3);
		inputPie3.setColumns(2);

		JButton btnOrder = new JButton("주문");
		btnOrder.setBounds(286, 313, 97, 44);
		getContentPane().add(btnOrder);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblResult = new JLabel();
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(198, 381, 274, 44);
		getContentPane().add(lblResult);
		btnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum1 = Integer.parseInt(inputPie1.getText());
				int sum2 = Integer.parseInt(inputPie1.getText());
				int sum3 = Integer.parseInt(inputPie1.getText());
				
				lblResult.setText((sum1 * 20000) + (sum2 * 22000) + (sum3 * 30000) + "원");
				
			}
		});

	}

	public static void main(String[] args) {
		new Quiz().setVisible(true);
	}
}
