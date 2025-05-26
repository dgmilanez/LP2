package formas;

public class Circulo {
	// 1. Atributos:
	private int x;
	private int y;
	private int raio;
	
	// 2. Métodos:
	// 2.1. Construtor:
	public Circulo(int x, int y, int raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	// 2.2. Cópia:
	public Circulo(Circulo outro) {
		this.x = outro.x;
		this.y = outro.y;
		this.raio = outro.raio;
	}
	
	// 2.3. Mover:
	public void mover(int novoX, int novoY) {
		x = novoX;
		y = novoY;
	}
	
	// 2.4. Desenhar:
	public void desenhar() {
		System.out.printf("Círculo (%d,%d,%d).\n",x,y,raio);
	}
	
	// 2.5. Redimensionar:
	public void redimencionar(float sr) {
		if (sr > 0) {
			raio = (int) (sr / 100 * raio);
		}
	}
	
	// 2.6. Acesso:
	// 2.6.1 Get:
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getRaio() {
		return raio;
	}
	
	// 2.6.2 Set:
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setRaio(int raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}
}