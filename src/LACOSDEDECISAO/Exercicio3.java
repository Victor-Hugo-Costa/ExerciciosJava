package LACOSDEDECISAO;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.print("Qual a sua idade? ");
		x = ler.nextInt();
		
		System.out.println("\n");
		
		if (x >= 10 && x <= 14) 
		{
			System.out.println("Você faz parte da categoria: Infantil.");
		}
		else if (x >= 15 && x <= 17) 
		{
			System.out.println("Você faz parte da categoria: Juvenil.");
		}
		else if (x >= 18 && x <= 25) 
		{
			System.out.println("Você faz parte da categoria: Adulto.");
		}
		else 
		{
			System.out.println("Você não faz parte das categorias existentes.");
		}	
	}

}
