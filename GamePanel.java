import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class GamePanel extends JPanel{
	String gameMode=null;
	private BufferedImage titleScreenImage;
	private BufferedImage settingsIcon;
	Rectangle settingsIconRect= new Rectangle (460, 640, 20,20);
	private BufferedImage coinModeButton;
	Rectangle coinModeRect= new Rectangle (70, 150, 150,75);
	private BufferedImage addSubtractModeButton;
	Rectangle addSubtractModeRect= new Rectangle (280, 150, 150,75);
	private BufferedImage multiplyDivideModeButton;
	Rectangle multiplyDivideModeRect= new Rectangle (70, 250, 150,75);
	private BufferedImage speedModeButton;
	Rectangle speedModeRect= new Rectangle (280, 250, 150,75);
	public GamePanel(){
		try {                
	          titleScreenImage = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/MainMenu.png"));
	          settingsIcon = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/Settings.png"));
	          coinModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/CoinModeButton.png"));
	          addSubtractModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/CoinModeButton.png"));
	          multiplyDivideModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/test.png"));
	          speedModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/test.png"));
	       } catch (IOException ex) {
	       }
		repaint();
		class buttonClickListener implements MouseListener{

			public void mouseClicked(MouseEvent event) {
				int clickX=event.getX();
				int clickY=event.getY();
				//user clicks on the settings
				if (settingsIconRect.contains(clickX, clickY)){
					System.out.println("settings");
				}
				//user clicks on coin mode
				else if (coinModeRect.contains(clickX, clickY)){
					System.out.println("coin");
					gameMode="coin";
					repaint();
				}
				//user clicks on the add/subtract mode
				else if (addSubtractModeRect.contains(clickX, clickY)){
					System.out.println("addsubract");
				}
				//user clicks on the multiply divide mode
				else if (multiplyDivideModeRect.contains(clickX, clickY)){
					System.out.println("multiplydivide");
				}
				//user clicks on the speed mode
				else if (speedModeRect.contains(clickX, clickY)){
					System.out.println("speed");
				}
				
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		}
		this.addMouseListener(new buttonClickListener());
		
		
		
		
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if(gameMode==null){
		g.drawImage(titleScreenImage, 0, 0, null);
		g.drawImage(settingsIcon, 460, 640, null);
		g.drawImage(coinModeButton, 70, 150, null);
		g.drawImage(addSubtractModeButton, 280, 150, null);
		g.drawImage(multiplyDivideModeButton, 70, 250, null);
		g.drawImage(speedModeButton, 280, 250, null);
		}
	}
}
