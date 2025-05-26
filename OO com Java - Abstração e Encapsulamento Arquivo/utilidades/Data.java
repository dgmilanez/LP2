package utilidades;

public class Data {
	// 1. Atributos;
	int dia, mes, ano;
	
	// 2. Métodos:
	// 2.1 Construtor:
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public boolean ehValida() {
		if (mes < 12) {
			switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: {
					if ( 1 <= this.dia && this.dia <= 31) {
						return true;
					}
					break;
				}
					
				case 2: {
					if ( ano % 4 == 0 || !(ano % 100 == 0)) {
						return true;
					}
					break;
				}
			}
			
			
		}
	}
}
