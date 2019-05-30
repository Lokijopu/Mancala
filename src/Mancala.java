import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mancala extends JFrame{
	private int numTurns;
	public Mancala() {
		setTitle("Mancala");
		numTurns = 0;
		setBounds(300, 300, 300, 200);
		setLayout(new GridBagLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagConstraints gbc = new GridBagConstraints();
		CardLayout cL = new CardLayout();
		JPanel overall = new JPanel();
		overall.setLayout(cL);
		
		JPanel panel1 = new JPanel();
		JLabel mancalaLabel = new JLabel("Mancala");
		JButton button1 = new JButton("Start");
		panel1.add(mancalaLabel);
		panel1.add(button1);
		JPanel panel2 = new JPanel();
		
		JPanel panel3 = new JPanel();
		
		overall.add(panel1, "panel 1");
		overall.add(panel2, "panel 2");
		overall.add(panel3, "panel 3");
	}
	
	public static void main (String[] args) {
		new Mancala();
	}
}
