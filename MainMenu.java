import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
	String gameMode = null;
	private BufferedImage titleScreenImage;
	private BufferedImage settingsIcon;
	Rectangle settingsIconRect = new Rectangle(460, 640, 20, 20);
	private BufferedImage coinModeButton;
	Rectangle coinModeRect = new Rectangle(70, 150, 150, 75);
	private BufferedImage addSubtractModeButton;
	Rectangle addSubtractModeRect = new Rectangle(280, 150, 150, 75);
	private BufferedImage multiplyDivideModeButton;
	Rectangle multiplyDivideModeRect = new Rectangle(70, 250, 150, 75);
	private BufferedImage speedModeButton;
	Rectangle speedModeRect = new Rectangle(280, 250, 150, 75);

	public MainMenu() {
		try {
			//titleScreenImage = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/MainMenu.png"));
			titleScreenImage = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/MainMenu.png"));
			//settingsIcon = ImageIO.read(getClass().getResource("/MainMenu.png"));
			coinModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/CoinModeButton.png"));
			addSubtractModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/AddSubtractModeButtonWIP.png"));
			multiplyDivideModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MultiplyDivideModeButtonWIP.png"));
			speedModeButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/SpeedModeButtonWIP.png"));
		} catch (IOException ex) {
		}
		repaint();
		class buttonClickListener implements MouseListener {

			public void mouseClicked(MouseEvent event) {
				int clickX = event.getX();
				int clickY = event.getY();
				// user clicks on the settings
				if (settingsIconRect.contains(clickX, clickY)) {
					System.out.println("settings");
				}
				// user clicks on coin mode
				else if (coinModeRect.contains(clickX, clickY)) {
					System.out.println("coin");
					GameFrame.coinPanel.setBackground(Color.WHITE);
					GameFrame.coinPanel.setLayout(null);
					GameFrame.frame.remove(GameFrame.mainMenu);
					// when you remove a component it invalidates the hierarchy.
					// To re-validate it, you must us the following method
					GameFrame.frame.validate();
					GameFrame.frame.add(GameFrame.coinPanel);
					GameFrame.frame.validate();
					GameFrame.frame.repaint();
					GameFrame.coinPanel.repaint();
					repaint();
				}
				// user clicks on the add/subtract mode
				else if (addSubtractModeRect.contains(clickX, clickY)) {
					/*System.out.println("addsubract");
					GameFrame.addSubtractPanel.setBackground(Color.WHITE);
					GameFrame.addSubtractPanel.setLayout(null);
					GameFrame.frame.remove(GameFrame.mainMenu);
					// when you remove a component it invalidates the hierarchy.
					// To re-validate it, you must us the following method
					GameFrame.frame.validate();
					GameFrame.frame.add(GameFrame.addSubtractPanel);
					GameFrame.frame.validate();
					GameFrame.frame.repaint();
					GameFrame.addSubtractPanel.repaint();
					repaint();
					*/
					Toolkit.getDefaultToolkit().beep();
					String message="This Game Mode is not Ready Yet! Sorry :(";
					JOptionPane.showMessageDialog(new JFrame(), message, "Whoops!",
					        JOptionPane.ERROR_MESSAGE);
				}
				// user clicks on the multiply divide mode
				else if (multiplyDivideModeRect.contains(clickX, clickY)) {
					/*
					System.out.println("multiplydivide");
					GameFrame.multiplyDividePanel.setBackground(Color.WHITE);
					GameFrame.multiplyDividePanel.setLayout(null);
					GameFrame.frame.remove(GameFrame.mainMenu);
					// when you remove a component it invalidates the hierarchy.
					// To re-validate it, you must us the following method
					GameFrame.frame.validate();
					GameFrame.frame.add(GameFrame.multiplyDividePanel);
					GameFrame.frame.validate();
					GameFrame.frame.repaint();
					GameFrame.multiplyDividePanel.repaint();
					repaint();
					*/
					Toolkit.getDefaultToolkit().beep();
					String message="This Game Mode is not Ready Yet! Sorry :(";
					JOptionPane.showMessageDialog(new JFrame(), message, "Whoops!",
					        JOptionPane.ERROR_MESSAGE);
				}
				// user clicks on the speed mode
				else if (speedModeRect.contains(clickX, clickY)) {
					/*
					System.out.println("speed");
					GameFrame.speedPanel.setBackground(Color.WHITE);
					GameFrame.speedPanel.setLayout(null);
					GameFrame.frame.remove(GameFrame.mainMenu);
					// when you remove a component it invalidates the hierarchy.
					// To re-validate it, you must us the following method
					GameFrame.frame.validate();
					GameFrame.frame.add(GameFrame.speedPanel);
					GameFrame.frame.validate();
					GameFrame.frame.repaint();
					GameFrame.speedPanel.repaint();
					repaint();
					*/
					Toolkit.getDefaultToolkit().beep();
					String message="This Game Mode is not Ready Yet! Sorry :(";
					JOptionPane.showMessageDialog(new JFrame(), message, "Whoops!",
					        JOptionPane.ERROR_MESSAGE);
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

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(titleScreenImage, 0, 0, null);
		g.drawImage(settingsIcon, 460, 640, null);
		g.drawImage(coinModeButton, 70, 150, null);
		g.drawImage(addSubtractModeButton, 280, 150, null);
		g.drawImage(multiplyDivideModeButton, 70, 250, null);
		g.drawImage(speedModeButton, 280, 250, null);

	}
}
