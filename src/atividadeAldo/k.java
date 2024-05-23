package atividadeAldo;

import java.util.Scanner;

public class k {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] siglasValidas = { "SINT", "ENF", "ADS", "PSI" };
		String[] siglasCursos = new String[5];

		int tecnicos = 0, superiores = 0;

		// Leitura e validação das siglas
		for (int i = 0; i < 5; i++) {
			boolean siglaValida;
			do {
				System.out.print("Digite a sigla do curso " + (i + 1) + ": ");
				siglasCursos[i] = scanner.nextLine().toUpperCase();

				// Verifica se a sigla é válida
				siglaValida = false;
				for (String sigla : siglasValidas) {
					if (sigla.equals(siglasCursos[i])) {
						siglaValida = true;
						break;
					}
				}

				if (!siglaValida) {
					System.out.println("Sigla inválida. Digite novamente.");
				}
			} while (!siglaValida); // O laço continua enquanto a sigla for inválida

			// Contagem de cursos técnicos e superiores
			if (siglasCursos[i].equals("SINT") || siglasCursos[i].equals("ENF")) {
				tecnicos++;
			} else {
				superiores++;
			}
		}

		// Exibição dos resultados
		System.out.println("\nQuantidade de cursos técnicos: " + tecnicos);
		System.out.println("Quantidade de cursos superiores: " + superiores);

		scanner.close();
	}
}
