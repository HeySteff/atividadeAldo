package atividadeAldo;

import java.util.Scanner;

public class ComparaçãoComMAR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nome;
		int i, antesMar = 0, igualMar = 0, depoisMar = 0, comparacao;

		for (i = 1; i <= 5; i++) {
			System.out.print("Informe a palavra " + i + ": ");
			nome = in.nextLine().toUpperCase();

			comparacao = nome.compareTo("MAR");
			if (comparacao < 0) {
				antesMar++;
			} else if (comparacao == 0) {
				igualMar++;
			} else {
				depoisMar++;
			}
		}

		System.out.println("Quantidade de palavras que precedem a palavra MAR: " + antesMar);
		System.out.println("Quantidade de palavras que coincidem a palavra MAR: " + igualMar);
		System.out.println("Quantidade de palavras que sucedem a palavra MAR: " + depoisMar);
	}
}