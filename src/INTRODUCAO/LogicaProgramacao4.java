package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao4 {
	public static void main (String[]args) {
		int A,B,C; 
		double D,R,S;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A=(int) ler.nextDouble();
		System.out.print("Digite o valor de B: ");
		B=(int) ler.nextDouble();
		System.out.print("Digite o valor de C: ");
		C=(int) ler.nextDouble();
		
		R=(A+B)*(A+B);
		S=(B+C)*(B+C);
		D=(R+S)/2;
		
		System.out.println("\nO resultado da expressão é: "+D);		
	}
}
