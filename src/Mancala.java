import javax.swing.JFrame;

public class Mancala {
	private int numTurns;
	public Mancala()  {
		JFrame mancalaGUI = new JFrame("Mancala");
		numTurns = 0;
	}
	
	public static void main (String[] args) {
		new Mancala();
	}
}
