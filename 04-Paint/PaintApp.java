import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

class Rect {
	int x,y;
	int w,h;
	Color fundo,contorno;
	
	Rect (int x, int y, int w, int h, Color fundo, Color contorno){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.fundo = fundo;
		this.contorno = contorno;
	}
	
	void print(){
		System.out.format("(%d,%d) / (%d,%d)\n",
				this.w,this.h,this.x,this.y);
	}

	void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(this.fundo);
		g2d.fillRect(
				this.x,this.y,
				this.w,this.h
				);

		g2d.setColor(this.contorno);
		g2d.drawRect(
				this.x,this.y,
				this.w,this.h
				);
	}
}

class PaintApp{
	public static void main(String[] args){
		PaintFrame frame = new PaintFrame();
		frame.setVisible(true);
	}
}

class PaintFrame extends JFrame{
	Rect r1,r2,r3;

	PaintFrame(){
		this.setTitle("Painting Fogures");
		this.setSize(500,500);

		Color FA = new Color(50,50,50);
		Color CA = new Color(200,200,200);
		Color FB = new Color(0,255,0);
		Color CB = new Color(255,0,0);
		Color FC = new Color(100,255,255);
		Color CC = new Color(0,0,255);

		this.r1 = new Rect(50,50,100,30,FA,CA);
		this.r2 = new Rect(200,200,100,50,FB,CB);
		this.r3 = new Rect(50,200,100,30,FC,CC);
	}

	public void paint (Graphics g) {
		super.paint(g);
		this.r1.paint(g);
		this.r2.paint(g);
		this.r3.paint(g);
	}
}
