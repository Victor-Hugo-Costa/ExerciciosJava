package LACOSDEREPETICAO;

import java.util.Scanner;

public class Exercicio2For {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int i, somaPar = 0, somaIm = 0, array[];
		array = new int [11];
		
		
		
		for(i = 1; i <= 10; i++) {
			
			System.out.println("Digite um número: ");
			array[i] = ler.nextInt();
			
			if(array[i] % 2 == 0) {
				somaPar++;
			}
			else {
				somaIm++;
			}
			
		}
		System.out.println("Total de números pares: " + somaPar);
		System.out.println("Total de números ímpares: " + somaIm);

	}

}

			