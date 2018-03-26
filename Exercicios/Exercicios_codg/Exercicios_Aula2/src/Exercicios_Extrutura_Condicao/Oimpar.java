package Exercicios_Extrutura_Condicao;

import java.util.Scanner;

public class Oimpar {

	Scanner etd = new Scanner(System.in);
	
	private int numero1=0;
	private int numero2=0;
	

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero1()
	{
		return numero1;
	
	}
	
	public void Oimparcres(){	
	for(numero1=0; numero1 < numero2; numero1+=2) {
		System.out.println(numero1);
	}
		
		
}

	
	
}