package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao3 {
	public static void main (String[]args) {
		double segundos,minutos,horas;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a dura��o da produ��o em segundos: ");
		segundos=ler.nextDouble();
		
		minutos=segundos/60;
		horas=(minutos/60);
		
		System.out.println("\nA produ��o teve dura��o de "+minutos+" minutos");
		System.out.println("\nA produ��o teve dura��o de "+horas+" horas");
}
}
