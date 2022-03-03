package LACOSDEDECISAO;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.print("Digite um número inteiro: ");
		x = ler.nextInt();
		
		System.out.println("\n");
	
		
		if (x % 2 == 0 && x > 0) 
		{
			System.out.println("O número "+x+" é par");
			System.out.println("E sua raiz quadrada é igual a "+Math.sqrt(x));
		} else if (x < 0 && x % 2 == 0) 
		{
			System.out.println("O número "+x+" é par");
			System.out.println("O número "+x+" não possuí raiz quadrada");
		}
		else
		{
			System.out.println("O número "+x+" é ímpar \nO seu resultado ao quadrado é "+Math.pow(x, 2));
		}	
	}
	
}
