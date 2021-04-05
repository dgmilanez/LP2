import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import figures.Rect;
import figures.Ellipse;
import figures.Oval;

class PackApp{
	public static void main(String[] args){
		PackFrame frame = new PackFrame();
		frame.setVisible(true);
	}
}

class PackFrame extends JFrame{
	Rect r1;
	Ellipse e1;
	Oval o1;

	PackFrame(){
		this.setTitle("Painting Fogures");
		this.setSize(500,500);

		Color FA = new Color(50,50,50);
		Color CA = new Color(200,200,200);
		Color FB = new Color(0,255,0);
		Color CB = new Color(255,0,0);
		Color FC = new Color(100,255,255);
		Color CC = new Color(0,0,255);

		this.r1 = new Rect(50,50,100,30,FA,CA);
		this.e1 = new Ellipse(200,200,100,50,FB,CB);
		this.o1 = new Oval(50,200,100,30,FC,CC);
	}

	public void paint (Graphics g) {
		super.paint(g);
		this.r1.paint(g);
		this.e1.paint(g);
		this.o1.paint(g);
	}
}
