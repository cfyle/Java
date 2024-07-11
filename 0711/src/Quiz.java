import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Quiz extends JFrame {

	public Quiz() {

		JPanel pnlWest = new JPanel();
		JButton btnMail = new JButton("메일");
		JButton btnNews = new JButton("뉴스");
		JButton btnLuck = new JButton("운세");

		JPanel pnlEast = new JPanel();
		JButton btnLogin = new JButton("로그인");
		JButton btnMembership = new JButton("회원가입");

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLogin.setToolTipText("로그인 하는 창입니다");
				JPanel pnlLogin = new JPanel();
				JLabel lblId = new JLabel("아이디");
				JTextField tfID = new JTextField(10);
				JLabel lblPw = new JLabel("비밀번호");
				JPasswordField tfPw = new JPasswordField(10);
				JButton btnLogin = new JButton("로그인");

				btnLogin.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String id = tfID.getText();
						String password = tfPw.getText();
						if (id.equals("jy") && password.equals("123")) {
							JOptionPane.showMessageDialog(Quiz.this, "로그인 하셨습니다");
						} else {
							JOptionPane.showMessageDialog(Quiz.this, "아이디 및 비밀번호를 확인해주세요", "로그인 오류",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				});

				pnlLogin.add(lblId);
				pnlLogin.add(tfID);
				pnlLogin.add(lblPw);
				pnlLogin.add(tfPw);
				pnlLogin.add(btnLogin);

				add(pnlLogin);

				setSize(500, 500);
				setDefaultCloseOperation(EXIT_ON_CLOSE);

			}

		});

		btnMembership.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnMembership.setToolTipText("회원가입 하는 창입니다");
				JPanel pnlLogin = new JPanel();
				JLabel lblId = new JLabel("아이디");
				JTextField tfID = new JTextField(10);
				JLabel lblPw = new JLabel("비밀번호");
				JPasswordField tfPw = new JPasswordField(10);
				JLabel blbPwIdenfy = new JLabel("비밀번호 확인");
				JPasswordField tfPwIdenfy = new JPasswordField(10);
				JLabel lblPhone = new JLabel("전화번호");
				JTextField tfPhone = new JTextField(10);
				JLabel lblAddress = new JLabel("주소");
				JTextField tfAddress = new JTextField(20);
			
				JButton btnMembership = new JButton("회원가입");
				JButton btnMembershipCancel = new JButton("취소");
				
				btnMembership.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (tfPw.getText() != tfPwIdenfy.getText()) {
							JOptionPane.showMessageDialog(Quiz.this, "비밀번호가 같지 않습니다", "비밀번호 확인 오류",
									JOptionPane.ERROR_MESSAGE);
							tfPw.setText("");
							tfPwIdenfy.setText("");
						}
						
					
						
						
					}
				});
				
				pnlLogin.add(lblId);
				pnlLogin.add(tfID);
				pnlLogin.add(lblPw);
				pnlLogin.add(tfPw);
				pnlLogin.add(blbPwIdenfy);
				pnlLogin.add(tfPwIdenfy);
				pnlLogin.add(lblPhone);
				pnlLogin.add(tfPhone);
				pnlLogin.add(lblAddress);
				pnlLogin.add(tfAddress);
				
				pnlLogin.add(btnMembership);
				pnlLogin.add(btnMembershipCancel);

				add(pnlLogin);

				setSize(500, 500);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			}
		});


		pnlWest.add(btnMail);
		pnlWest.add(btnNews);
		pnlWest.add(btnLuck);
		pnlEast.add(btnLogin);
		pnlEast.add(btnMembership);

		add(pnlWest);
		add(pnlEast);


		add(pnlWest, "West");
		add(pnlEast, "East");

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz().setVisible(true);
	}
}
