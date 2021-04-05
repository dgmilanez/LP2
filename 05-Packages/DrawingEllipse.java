import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import figures.Ellipse;
import java.util.ArrayList;
import java.util.Random;

class DrawingEllipse{
	public static void main(String[] args){
		DrawingEllipseFrame frame = new DrawingEllipseFrame();
		frame.setVisible(true);
	}
}

class DrawingEllipseFrame extends JFrame{
	ArrayList<Ellipse> es = new ArrayList<Ellipse>();

	DrawingEllipseFrame(){
		this.addKeyListener(
				new KeyAdapter(){
					public void keyPressed (KeyEvent evt){
						if (evt.getKeyChar() == 'e'){

							Random rand = new Random();
							Color fundo = new Color(0,0,0);
							Color contorno = new Color(255,255,255);

							int x = rand.nextInt(500);
							int y = rand.nextInt(500);
							int w = rand.nextInt(500);
							int h = rand.nextInt(500);
							es.add(new Ellipse(x,y,w,h,fundo,contorno));
							repaint();
						}
					}
				}
				);
		this.setTitle("Drawing Ellipses");
		this.setSize(500,500);

	}

	public void paint (Graphics g) {
		super.paint(g);

		for (Ellipse e: this.es){
			e.paint(g);
		}
	}
}
