package atividadeAldo;

import java.util.Scanner;

public class TipoVacinas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final int QTDVACINABASE = 100, VACINA1 = 50, VACINA2 = 60, VACINA3 = 70;
		int tipoVacina;
		int quantidadeAplicada;
		double vlrTotal = 0;
		double valorRecebido = 0;

		for (int i = 0; i < 3; i++) {
			do {
				System.out.print("Informe o tipo de vacina [1] [2] [3]\n");
				tipoVacina = input.nextInt();
			} while (tipoVacina != 1 && tipoVacina != 2 && tipoVacina != 3);

			System.out.print("Informe a quantidade aplicada: ");
			quantidadeAplicada = input.nextInt();

			if (tipoVacina == 1) {
				valorRecebido = (quantidadeAplicada / QTDVACINABASE) * VACINA1;
			} else if (tipoVacina == 2) {
				valorRecebido = (quantidadeAplicada / QTDVACINABASE) * VACINA2;
			} else if (tipoVacina == 3) {
				valorRecebido = (quantidadeAplicada / QTDVACINABASE) * VACINA3;
			}

			System.out.println("valor do repasse " + valorRecebido);
			System.out.print("------------------------------\n");

			vlrTotal += valorRecebido;
		}
		System.out.printf("Total do repasse: R$%.2f", vlrTotal);
	}
}