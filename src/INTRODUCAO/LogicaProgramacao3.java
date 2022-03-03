package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao3 {
	public static void main (String[]args) {
		double segundos,minutos,horas;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a duração da produção em segundos: ");
		segundos=ler.nextDouble();
		
		minutos=segundos/60;
		horas=(minutos/60);
		
		System.out.println("\nA produção teve duração de "+minutos+" minutos");
		System.out.println("\nA produção teve duração de "+horas+" horas");
}
}
