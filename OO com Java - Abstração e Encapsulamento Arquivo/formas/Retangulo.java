package formas;

public class Retangulo {
	// 1. Atributos:
	private int x;
	private int y;
	private int largura;
	private int altura;
	
	// 2. Métodos:
	// 2.1. Construtor:
	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}
	
	// 2.2. Cópia:
	public Retangulo(Retangulo outro) {
		this.x = outro.x;
		this.y = outro.y;
		this.largura = outro.largura;
		this.altura = outro.altura;
	}
	
	// 2.3. Mover:
	public void mover(int novoX, int novoY) {
		x = novoX;
		y = novoY;
	}
	
	// 2.4. Desenhar:
	public void desenhar() {
		System.out.printf("Retangulo (%d,%d,%d,%d).\n",x,y,largura,altura);
	}
	
	// 2.5. Redimensionar:
	public void redimencionar(float sx, float sy) {
		if (sx > 0 && sy > 0) {
			largura = (int) (sx / 100 * largura);
			altura = (int) (sy / 100 * altura);
		}
	}
	
	// 2.6. Dividir:
	public void dividir(int divisor) {
		if (divisor > 0) {
			this.largura /= divisor;
		}
	}
	
	// 2.7. Acesso:
	// 2.7.1 Get:
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	// 2.7.2 Set:
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setLargura(int largura) {
		if (largura > 0) {
			this.largura = largura;
		}
	}
	
	public void setAltura(int altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
}