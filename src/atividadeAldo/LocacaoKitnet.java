package atividadeAldo;

import java.util.Scanner;

public class LocacaoKitnet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final double ACRESCIMO = 100;
		final double ALOCACAO = 1000;
		final int MAXIMO_MORADORES = 6;
		char kitnet = ' ';
		int qtdMoradores;
		double vlrAluguel = 0, vlrTotal = 0, vlrMedio = 0, rentabilidade = 0;
		int moradoresExercido;

		for (int i = 0; i < 4; i++) {
			do {
				System.out.println("Informe qual Kitnet voce deseja alugar: \n A - Para o kitnet A\n B - Para o kitnet B"
								+ "\n C - Para o kitnet C\n D - Para o Kitnet D");
				kitnet = in.next().charAt(0);
				kitnet = Character.toUpperCase(kitnet);

			} while (kitnet != 'A' && kitnet != 'B' && kitnet != 'C' && kitnet != 'D');

			do {
				System.out.println(
						"O valor da locação é de R$ 1000,00 para até 3 pessoas por kitnet com limite maximo de 6 moradores");
				System.out.println("Informe a Quantidade de moradores na casa: " + kitnet);
				qtdMoradores = in.nextInt();

			} while (qtdMoradores < 0 || qtdMoradores > MAXIMO_MORADORES);

			if (qtdMoradores == 0) {
				System.out.println("Kitnet " + kitnet + " está desocupado");
			} else {
				vlrAluguel = ALOCACAO;

				if (qtdMoradores > 3) {
					moradoresExercido = qtdMoradores - 3;
					if (moradoresExercido > MAXIMO_MORADORES - 3) {
						moradoresExercido = MAXIMO_MORADORES - 3;
					}
					vlrAluguel += moradoresExercido * ACRESCIMO;
				}
				System.out.println("------------------------");
				System.out.println("\nKitnet: " + kitnet);
				System.out.println("Quantidade de Moradores: " + qtdMoradores);
				System.out.printf("Valor do Aluguel: R$ %.2f\n", vlrAluguel);
				System.out.println("------------------------");

				vlrTotal += vlrAluguel;
				rentabilidade++;
			}
		}
		vlrMedio = vlrTotal / rentabilidade;

		System.out.printf("Valor total do Aluguel: R$ %.2f\n", vlrTotal);
		System.out.printf("Valor total do Aluguel: R$ %.2f\n", vlrMedio);
	}
}