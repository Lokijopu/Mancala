import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mancala extends JFrame{
	private int numTurns;
	private int redPoints;
	private int bluePoints;
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
		JButton start = new JButton("Start");
		panel1.add(mancalaLabel);
		panel1.add(start);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 2");
				
			}
			
		});
		JPanel panel2 = new JPanel();
		JButton play = new JButton("Play");
		panel2.add(play);
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 3");
				
			}
			
		});
		
		JPanel panel3 = new JPanel();
		JButton home = new JButton("Home");
		panel3.add(home);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 1");
				
			}
			
		});
		BufferedImage buttonIcon = ImageIO.read(new File("Mancala Board.jfif"));
		JButton button = new JButton(new ImageIcon(buttonIcon));
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setContentAreaFilled(false);
		
		overall.add(panel1, "panel 1");
		overall.add(panel2, "panel 2");
		overall.add(panel3, "panel 3");
		
		cL.show(overall, "panel1");
		add(overall);
	}
	public void resetBoard() {
		
	}
	public void moveGem() {
		
	}
	public void getNumGems() {
		
	}
	public static void main (String[] args) {
		new Mancala();
	}
}
