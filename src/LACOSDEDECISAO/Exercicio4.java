package LACOSDEDECISAO;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.print("Digite um n�mero inteiro: ");
		x = ler.nextInt();
		
		System.out.println("\n");
	
		
		if (x % 2 == 0 && x > 0) 
		{
			System.out.println("O n�mero "+x+" � par");
			System.out.println("E sua raiz quadrada � igual a "+Math.sqrt(x));
		} else if (x < 0 && x % 2 == 0) 
		{
			System.out.println("O n�mero "+x+" � par");
			System.out.println("O n�mero "+x+" n�o possu� raiz quadrada");
		}
		else
		{
			System.out.println("O n�mero "+x+" � �mpar \nO seu resultado ao quadrado � "+Math.pow(x, 2));
		}	
	}
	
}
