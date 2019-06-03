import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BluePiece extends Piece{
	public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.BLUE);
        g2.fill(new Ellipse2D.Double(10, 10, 10, 10));
        
    }
	public String getColor() {
		return "blue";
	}
	public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Ellipse Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BluePiece());
        frame.pack();
        frame.setSize(new Dimension(420, 400));
        frame.setVisible(true);
    }
}
