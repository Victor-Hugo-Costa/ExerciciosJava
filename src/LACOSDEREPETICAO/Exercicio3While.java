package LACOSDEREPETICAO;

import java.util.Scanner;

public class Exercicio3While {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        int idade = 0, menor = 0, maior = 0;

        while (idade != -99) {
            System.out.println("Digite uma idade: ");
            idade = ler.nextInt();

            if(idade > 0 && idade < 21) {
                menor++;
                System.out.println("\nMenos de 21 anos\n");
            }
                else if(idade > 50) {
                    maior++;
                    System.out.println("\nMais de 50 anos\n");
                }
                else {
                    System.out.println("\nFora da contagem!!!\n");
                }

        }
            System.out.println("\nQuantidade de pessoas com menos de 21 anos: " + menor);
            System.out.println("\nQuantidade de pessoas com mais de 50 anos: " + maior);
    }

}

