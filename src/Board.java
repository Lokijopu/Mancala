import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Board extends JFrame {
	public Board() {
		setTitle("Board");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(1000, 1000));
        setVisible(true);
        ImageIcon image = new ImageIcon(getClass().getResource("Mancala board.jfif"));
        JLabel label = new JLabel(image);
        label.setToolTipText("click here to submit");
        add(label);
	}
	public static void main (String[] args) {
		new Board();
	}
}
