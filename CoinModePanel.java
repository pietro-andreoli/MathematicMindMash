import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CoinModePanel extends JPanel {
	BufferedImage instructionScreen;
	BufferedImage startButton;
	Rectangle startButtonRect = new Rectangle(212, 580, 75, 75);
	BufferedImage cash20;
	Rectangle cash20Rect = new Rectangle(27, 520, 130, 60);
	BufferedImage cash10;
	Rectangle cash10Rect = new Rectangle(184, 520, 130, 60);
	BufferedImage cash5;
	Rectangle cash5Rect = new Rectangle(341, 520, 130, 60);
	BufferedImage toonie;
	Ellipse2D.Double toonieEllipse = new Ellipse2D.Double(50, 600,60, 60);
	BufferedImage loonie;
	Ellipse2D.Double loonieEllipse = new Ellipse2D.Double(126, 605,50, 50);
	BufferedImage quarter;
	Ellipse2D.Double quarterEllipse = new Ellipse2D.Double(197, 605,50, 50);
	BufferedImage nickel;
	Ellipse2D.Double nickelEllipse = new Ellipse2D.Double(268, 605,50, 50);
	BufferedImage dime;
	Ellipse2D.Double dimeEllipse = new Ellipse2D.Double(339, 605, 50, 50);
	
	BufferedImage moniesCount;
	ArrayList<Money> cash20List = new ArrayList<Money>();
	ArrayList<Money> cash10List = new ArrayList<Money>();
	ArrayList<Money> cash5List = new ArrayList<Money>();
	ArrayList<Money> quarterList = new ArrayList<Money>();
	ArrayList<Money> loonieList = new ArrayList<Money>();
	ArrayList<Money> toonieList = new ArrayList<Money>();
	ArrayList<Money> nickelList = new ArrayList<Money>();
	ArrayList<Money> dimeList = new ArrayList<Money>();
	boolean gameState = false;

	public CoinModePanel() {
		
			
		try {
			instructionScreen = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/CoinModeInstructions.png"));
			startButton = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/startButton.png"));
			cash20 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/20Bill.png"));
			cash10 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/10Bill.png"));
			cash5 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/5Bill.png"));
			toonie = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/toonie.png"));
			loonie = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/loonie.png"));
			quarter = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/quarter.png"));
			nickel = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/nickel.png"));
			dime = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/dime.png"));
			moniesCount = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/CurrentNumberOfMonies.png"));

		} catch (IOException ex) {
			System.out.println(ex);
		}
		repaint();
		class buttonClickListener implements MouseListener {

			public void mouseClicked(MouseEvent event) {
				System.out.println("ayy");
				int clickX = event.getX(),

				clickY = event.getY();
				System.out.println(clickX + ", " +clickY);
				
				

				if (SwingUtilities.isLeftMouseButton(event)) {

					if (startButtonRect != null &&

					startButtonRect.contains(clickX, clickY)) {
						System.out.println("start");
						startButtonRect=null;
						gameState = true;
						
						repaint();
					} else if (cash20Rect.contains(clickX, clickY)) {
						
						System.out.println("20");
						Money temp=new Money(20, 27, 230+(cash20List.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(27, 1000);
						cash20List.add(temp);
						repaint();
						
					} else if (cash10Rect.contains(clickX, clickY)) {
						
						System.out.println("10");
						Money temp=new Money(10, 184, 230+(cash10List.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(184, 1000);
						cash10List.add(temp);
						repaint();
						
					} else if (cash5Rect.contains(clickX, clickY)) {
						System.out.println("5");
						Money temp=new Money(5, 341, 230+(cash5List.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(341, 1000);
						cash5List.add(temp);
						repaint();
					} else if (toonieEllipse.contains(clickX, clickY)) {
						System.out.println("2");
						Money temp=new Money(2, 50, 310+(toonieList.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(50, 1000);
						toonieList.add(temp);
						repaint();
					} else if (loonieEllipse.contains(clickX, clickY)) {
						System.out.println("1");
						Money temp=new Money(1, 126, 310+(loonieList.size()+1)*20);
						if(temp.yPos >= 450)
						temp.setLocation(126, 1000);
						loonieList.add(temp);
						repaint();
					} else if (quarterEllipse.contains(clickX, clickY)) {
						System.out.println("0.25");
						Money temp=new Money(0.25, 202, 310+(quarterList.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(202, 1000);
						quarterList.add(temp);
						repaint();
					} else if (nickelEllipse.contains(clickX, clickY)) {
						System.out.println("0.05");
						Money temp=new Money(0.05, 278, 310+(nickelList.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(278, 1000);
						nickelList.add(temp);
						repaint();
					} else if (dimeEllipse.contains(clickX, clickY)) {
						System.out.println("0.10");
						Money temp=new Money(0.10, 354, 310+(dimeList.size()+1)*20);
						if(temp.yPos >= 450)
							temp.setLocation(354, 1000);
						dimeList.add(temp);
						repaint();
					}
					
					for(Money list20 : cash20List){
						if(list20.bodyR.contains(clickX, clickY)){
							cash20List.remove(cash20List.size()-1);
							repaint();
						}
					}
					for(Money list10 : cash10List){
						if(list10.bodyR.contains(clickX, clickY)){
							cash10List.remove(cash10List.size()-1);
							repaint();
						}
					}
					for(Money list5 : cash5List){
						if(list5.bodyR.contains(clickX, clickY)){
							cash5List.remove(cash5List.size()-1);
							repaint();
						}
					}
					for(Money listToonie : toonieList){
						if(listToonie.bodyE.contains(clickX, clickY)){
							toonieList.remove(toonieList.size()-1);
							repaint();
						}
					}
					for(Money listLoonie : loonieList){
						if(listLoonie.bodyE.contains(clickX, clickY)){
							loonieList.remove(loonieList.size()-1);
							repaint();
						}
					}
					for(Money list : quarterList){
						if(list.bodyE.contains(clickX, clickY)){
							quarterList.remove(quarterList.size()-1);
							repaint();
						}
					}
					for(Money list : nickelList){
						if(list.bodyE.contains(clickX, clickY)){
							nickelList.remove(nickelList.size()-1);
							repaint();
						}
					}
					for(Money list : dimeList){
						if(list.bodyE.contains(clickX, clickY)){
							dimeList.remove(dimeList.size()-1);
							repaint();
						}
					}
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
		if (!gameState) {
			g.drawImage(instructionScreen, 0, 0, null);
			g.drawImage(startButton, 175, 580, null);
		} else if (gameState) {
			
			g.drawImage(cash20, 27, 520, null); 
			g.drawImage(cash10, 184, 520, null); 
			g.drawImage(cash5, 341, 520,null); 
			g.drawImage(toonie, 50, 600, null); 
			g.drawImage(loonie,126, 605, null); 
			g.drawImage(quarter, 202, 610, null);
			g.drawImage(nickel, 278, 615, null); 
			g.drawImage(dime, 354, 620,null);
			if(cash20List.size()>1){
				g.drawImage(moniesCount, 95, 220, null);
				g.setColor(Color.WHITE);
				g.drawString("x"+cash20List.size(), 110, 244);
			}
				
		}
		
		for (Money list : cash20List) {
				g.drawImage(cash20, list.xPos,list.yPos, null);
		}
		for(Money list : cash10List){
			g.drawImage(cash10, list.xPos,list.yPos, null);
		}
		for(Money list : cash5List){
			g.drawImage(cash5, list.xPos,list.yPos, null);
		}
		for(Money list : toonieList){
			g.drawImage(toonie, list.xPos,list.yPos, null);
		}
		for(Money list : loonieList){
			g.drawImage(loonie, list.xPos,list.yPos, null);
		}
		for(Money list : quarterList){
			g.drawImage(quarter, list.xPos,list.yPos, null);
		}
		for(Money list : nickelList){
			g.drawImage(nickel, list.xPos,list.yPos, null);
		}
		for(Money list : dimeList){
			g.drawImage(dime, list.xPos,list.yPos, null);
		}

	}
}
