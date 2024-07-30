package 지금이순간;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame {
	public Menu() {

		super("로또 프로그램");
		JPanel pnl = new JPanel();
		JButton btnBuy = new JButton("로또사러가기");
		JButton btnMyNum = new JButton("내 번호 확인");
		JButton btnCheck = new JButton("부자되러가기");

		// 로또 배경 이미지 추가
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(Menu.class.getResource("로또이미지.jpg")));
		pnl.add(lblBackground);

		pnl.add(btnBuy);
		pnl.add(btnMyNum);
		pnl.add(btnCheck);

		btnBuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로또 사러가기 패널로 이동
				
			}
		});

		btnMyNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내 번호 확인 패널로 이동
				
			}
		});

		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 부자되러가기 패널로 이동
			}
		});

		setSize(1100, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}