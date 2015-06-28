import java.awt.Color;

import javax.swing.JFrame;


public class GameFrame extends JFrame {
	
	static int FRAME_WIDTH=500;
	static int FRAME_HEIGHT=700;
	public static void main(String[] args) {
		JFrame frame = new GameFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("The Math Game");
		GamePanel panel =new GamePanel();
		panel.setLayout(null);
		frame.add(panel);
		
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		

		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
	}
	
}
