import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Money {
	double value;
	int xPos;
	int yPos;
	Rectangle bodyR;
	Ellipse2D.Double bodyE;

	Rectangle startButtonRect = new Rectangle(212, 580, 75, 75);
	BufferedImage cash20;
	Rectangle cash20Rect = new Rectangle(27, 520, 130, 60);
	BufferedImage cash10;
	Rectangle cash10Rect = new Rectangle(184, 520, 130, 60);
	BufferedImage cash5;
	Rectangle cash5Rect = new Rectangle(341, 520, 130, 60);
	BufferedImage toonie;
	Ellipse2D.Double toonieEllipse = new Ellipse2D.Double(50, 600, 60, 60);
	BufferedImage loonie;
	Ellipse2D.Double loonieEllipse = new Ellipse2D.Double(50, 600, 50, 50);
	BufferedImage quarter;
	Ellipse2D.Double quarterEllipse = new Ellipse2D.Double(202, 610, 40, 40);
	BufferedImage nickel;
	Ellipse2D.Double nickelEllipse = new Ellipse2D.Double(278, 615, 30, 30);
	BufferedImage dime;
	Ellipse2D.Double dimeEllipse = new Ellipse2D.Double(354, 620, 20, 20);

	public Money(double amount, int x, int y) {
		value = amount;
		xPos = x;
		yPos = y;
		if (amount == 20 || amount == 10 || amount == 5)
			bodyR = new Rectangle(xPos, yPos, 130, 60);
		else if (amount == 1 || amount == 2 || amount == 0.25 || amount == 0.05 || amount == 0.1)
			bodyE = new Ellipse2D.Double(xPos, yPos, 60, 60);
		try {
			cash20 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/20Bill.png"));
			cash10 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/10Bill.png"));
			cash5 = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/5Bill.png"));
			toonie = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/toonie.png"));
			loonie = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/loonie.png"));
			quarter = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/quarter.png"));
			nickel = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/nickel.png"));
			dime = ImageIO.read(new File("C:/Users/Peter/workspace/Math Game/src/MoneyPics/dime.png"));

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
	
	public void setLocation(int x, int y){
		this.xPos=x;
		this.yPos=y;
		this.bodyR.x=x;
		this.bodyR.y=y;
	}

	public void draw(Graphics2D g2) {
		if (value == 20) {
			g2.drawImage(cash20, 27, 520, null);
		}
	}
}
