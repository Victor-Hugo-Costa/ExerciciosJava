package LACOSDEDECISAO;

import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.print("Entre com o primeiro valor inteiro: ");
		a = ler.nextInt();
		System.out.print("Entre com o segundo valor inteiro: ");
		b = ler.nextInt();
		System.out.print("Entre com o terceiro valor inteiro: ");
		c = ler.nextInt();
		
		if (a > b && a > c) 
		{
			System.out.println("\nO primeiro valor registrado é o maior");
			a = ler.nextInt();
		}
		else if (b > a && b > c) 
		{
			System.out.println("\nO segundo valor registrado é o maior");
			b = ler.nextInt();
		}
		else if (c > a && c > b) 
		{
			System.out.println("\nO terceiro valor registrado é o maior");
			c = ler.nextInt();
		}
		else 
		{
			System.out.println("\nValor digitado inválido");
		}
	}

}
