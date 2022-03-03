package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao1 {
	public static void main (String[]args) {
	double idade, meses, dias;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Qual a sua idade? ");
	idade=ler.nextDouble();
	
	meses=idade*12;
	dias=meses*(365/12);
	
	System.out.println("Você tem: "+dias+" dias de vida");
	}
}
