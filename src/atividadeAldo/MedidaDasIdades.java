package atividadeAldo;

import java.util.Scanner;

public class MedidaDasIdades {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int somaDaIdade = 0;
		int idade;
		int idadeMedia;
		int contador = 0;
		int i;
		
		//Laço de repetição para receber a idade de 5 pessoas
		for ( i = 1; i <= 5; i++) {
			System.out.println("Digite a idade das pessoas: " + i + ": ");
			idade = input.nextInt();
			
			//Validação da idade: não pode ser negaativa
			while (idade <0) {
				System.out.println("Idade invalida. Digite a idade de forma correta");
				idade = input.nextInt();
			}
			somaDaIdade += idade;
			contador++;
		} 
		//Calc e exibir aa média das idades
		idadeMedia = somaDaIdade / contador;
		System.out.println("A idade média dos alunos é de: "+ idadeMedia + " anos");
	}
}