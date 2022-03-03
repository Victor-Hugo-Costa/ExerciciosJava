package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao7 {
	public static void main (String[]args) {
		double a,b,c,d,ee,f,x,y;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de 'a': ");
		a=ler.nextDouble();
		System.out.print("Digite o valor de 'b': ");
		b=ler.nextDouble();
		System.out.print("Digite o valor de 'c': ");
		c=ler.nextDouble();
		System.out.print("Digite o valor de 'd': ");
		d=ler.nextDouble();
		System.out.print("Digite o valor de 'e': ");
		ee=ler.nextDouble();
		System.out.print("Digite o valor de 'f': ");
		f=ler.nextDouble();
		
		x=((c*ee)-(b*f))/((a*ee)-(b*d));
		y=((a*f)-(c*d))/((a*ee)-(b*d));
		
		System.out.println("\nO x vale: "+x);
		System.out.println("\nO y vale: "+y);
	}
}
