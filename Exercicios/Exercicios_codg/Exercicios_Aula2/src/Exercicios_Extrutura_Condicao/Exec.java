package Exercicios_Extrutura_Condicao;

import java.util.Scanner;

public class Exec {

	private static Scanner etd;
	
	public static void main(String[] args) {
		
		int exercicio=1;
		etd = new Scanner(System.in);
		
		Exer1_Par ex1 = new Exer1_Par();
		Oimpar ex2 = new Oimpar();
		
		while(exercicio!=0) {
	    
			System.out.println("Digite o numero do exercicio: ");
			exercicio=etd.nextInt();		
			
			switch(exercicio) {
				case(1):
					ex1.Oparcres();
					break;
				case(2):
					System.out.println("Digite o primeiro numero: ");
					ex2.setNumero1(etd.nextInt());
					System.out.println("Digite o segundo numero: ");
					ex2.setNumero2(etd.nextInt());
					ex2.Oimparcres();
					break;
				case(3):
					
					break;
				default:
					break;
				}
			
			
			for(int i=0; i <= 100; i++) {
				System.out.println("\n");
			}
		}
		
		
		
	}

}
