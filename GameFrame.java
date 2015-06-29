import javax.swing.JFrame;

public class GameFrame extends JFrame {

	static int FRAME_WIDTH = 500;
	static int FRAME_HEIGHT = 700;
	static JFrame frame = new GameFrame();
	static MainMenu mainMenu = new MainMenu();
	static CoinModePanel coinPanel = new CoinModePanel();
	static addSubtractModePanel addSubtractPanel = new addSubtractModePanel();
	static multiplyDividePanel multiplyDividePanel = new multiplyDividePanel();
	static SpeedModePanel speedPanel = new SpeedModePanel();

	public static void main(String[] args) {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("The Math Game");

		mainMenu.setLayout(null);
		frame.add(mainMenu);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
	}

}
