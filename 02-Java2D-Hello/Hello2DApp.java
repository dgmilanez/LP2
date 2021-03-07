import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
    }
   
    public void paint (Graphics g) {
        super.paint(g);

	Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
	int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);

	// Desenhar um retângulo vermelho de borda preta:
	Rectangle2D.Double retangulo = new Rectangle2D.Double(10,50,100,50);
	g2d.setPaint(Color.RED);
	g2d.fillRect(10,50,100,50);
	g2d.setColor(Color.BLACK); //Qual a diferença desse método para o setPaint()?
	g2d.draw(retangulo);

	// Desenhar uma elipse azul de borda preta:
	Ellipse2D.Double elipse = new Ellipse2D.Double(120,50,100,50);
	g2d.setPaint(Color.BLUE);
	g2d.fillOval(120,50,100,50);
	g2d.setColor(Color.BLACK);
	g2d.draw(elipse);

    }
}
