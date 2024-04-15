package atividadeAldo;

import java.util.Scanner;

public class MédiaIdade {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int somaDaIdade = 0;
		int idade;
		int idadeMedia;
		int contador = 0;
		int i;
		
		
		for ( i = 1; i <= 5; i++) {
			System.out.println("Digite a idade das pessoas: " + i + ": ");
			idade = input.nextInt();
			
			while (idade <0) {
				System.out.println("Idadee invalida. Digite a idade de forma correta");
				idade = input.nextInt();
			}
			somaDaIdade += idade;
			contador++;
			
		} 
		idadeMedia = somaDaIdade / contador;
		System.out.println("adsadsdas:"+ idadeMedia);
	}
}