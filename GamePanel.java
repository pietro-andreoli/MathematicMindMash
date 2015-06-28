import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class GamePanel extends JPanel{
	private BufferedImage TitleScreenImage;
	public GamePanel(){
		//Main Menu Layout
		try {                
	          TitleScreenImage = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/MainMenu.png"));
	       } catch (IOException ex) {
	       }
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g.drawImage(TitleScreenImage, 0, 0, null);
	}
}
