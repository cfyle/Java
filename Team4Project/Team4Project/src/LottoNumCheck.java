import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LottoNumCheck extends JDialog {
	int sameCount = 0;

	public LottoNumCheck() {
		setTitle("반포자이 기다려라 내가 간다!");
		setSize(800, 800);
		getContentPane().setLayout(new GridLayout(6, 0, 0, 0));

		// 당첨번호 생성
		Set<Integer> sysNum = new TreeSet<>(); // 중복 제거용 set
		sysNum = randomNums(sysNum);
		int[] sysArr = new int[6]; // 배열에 담아 인덱스 사용가능하게하기
		Iterator<Integer> iterator = sysNum.iterator();
		while (iterator.hasNext()) {
			for (int i = 0; i < sysArr.length; i++) {
				sysArr[i] = iterator.next();
			}
		}
		int bonusNum = getBonusNum(sysNum);
		// 당첨번호 패널
		JPanel pnlSys = new JPanel();
		JLabel lblSysT = LabelFactory.updateLabel("당첨번호");
		JLabel lblSysN1 = LabelFactory.updateLabel(String.valueOf(sysArr[0]));
		lblSysN1.setIcon(colorIcon(sysArr[0]));

		JLabel lblSysN2 = LabelFactory.updateLabel(String.valueOf(sysArr[1]));
		lblSysN2.setIcon(colorIcon(sysArr[1]));

		JLabel lblSysN3 = LabelFactory.updateLabel(String.valueOf(sysArr[2]));
		lblSysN3.setIcon(colorIcon(sysArr[2]));

		JLabel lblSysN4 = LabelFactory.updateLabel(String.valueOf(sysArr[3]));
		lblSysN4.setIcon(colorIcon(sysArr[3]));

		JLabel lblSysN5 = LabelFactory.updateLabel(String.valueOf(sysArr[4]));
		lblSysN5.setIcon(colorIcon(sysArr[4]));

		JLabel lblSysN6 = LabelFactory.updateLabel(String.valueOf(sysArr[5]));
		lblSysN6.setIcon(colorIcon(sysArr[5]));

		JLabel lblSysTX = LabelFactory.updateLabel("+"); // 보너스 번호 받기

		JLabel lblSysBN = LabelFactory.updateLabel(String.valueOf(bonusNum)); // 보너스 번호 받기
		lblSysBN.setIcon(colorIcon(bonusNum));

		pnlSys.add(lblSysT);
		pnlSys.add(lblSysN1);
		pnlSys.add(lblSysN2);
		pnlSys.add(lblSysN3);
		pnlSys.add(lblSysN4);
		pnlSys.add(lblSysN5);
		pnlSys.add(lblSysN6);
		pnlSys.add(lblSysTX);
		pnlSys.add(lblSysBN);

		// 유저 번호 들고오기
		List<String> userNums = getUserNum();

		// 유저 번호 패널(게임)별로
		// 유저 패널1
		JPanel pnlUser1 = new JPanel();
		addPnl(sysArr, bonusNum, userNums, pnlUser1, 0);

		// 유저 패널2
		JPanel pnlUser2 = new JPanel();
		addPnl(sysArr, bonusNum, userNums, pnlUser2, 1);
		
		// 유저 패널3
		JPanel pnlUser3 = new JPanel();
		addPnl(sysArr, bonusNum, userNums, pnlUser3, 2);
		
		// 유저 패널4
		JPanel pnlUser4 = new JPanel();
		addPnl(sysArr, bonusNum, userNums, pnlUser4, 3);
		
		// 유저 패널5
		JPanel pnlUser5 = new JPanel();
		addPnl(sysArr, bonusNum, userNums, pnlUser5, 4);
		
		// 메인패널에 다 때려박기
		getContentPane().add(pnlSys);
		pnlSys.setLayout(new GridLayout(0, 9, 0, 0));
		getContentPane().add(pnlUser1);
		pnlUser1.setLayout(new GridLayout(1, 0, 0, 0));
		getContentPane().add(pnlUser2);
		pnlUser2.setLayout(new GridLayout(1, 0, 0, 0));
		getContentPane().add(pnlUser3);
		pnlUser3.setLayout(new GridLayout(1, 0, 0, 0));
		getContentPane().add(pnlUser4);
		pnlUser4.setLayout(new GridLayout(1, 0, 0, 0));
		getContentPane().add(pnlUser5);
		pnlUser5.setLayout(new GridLayout(1, 0, 0, 0));
	}

	// 패널 추가 메소드
	private void addPnl(int[] sysArr, int bonusNum, List<String> userNums, JPanel pnlUser, int pnlNum) {
		try {
			String userT = getAutoOrHandle(userNums, pnlNum); // 사용자의 게임 번수에 대한 자동 반자동 수동
			int[] userNumS = getUserNumString(userNums, pnlNum); // 사용자의 게임 번수에 대한 사용자 번호

			List<JLabel> lbls = new ArrayList<JLabel>();
			
			JLabel lblUserT = LabelFactory.updateLabel(userT);

			JLabel lblUser1 = LabelFactory.updateLabel(String.valueOf(userNumS[0]));
			lblUser1.setIcon(sameNum(sysArr, userNumS[0]));
			lbls.add(lblUser1);

			JLabel lblUser2 = LabelFactory.updateLabel(String.valueOf(userNumS[1]));
			lblUser2.setIcon(sameNum(sysArr, userNumS[1]));
			lbls.add(lblUser2);

			JLabel lblUser3 = LabelFactory.updateLabel(String.valueOf(userNumS[2]));
			lblUser3.setIcon(sameNum(sysArr, userNumS[2]));
			lbls.add(lblUser3);

			JLabel lblUser4 = LabelFactory.updateLabel(String.valueOf(userNumS[3]));
			lblUser4.setIcon(sameNum(sysArr, userNumS[3]));
			lbls.add(lblUser4);

			JLabel lblUser5 = LabelFactory.updateLabel(String.valueOf(userNumS[4]));
			lblUser5.setIcon(sameNum(sysArr, userNumS[4]));
			lbls.add(lblUser5);

			JLabel lblUser6 = LabelFactory.updateLabel(String.valueOf(userNumS[5]));
			lblUser6.setIcon(sameNum(sysArr, userNumS[5]));
			lbls.add(lblUser6);

			if(sameCount == 5) {
				for(JLabel lbl : lbls) {
					if(lbl.getText().equals(String.valueOf(bonusNum))) {
						lbl.setIcon(colorIcon(bonusNum));
					}
				}
			}
			
			JLabel lblUserPrize = LabelFactory.updateLabel(getGrade(bonusNum ,userNumS)); 

			pnlUser.add(lblUserT);
			pnlUser.add(lblUser1);
			pnlUser.add(lblUser2);
			pnlUser.add(lblUser3);
			pnlUser.add(lblUser4);
			pnlUser.add(lblUser5);
			pnlUser.add(lblUser6);
			pnlUser.add(lblUserPrize);
		} catch (IndexOutOfBoundsException e) {

		}
	}

	/**
	 * 패널 리스트와 원하는 인덱스 값을 입력받아 []안의 문자열을 배열화 하는 메소드
	 * 
	 * @exception IndexOutOfBoundsException
	 * @param userNums 유저의 패널 리스트
	 * @param pnlNum   유저의 패널 인덱스
	 * @return 숫자 배열
	 */
	private int[] getUserNumString(List<String> userNums, int pnlNum) {
		String userNum = userNums.get(pnlNum).substring(8, userNums.get(pnlNum).length() - 1);
		String[] userNumS = userNum.split(", ");
		int[] arr = new int[6];
		for (int i = 0; i < userNumS.length; i++) {
			arr[i] = Integer.parseInt(userNumS[i]);
		}
		return arr;
	}

	/**
	 * 게임 형태 반환 메소드
	 * 
	 * @exception IndexOutOfBoundsException
	 * @param userNums 유저의 패널 리스트
	 * @param pnlNum   유저의 패널 인덱스
	 * @return 자 동 or 반자동 or 수 동
	 */
	private String getAutoOrHandle(List<String> userNums, int pnlNum) {
		return userNums.get(pnlNum).substring(0, 3);
	}

	// 파일에서 유저 번호를 가져오는 메소드
	private List<String> getUserNum() {
		List<String> pnlUser = new ArrayList<String>();
		File file = new File("./");
		File lottoFolder = new File(file, "Lotto");
		File userFile = new File(lottoFolder, "lotto.txt");

		BufferedReader br = null;

		try {
			String str;
			br = new BufferedReader(new FileReader(userFile));
			br.readLine();
			while ((str = br.readLine()) != null) {
				pnlUser.add(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return pnlUser;
	}

	public Set<Integer> randomNums(Set<Integer> nums) {
		Random r = new Random();
		while (nums.size() < 6) {
			nums.add(r.nextInt(45) + 1); // 1부터 45까지의 숫자 중 랜덤 선택
		}
		return nums;
	}

	public int getBonusNum(Set<Integer> sysNum) {
		Random r = new Random();
		int bonusNum;
		// sysNum에 포함되지 않는 숫자를 찾을 때까지 반복
		do {
			bonusNum = r.nextInt(45) + 1; // 1부터 45까지의 숫자 중 랜덤 선택
		} while (sysNum.contains(bonusNum)); // sysNum에 포함되면 다시 선택
		return bonusNum;
	}

	// 라벨 팩토리
	private static class LabelFactory {
		// 라벨 생성 메소드
		public static JLabel updateLabel(String updateLabel) {
			JLabel newLabel = new JLabel(updateLabel);
			newLabel.setHorizontalAlignment(SwingConstants.CENTER);
			newLabel.setHorizontalTextPosition(JLabel.CENTER);
			newLabel.setVerticalTextPosition(JLabel.CENTER);
			newLabel.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
			return newLabel;
		}
	}

	// 로또 색깔
	private ImageIcon colorIcon(int num) {
		if (num <= 10)
			return new ImageIcon(LottoNumCheck.class.getResource("노랑.png"));
		else if (num <= 20)
			return new ImageIcon(LottoNumCheck.class.getResource("초록.png"));
		else if (num <= 30)
			return new ImageIcon(LottoNumCheck.class.getResource("파랑.png"));
		else if (num <= 40)
			return new ImageIcon(LottoNumCheck.class.getResource("핑크.png"));
		return new ImageIcon(LottoNumCheck.class.getResource("빨강.png"));
	}

	private ImageIcon blackIcon() {
		return new ImageIcon(LottoNumCheck.class.getResource("검정.png"));
	}

	// 당첨번호와 비교해서 컬러 또는 흑색 배출
	private ImageIcon sameNum(int[] sysArr, int userNum) {
		for (Integer i : sysArr) {
			if (i == userNum) {
				sameCount++;
				return colorIcon(userNum);
			}
		}
		return blackIcon();
	}

	private String getGrade(int bonusNum, int[] userNumS) {
		if (sameCount == 6) {
			sameCount = 0;
			return "1등 당첨!!!!";
		} else if (sameCount == 5) {
			sameCount = 0;
			return getGrade23(bonusNum, userNumS);
		} else if (sameCount == 4) {
			sameCount = 0;
			return "4등 당첨!";
		} else if (sameCount == 3) {
			sameCount = 0;
			return "5등 당첨";
		}
		sameCount = 0;
		return "낙첨";
	}

	private String getGrade23(int bonusNum, int[] userNumS) {
		for(int i = 0; i < userNumS.length; i++) {
			if(bonusNum == userNumS[i]) {
				
				return "2등 당첨!!!";
			}
		}
		return "3등 당첨!!";
	}
}
