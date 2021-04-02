package figures;
import java.awt.*;
import java.awt.geom.*;

public class Ellipse {
	int x,y;
	int w,h;
	Color fundo,contorno;

	public Ellipse (int x, int y, int w, int h, Color fundo, Color contorno){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.fundo = fundo;
		this.contorno = contorno;
	}

	public void print(){
		System.out.format("(%d,%d) / (%d,%d)\n",
				this.w,this.h,this.x,this.y);
	}

	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(this.fundo);
		g2d.fill(new Ellipse2D.Double(
					this.x,this.y,
					this.w,this.h
					));

		g2d.setColor(this.contorno);
		g2d.draw(new Ellipse2D.Double(
					this.x,this.y,
					this.w,this.h
					));
	}
}
