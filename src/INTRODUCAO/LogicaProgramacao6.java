package INTRODUCAO;


import java.util.Scanner;

public class LogicaProgramacao6 {
	public static void main (String[]args) {
		double x1,y1,x2,y2,d1,d2,c1,c2,c3,d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a abscissa do ponto 1: ");
		x1=ler.nextDouble();
		System.out.print("Digite a ordenada do ponto 1: ");
		y1=ler.nextDouble();
		System.out.print("Digite a abscissa do ponto 2: ");
		x2=ler.nextDouble();
		System.out.print("Digite a ordenada do ponto 2: ");
		y2=ler.nextDouble();
		
		d1=x2-x1;
		d2=y2-y1;
		
		c1=Math.pow(d1,2);
		c2=Math.pow(d2,2);	
		c3=c1+c2;
		d=Math.sqrt(c3);
	
		System.out.println("\nA distância entre os dois pontos é igual a "+(String.format("%.2f",d))+" unidades de distância");
	}
}
