package image;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImagePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ImagePanel() {
		setPreferredSize(new Dimension(500, 500));
		
		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setIcon(new ImageIcon(ImagePanel.class.getResource("/image/춘식1.png")));
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Image choonsik = toolkit.getImage(ImagePanel.class.getResource("/image/춘식1.png"));
//		lblNewLabel.setIcon(new ImageIcon(choonsik));
		
		BufferedImage choonsik = null;
		try {
			choonsik = ImageIO.read(ImagePanel.class.getResource("/image/춘식1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblNewLabel.setIcon(new ImageIcon(choonsik));
		
		add(lblNewLabel);

		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(ImagePanel.class.getResource("/image/춘식2.png")));
		add(btnNewButton);
		
		
		
		

	}

}
