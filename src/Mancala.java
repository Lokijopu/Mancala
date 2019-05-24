import javax.swing.JFrame;

public class Mancala extends JFrame{
	private int numTurns;
	public Mancala() {
		setTitle("Mancala");
		numTurns = 0;
		
	}
	
	public static void main (String[] args) {
		new Mancala();
	}
}
