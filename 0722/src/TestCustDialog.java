import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFormData {
	private String firstInput;
	private String secondInput;
	private boolean isConfirm;
	
	public MyFormData(String firstInput, String secondInput) {
		super();
		this.firstInput = firstInput;
		this.secondInput = secondInput;
	}
	public boolean isConfirm() {
		return isConfirm;
	}
	public void setConfirm(boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	public String getFirstInput() {
		return firstInput;
	}
	public void setFirstInput(String firstInput) {
		this.firstInput = firstInput;
	}
	public String getSecondInput() {
		return secondInput;
	}
	public void setSecondInput(String secondInput) {
		this.secondInput = secondInput;
	}
	@Override
	public String toString() {
		return "MyFormData [firstInput=" + firstInput + ", secondInput=" + secondInput + "]";
	}
}

class MyDialog extends JDialog {
	private MyFormData data;
	private JTextField tf1;
	private JTextField tf2;
	
	public MyDialog(MyFrame frame) {
		setTitle("대화 상자");
		
		data = new MyFormData(null, null);
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		
		JPanel pnl = new JPanel();
		pnl.add(tf1);
		pnl.add(tf2);
		add(pnl);
		
		JPanel pnlNorth = new JPanel();
		JButton btnConfirm = new JButton("입력 완료");
		JButton btnCancel = new JButton("취소");
		pnlNorth.add(btnConfirm);
		pnlNorth.add(btnCancel);
		add(pnlNorth, "North");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConfirm) {
					data.setConfirm(true);
				}
				dispose();
			}
		};
		btnConfirm.addActionListener(listener);
		btnCancel.addActionListener(listener);
		
		setModal(true);
		
		setSize(500, 500);
//		setLocationRelativeTo(frame);
		int x = frame.getX();
		int y = frame.getY();
		int width2 = frame.getWidth();
		
		setLocation(x + width2, y);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public MyFormData showDialog() {
		setVisible(true);
		
		data.setFirstInput(tf1.getText());
		data.setSecondInput(tf2.getText());
		
		return data;
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		super("메인 창");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnOpenDialog = new JButton("다이얼로그 열기");
		add(btnOpenDialog);
		
		btnOpenDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog dialog = new MyDialog(MyFrame.this);
				MyFormData formData = dialog.showDialog();
				
				if (formData.isConfirm()) {
					System.out.println("입력이 완료되었으며, 입력값은 ");
					System.out.println(formData.getFirstInput());
					System.out.println(formData.getSecondInput());
				} else {
					System.out.println("사용자가 취소버튼을 누름");
				}
			}
		});
	}
}

public class TestCustDialog {
	public static void main(String[] args) {
		new MyFrame().setVisible(true);
	}
}
