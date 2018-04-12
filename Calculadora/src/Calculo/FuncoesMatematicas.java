package Calculo;

public class FuncoesMatematicas {
	
	public double soma(double a, double b) {
		double total = a + b;
		return total;
		
	}
	public double subtracao(double a, double b) {
		double total = a - b;
		return total;
		
	}
	public double multiplicacao(double a, double b) {
		double total = a * b;
		return total;
		
	}
	public double divisao(double a, double b) {
		double total = a / b;
		return total;
		
	}
	public double porcentagem(double a, double b) {
		b =  a * (b/100)  ;
		return b;
		
	}
}
