package aula2;

public class Operadores {

	public static void main(String[] args) {
		// 7 calculo de área de uma circunferencia com raio 12, onde  PI=3.1415 e área = pl^2.	
				double pi=3.1415, a, r = 12;
				a = pi*Math.pow(r,2);
				System.out.println("Area é = " +a);
				// 8 calcule o resto da divisão de 99 por 4
				int b=99,c=4;
				r = b%c;
				System.out.println("Resultado =" +r);
				// 9 divida um numero por 2 sem utilizar o operador /
				double n1=0.5,result2;
				result2=10*n1;
				System.out.println("Resultado =" + result2);
				// 10 multiplicar um numero  por 8, sem utilizar o operador *
				int cont;
				int na=0, n2=5;
				for(cont=0;cont < 8;cont++){
					na=na+n2;
					
				}
				System.out.println(na);
				// desafio..
				
			}
		}

