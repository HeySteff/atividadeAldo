package atividadeAldo;

import java.util.Scanner;

public class SiglasDeCusos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] siglasValidas = { "SINT", "ENF", "ADS", "PSI" };
		String[] siglasCursos = new String[5];

		int contagemTecnico = 0, contagemSuperior = 0;

		for (int i = 0; i < 5; i++) {
			boolean siglaValida;
			do {
				System.out.println("Cursos disponiveis:\nTecnicos:\nENF - Enfermagem\nSINT - Sistemas para Internet\n"
						+ "Superior:\nADS - Análise e desenvolvimento de sistemas\nPSI - Psicologia\n" + "Informe a sigla do curso "
						+ (i + 1) + ": ");
				siglasCursos[i] = in.nextLine().toUpperCase();

				siglaValida = false;
				for (String sigla : siglasValidas) {
					if (sigla.equals(siglasCursos[i])) {
						siglaValida = true;
						break;
					}
				}
				if (!siglaValida) {
					System.out.println("Curso informado invalido. Tente novamente");
				}
			} while (!siglaValida);

			if (siglasCursos[i].equals("SINT") || siglasCursos[i].equals("ENF")) {
				contagemTecnico++;
			} else {
				contagemSuperior++;
			}
		}

		System.out.println("Quantidade de cursos Tecnicos informados é de: " + contagemTecnico + " cursos Tecnicos");
		System.out.println("Quantidade de cursos Superior informados é de: " + contagemSuperior + " cursos Superior");

		in.close();
	}
}