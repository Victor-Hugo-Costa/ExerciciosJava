package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao5 {
	public static void main (String[]args) {
		int p1=2, p2=3, p3=5;	
		double n1, n2, n3,nf1,nf2,nf3,m;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		n1=ler.nextDouble();
		System.out.print("Digite a nota 2: ");
		n2=ler.nextDouble();
		System.out.print("Digite a nota 3: ");
		n3=ler.nextDouble();
	
		nf1=(n1*p1);
		nf2=(n2*p2);
		nf3=(n3*p3);
		m=(nf1+nf2+nf3)/(p1+p2+p3);
		
		System.out.println("\nA média final é igual a "+m);	
	}
}
