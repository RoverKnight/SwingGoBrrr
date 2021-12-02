package walter;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.NoninvertibleTransformException;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WalterBoard extends JPanel {

    private Image img;

    public WalterBoard() {
        initBoard();
    }


    private void initBoard() {
        loadImage();
        int width = img.getWidth(this);
        int height = img.getHeight(this);
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/resources/herrWalter.png");
        img = ii.getImage();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // to overlay drawings over images, put this first, then images, then drawings

        g.drawImage(img, 0, 0, null);
        drawDonut(g);
    }

    private void drawDonut(Graphics g) {

        // Graphics2D gives more control than Graphics
        Graphics2D g2d = (Graphics2D) g;

        // RenderingHints is used to make the drawing smooth, gets crunchy without it
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        Dimension size = getSize();
        double width = size.getWidth();
        double height = size.getHeight();

        Ellipse2D ellipse = new Ellipse2D.Double(0, 0, 80, 130);
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(new Color(58, 52, 163));

        for (double deg = 0; deg < 360; deg += 2) {
            AffineTransform at = AffineTransform.getTranslateInstance(width/2, height/2);
            at.rotate(Math.toRadians(deg));
            /* This does some cool shit (has to be between rotate and draw tho):
            try {
                at = at.createInverse();
            } catch (NoninvertibleTransformException e) {
                e.printStackTrace();
            } */
            g2d.draw(at.createTransformedShape(ellipse));
        }
    }
}