package LACOSDEDECISAO;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.print("Entre com o primeiro valor inteiro: ");
		a = ler.nextInt();
		System.out.print("Entre com o segundo valor inteiro: ");
		b = ler.nextInt();
		System.out.print("Entre com o terceiro valor inteiro: ");
		c = ler.nextInt();
		System.out.print("\n");
		
		if (a < b )
			if (b < c) {
				System.out.println(a+"\n"+b+"\n"+c);}
			else if (a < c) {
				System.out.println(a+"\n"+c+"\n"+b);
			} else {
				System.out.println(c+"\n"+a+"\n"+b);
			}  
	
		else if (b < c ) {
			if (a < c) {
				System.out.println(b+"\n"+a+"\n"+c); 
			}else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		} else {
			System.out.println(a+"\n"+b+"\n"+c);
		}
	}
}


