package pc1;

import java.util.Scanner;
import java.util.Arrays;

public class Exerc11_14 {
	public static void main(String[] args){
		
		Scanner etd = new Scanner(System.in);
		
		// Exercicio 11
		int a = 22;
		
		if( a >= 100 ) {
			System.out.println(" � maior que 100");
		}
		else {
			System.out.println(a + " � menor que 100");
		}
		if( a <= 15 ) {
			System.out.println(" � menor que 15");
		}
		else {
			System.out.println(a + " � maior que 15");
		}
		
		// exercicio 12
		
		float b = 3.95f;
		
		if(b >= 1.99 && b <= 5.99) {
			System.out.println(b + " esta entre 1.99 e 5.99");
		}
		else {
			System.out.println(b + " n�o esta entre 1.99 e 5.99");
		}
		
		
		// exercicio 13
		
		if(b == a) {
			System.out.println(a + " e " + b + "S�o iguais" );
		}
		else {
			System.out.println(a + " e " + b + " N�o s�o iguais" );
		}
		
	
		// exercicio 14
		
		int c=10;
		double d=2.5d, e=0d;
		
		e = c*d;
		
		int r = (int) e;
		
		System.out.println("Resultado � " + r);
		
		// exercicio 15
		
		String nome[] = new String[5]; // � preciso colocar o numero de vetores.
			
		System.out.println("Digite Os nomes: ");
			nome[0] = etd.next();
			nome[1] = etd.next();
			nome[2] = etd.next();
			nome[3] = etd.next();
			nome[4] = etd.next();
			
			Arrays.sort(nome);
			
			System.out.print ("O nomes em ordem alfab�tica s�o ");
			for (int i = 0 ; i<nome.length;i++)
		       {
		                 System.out.print (nome[i]+", ");
		       }
			
		
		// exercicio 16
		
		float g=0f,h=0f,area=0f;
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Digite o lado A: ");
		g = etd.nextFloat();
		System.out.println("Digite o lado B: ");
		h = etd.nextFloat();
		
		
		
		area = g*h;
		
		System.out.println("Lado A= " + g);
		System.out.println("Lado B= " + h);
		System.out.println("A �rea �= " + area);
		
		
		// exercicio 17
		
		if(g == h) {
			System.out.println("Essas medidas correspondem a um QUADRADO");
		}
		else {
			System.out.println("Essas medidas N�O correspondem a um Quadrado.");
		}
		
		// exercicio 18
		
		int x=15,y=5;
		System.out.println(x + " + " + y + " = ");
		
		x += y;
		System.out.println(x);
		
		// exercicio 19
		
		
		// exercicio 20
		
		int valor;
		
		valor = a+c+r+x+y;
		System.out.println("O valor da soma de todas as v�riaveis int �: " + valor);
		
		
		
	}
}
