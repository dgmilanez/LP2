import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

class Rect {
	int x,y;
	int w,h;
	int cr,cg,cb;
	int fr,fg,fb;
	
	Rect (int x, int y, int w, int h, int cr, int cg, int cb, int fr, int fg, int fb){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.cr = cr;
		this.cg = cg;
		this.cb = cb;
		this.fr = fr;
		this.fg = fg;
		this.fb = fb;
	}
	
	void print(){
		System.out.format("(%d,%d) / (%d,%d) - Contorno(R=%d,G=%d,B=%d) - Fundo(R=%d,G=%d,B=%d)\n",
				this.w,this.h,this.x,this.y,this.cr,this.cg,this.cb,this.fr,this.fg,this.fb);
	}

	void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(new Color(this.fr,this.fg,this.fb));
		g2d.fillRect(
				this.x,this.y,
				this.w,this.h
				);

		g2d.setColor(new Color(this.cr,this.cg,this.cb));
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
		this.r1 = new Rect(50,50,100,30,50,50,50,200,200,200);
		this.r2 = new Rect(200,200,100,50,0,255,0,255,0,0);
		this.r3 = new Rect(50,200,100,30,100,255,255,0,0,255);
	}

	public void paint (Graphics g) {
		super.paint(g);
		this.r1.paint(g);
		this.r2.paint(g);
		this.r3.paint(g);
	}
}
