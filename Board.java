
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Windows
 */
public class Board extends JPanel {

    public Board() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderingHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHints(renderingHints);
        double w = getSize().getWidth();
        double h = getSize().getHeight();

        Ellipse2D e = new Ellipse2D.Double(0, 0, 30, 210);
        g2.setStroke(new BasicStroke(1));

        

        for (double deg = 0; deg < 360; deg += 10) {
            AffineTransform affineTransform = AffineTransform.getTranslateInstance(w / 2, h / 2);
            affineTransform.rotate(Math.toRadians(deg));
            Shape intermediateShape = affineTransform.createTransformedShape(e);
            Rectangle bounds = intermediateShape.getBounds();
            
            g2.setPaint(new GradientPaint(bounds.x, bounds.y, new Color(255, 144, 0), bounds.x + bounds.width, bounds.y + bounds.height, new Color(255, 200, 0)));
            
            g2.fill(intermediateShape);
        }
    }

}























































