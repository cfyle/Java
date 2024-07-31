import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class CheckMyNum extends JPanel {
	public CheckMyNum() {
		StringBuilder numbersString = new StringBuilder("고객님의 구매하신 로또 번호입니다\n\n");
		try (BufferedReader reader = new BufferedReader(new FileReader("./\\Lotto\\lotto.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty()); {
				}
				String[] parts = line.split(":");
				if (parts.length == 2) {
					String typeAndNumber = parts[0].trim();
					String lottoNumber = parts[1].trim();
					numbersString.append(typeAndNumber).append(": ").append(lottoNumber).append("\n");
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "파일을 읽는 중 오류가 발생했습니다: " + e.getMessage(), "오류", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			return;
		}

		JTextArea textArea = new JTextArea(numbersString.toString());
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);

		add(scrollPane, BorderLayout.CENTER);
	}
}