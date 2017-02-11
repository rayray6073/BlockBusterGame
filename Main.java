import javax.swing.JFrame;
/**
 * Creates the main frame(board) to play the game
 * assigns attributes for the game
 */
public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame(" Block Breaker Game");
		
		BlockBreakerPanel panel = new BlockBreakerPanel(); 
		
		frame.getContentPane().add(panel);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500,600);
		
		frame.setResizable(false);
	}
}
