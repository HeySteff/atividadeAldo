package atividadeAldo;

import java.util.Scanner;

import javax.security.auth.login.AccountLockedException;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double VALOR_LOCAÇÃO = 1000, ACRESCIMO = 100;
		final int LIMITE_MORADORES = 3;
		double valorTotal = 0, valorMedio = 0, valorFinal = 0, valorRentado = 0, valorTotal2 = 0;
		char letraKitnet;
		int moradores = 0;

		for (int i = 0; i <= 3; i++) {

			do {
				System.out.print(
						"\n--------------------------------------------\nDigite a letra do Kitnet entre [A,B,C,D]: ");
				letraKitnet = input.next().charAt(0);
				letraKitnet = Character.toUpperCase(letraKitnet);
				if (letraKitnet != 'A' && letraKitnet != 'B' && letraKitnet != 'C' && letraKitnet != 'D') {
					System.out.println("Digito errado !  digite entre [A,B,C ou D] ");
				}

			} while (letraKitnet != 'A' && letraKitnet != 'B' && letraKitnet != 'C' && letraKitnet != 'D');

			do {
				System.out.print(
						"Valor de locação R$1000 para até 3 moradores.\nCada morador a mais será acrescentado R$100. \n--------------------------------------------\nDigite a quantidade de moradores: ");
				moradores = input.nextInt();

			} while (moradores < 0 || moradores > 6);

			if (moradores < 0 || moradores > 6) {
				System.out.println("\n!INVALIDO, SÓ PODE TER ATÉ 6 MORADORES. !\n");
			}

			else if (moradores == 0) {
				System.out.println("Locação [" + letraKitnet + "]: disponivel\nNumero de moradores:0");
			}

			else if (moradores > 3) {
				valorTotal = (moradores - LIMITE_MORADORES) * ACRESCIMO;
				System.out.println(
						"O valor da Locação do kitnet [" + letraKitnet + "] é: R$" + (valorTotal + VALOR_LOCAÇÃO));
			} else {
				System.out.println("Valor de Locação do kitnet [" + letraKitnet + "] é: R$" + VALOR_LOCAÇÃO);
			}

			valorTotal2 += valorTotal;
			valorRentado++;
		}
		valorMedio = valorTotal2 / valorRentado;
		System.out.println("total: " + valorTotal2);
		System.out.println("medio: " + valorMedio);
	}
}
