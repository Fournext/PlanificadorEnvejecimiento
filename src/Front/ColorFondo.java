package Front;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class ColorFondo extends JPanel {
    //private Color color1 = new Color(8, 154, 15);
    private Color color1 = new Color(208, 9, 9);
    private Color color2 = Color.BLACK;
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D G2 = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        G2.setPaint(gp);
        G2.fillRect(0, 0, w, h);
    }
    
    public static void main(String[] args) {
        // Aquí puedes agregar el código para crear y mostrar tu JFrame con este JPanel
    }
}
