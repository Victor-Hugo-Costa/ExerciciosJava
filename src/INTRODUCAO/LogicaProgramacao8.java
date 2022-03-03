package INTRODUCAO;

import java.util.Scanner;

public class LogicaProgramacao8 {
	public static void main (String[]args) {
		double cp,cf,i,d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o custo de fabricação do carro: ");
		cp=ler.nextDouble();
		
		i=cp*0.28;
		d=cp*0.45;
		
		cf=i+d+cp;
		
		System.out.println("\nO custo final do carro é de "+cf+(" reais"));
	}
}
