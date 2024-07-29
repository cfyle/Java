import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class BuyLotto extends JPanel {
	public static final int MAX_CHECKED = 6; // 최대 체크 가능한 체크박스 개수
	private List<JCheckBox> allCheckBoxes = new ArrayList<>(); // 모든 체크박스를 담는 리스트
	private Map<JPanel, Integer> panelCheckedCount = new HashMap<>(); // 각 패널의 체크된 개수 관리
	private Map<JPanel, Set<Integer>> panelCheckedNumbers = new HashMap<>(); // 각 패널과 체크된 번호를 매핑

	public BuyLotto() {
		setSize(1100, 600);
		setLayout(new BorderLayout(0, 0));

		initializeNorthPanel();
		initializeCenterPanel();
		initializeSouthPanel();
	}

	private void initializeNorthPanel() {
		JPanel pnlNorth = new JPanel();
		add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));

		JLabel lblNorth = new JLabel("로또 구매");
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblNorth.setFont(new Font("휴먼모음T", Font.PLAIN, 16));
		pnlNorth.add(lblNorth);

		JButton btnBuyLotto = new JButton("구매 확정");
		pnlNorth.add(btnBuyLotto, BorderLayout.WEST);

		JButton btnMain = new JButton("메인으로");
		pnlNorth.add(btnMain, BorderLayout.EAST);

		btnBuyLotto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder result = new StringBuilder("각 패널에서 선택된 번호:\n");
				File file = new File("d:");
				File creatFolder = new File(file,"Lotto");
				creatFolder.mkdir();
				
				File customerFile = new File("d:\\Lotto\\lotto.txt");
				
				FileWriter writer = null;
				
				// 각 패널의 체크된 번호를 가져와서 결과 문자열에 추가
				for (Map.Entry<JPanel, Set<Integer>> entry : panelCheckedNumbers.entrySet()) {
					JPanel panel = entry.getKey();
					Set<Integer> checkedNumbers = entry.getValue();

					// 패널의 제목에서 패널 번호를 추출
					Border border = panel.getBorder();
					if (border instanceof TitledBorder) {
						TitledBorder titledBorder = (TitledBorder) border;
						String panelTitle = titledBorder.getTitle();
						int panelNumber;
						try {
							// 패널 제목에서 번호 추출
							panelNumber = Integer.parseInt(panelTitle.split(" ")[1]);
						} catch (NumberFormatException ex) {
							// 번호 추출에 실패하면 패널 번호를 -1로 설정
							panelNumber = -1;
						}

						// 선택된 번호들을 결과 문자열에 추가
						result.append("구매 ").append(panelNumber).append(": ");
						result.append(checkedNumbers.toString()).append("\n");
					}
				}
				try {
					writer = new FileWriter(customerFile);
					
					writer.write(result.toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (writer != null) {
						try {
							writer.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

	}

	private void initializeCenterPanel() {
		JPanel pnlCenter = new JPanel(new GridLayout(0, 5)); // 5개의 패널을 가로로 배치
		add(pnlCenter, BorderLayout.CENTER);

		// 5개의 패널을 생성하고 중앙 패널에 추가
		JPanel pnlBuy5 = createBuyPanel(5);
		JPanel pnlBuy4 = createBuyPanel(4);
		JPanel pnlBuy3 = createBuyPanel(3);
		JPanel pnlBuy2 = createBuyPanel(2);
		JPanel pnlBuy1 = createBuyPanel(1);

		pnlCenter.add(pnlBuy1);
		pnlCenter.add(pnlBuy2);
		pnlCenter.add(pnlBuy3);
		pnlCenter.add(pnlBuy4);
		pnlCenter.add(pnlBuy5);
	}

	private JPanel createBuyPanel(int panelNumber) {
		JPanel pnlBuy = new JPanel(new BorderLayout(0, 0));

		Border border = BorderFactory.createTitledBorder("구매 " + panelNumber);
		pnlBuy.setBorder(border);

		JPanel pnlBuyChk = new JPanel(new GridLayout(0, 5, 0, 0));
		pnlBuy.add(pnlBuyChk, BorderLayout.CENTER);

		JPanel pnlNorth = new JPanel();
		pnlBuy.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnLotto = new JButton("로또 구매");
		pnlNorth.add(btnLotto);

		JLabel lblCheck = new JLabel();
		lblCheck.setHorizontalAlignment(SwingConstants.CENTER);
		pnlNorth.add(lblCheck);

		JButton btnCancel = new JButton("구매 취소");
		btnCancel.setEnabled(false); // 초기에는 비활성화
		pnlNorth.add(btnCancel);

		for (int i = 1; i < 46; i++) {
			JCheckBox check = new JCheckBox(String.valueOf(i));
			check.addActionListener(new CheckBoxActionListener(pnlBuy, lblCheck));
			pnlBuyChk.add(check);
			allCheckBoxes.add(check);
		}

		JPanel pnlSouth = new JPanel(new GridLayout(0, 2, 0, 0));
		pnlBuy.add(pnlSouth, BorderLayout.SOUTH);

		JButton btnHand = new JButton("수동");
		btnHand.setEnabled(false);
		pnlSouth.add(btnHand);

		JButton btnAuto = new JButton("자동");
		btnAuto.setEnabled(false);
		pnlSouth.add(btnAuto);

		// 로또 구매 버튼 액션 리스너
		btnLotto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				enableComponents(pnlBuyChk, true); // 체크박스 부분 활성화
				btnAuto.setEnabled(true);
				btnCancel.setEnabled(true); // 구매 취소 버튼 활성화
				btnLotto.setEnabled(false); // 로또 구매 버튼 비활성화
			}
		});

		// 구매 취소 버튼 액션 리스너
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 체크박스 선택 해제
				for (Component comp : pnlBuyChk.getComponents()) {
					if (comp instanceof JCheckBox) {
						((JCheckBox) comp).setSelected(false);
					}
				}
				// 로또 구매 버튼 활성화
				btnLotto.setEnabled(true);
				// 버튼 상태 및 패널 비활성화
				enableComponents(pnlBuyChk, false); // 체크박스 비활성화
				btnAuto.setEnabled(false); // 자동 버튼 비활성화
				btnHand.setEnabled(false); // 수동 버튼 비활성화
				btnCancel.setEnabled(false); // 구매 취소 버튼 비활성화
				panelCheckedCount.put(pnlBuy, 0); // 체크된 개수 초기화
				panelCheckedNumbers.put(pnlBuy, new TreeSet<>()); // 체크된 번호 초기화
			}
		});

		// 자동 버튼 액션 리스너 설정
		btnAuto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				enableComponents(pnlBuyChk, false); // 체크박스 비활성화
				btnAuto.setEnabled(false); // 자동 버튼 비활성화
				btnHand.setEnabled(true); // 수동 버튼 활성화
			}
		});

		// 수동 버튼 액션 리스너 설정
		btnHand.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				enableComponents(pnlBuyChk, true); // 체크박스 활성화
				btnAuto.setEnabled(true); // 자동 버튼 활성화
				btnHand.setEnabled(false); // 수동 버튼 비활성화
			}
		});

		panelCheckedCount.put(pnlBuy, 0);
		panelCheckedNumbers.put(pnlBuy, new TreeSet<>()); // 체크된 번호 초기화

		// 초기 상태: 체크박스 및 버튼 비활성화
		enableComponents(pnlBuyChk, false);
		btnAuto.setEnabled(false);
		btnHand.setEnabled(false);

		return pnlBuy;
	}
	// 하단부 알림용
	private void initializeSouthPanel() {
		// If there are components needed in the south panel, initialize them here.
		JPanel pnlSouth = new JPanel();
		
		JLabel lblInfo = new JLabel("선택한 갯수가 구매, 취소 버튼 사이에 출력됩니다. ");
		
		pnlSouth.add(lblInfo);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	// 체크박스 상태 변경을 감지하고 체크 수를 제한하는 ActionListener
	private class CheckBoxActionListener implements ActionListener {
		private JPanel panel;
		private JLabel lbl = null;
		
		public CheckBoxActionListener(JPanel panel, JLabel lbl) {
			this.panel = panel;
			this.lbl = lbl;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JCheckBox source = (JCheckBox) e.getSource();

			// 현재 패널의 체크된 개수 및 체크된 번호 가져오기
			int checkedCount = panelCheckedCount.get(panel);
			Set<Integer> checkedNumbers = panelCheckedNumbers.get(panel);

			// 체크박스가 선택될 때와 해제될 때 체크박스 개수를 관리
			if (source.isSelected()) {
				if (checkedCount >= MAX_CHECKED) {
					source.setSelected(false);
					JOptionPane.showMessageDialog(BuyLotto.this, "로또 번호는 6개 초과 선택이 불가합니다.");
				} else {
					checkedNumbers.add(Integer.parseInt(source.getText()));
					panelCheckedCount.put(panel, checkedCount + 1);
					lbl.setText(String.valueOf(checkedCount + 1));
				}
			} else {
				checkedNumbers.remove(Integer.parseInt(source.getText()));
				panelCheckedCount.put(panel, checkedCount - 1);
				lbl.setText(String.valueOf(checkedCount + 1));
			}
		}
	}

	/**
	 * 지정된 패널 내의 모든 체크박스와 버튼을 활성화하거나 비활성화합니다.
	 * 
	 * @param panel  대상 패널
	 * @param enable 활성화 여부
	 */
	private void enableComponents(JPanel panel, boolean enable) {
		for (Component comp : panel.getComponents()) {
			comp.setEnabled(enable);
		}
	}
}