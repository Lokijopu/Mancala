import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		JPanel homePanel = new JPanel();
		JLabel mancalaLabel = new JLabel("Mancala");
		mancalaLabel.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 40));
		JButton start = new JButton("Start");
		homePanel.add(mancalaLabel);
		homePanel.add(start);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 2");
				
			}
			
		});
		JPanel instrPanel = new JPanel();
		JButton play = new JButton("Play");
		instrPanel.add(play);
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 3");
				
			}
			
		});
		
		JPanel boardPanel = new JPanel();
		JButton home = new JButton("Home");
		boardPanel.add(home);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cL.show(overall, "panel 1");
				
			}
			
		});
		ImageIcon image = new ImageIcon(getClass().getResource("Mancala board.jfif"));
		JButton button = new JButton(image);
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setContentAreaFilled(false);
		button.setPreferredSize(new Dimension(100, 100));
		boardPanel.add(button);
		
		JPanel langPanel = new JPanel();
		JLabel langLabel = new JLabel("Choose your language:");
		JComboBox<String> languages = new JComboBox<String>();
		langPanel.add(langLabel);
		languages.addItem("Select your language");
		languages.addItem("English");
		languages.addItem("German");
		languages.addItem("Spanish");
		languages.addItem("Chinese");
		languages.addItem("Japanese");
		languages.addItem("Korean");
		languages.addItem("Latin");
		languages.addItem("French");
		langPanel.add(languages);
		JButton ok = new JButton("Ok");
		ok.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (languages.getSelectedItem().equals("")) {
					
				} else {
					JOptionPane.showMessageDialog(langPanel, "Please select a language.");
				}
				
				cL.show(overall, "panel 3");
			}
			
		});
			
		overall.add(homePanel, "panel 1");
		overall.add(instrPanel, "panel 2");
		overall.add(boardPanel, "panel 3");
		
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
