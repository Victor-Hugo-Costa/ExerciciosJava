package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao2 {
	public static void main (String[]args) {
		double idade, meses, dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos dias de vida voc� tem? ");
		dias=ler.nextDouble();
		
		meses=dias/(365/12);
		idade=meses/12;
	
		System.out.println("\nVoc� tem: "+idade+" anos de idade");
		System.out.println("\nVoc� tem: "+meses+" meses de vida");
		System.out.println("\nVoc� tem: "+dias+" dias de vida");	
	}
}
