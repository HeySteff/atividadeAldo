package atividadeAldo;

import java.util.Scanner;

public class Validacao_De_Matricula {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String matricula, matriculaAluno, anoAluno, nomeCurso, curso;
		char semestre;

		do {

			System.out.println("informe a matricula Exemplo(CAAAA.S.99999)");
			matricula = in.nextLine().toUpperCase();

			if (matricula.length() != 13) {

				System.out.println("Matricula informada errada");
			}

			curso = matricula.substring(0, 1);
			if (!curso.equals("A") && !curso.equals("B") && !curso.equals("C")) {
				System.out.println("Letra do curso informado errado, use o Exemplo:(CAAAA.S.99999)");
			}

			semestre = matricula.charAt(6);
			if (semestre != '1' && semestre != '2') {
				System.out.println("Semestre do curso informado errado, use o Exemplo:(CAAAA.S.99999)");
			}

			if (matricula.charAt(5) != '.' || matricula.charAt(7) != '.') {
				System.out.println("Os pontos (.) não estão na posição correta, use o Exemplo:(CAAAA.S.99999)");
			}

		} while (matricula.length() != 13 || !curso.equals("A") && !curso.equals("B") && !curso.equals("C")
				|| semestre != '1' && semestre != '2' || matricula.charAt(5) != '.' || matricula.charAt(7) != '.');

		if (curso.equals("A")) {
			nomeCurso = "Administração";
		} else if (curso.equals("B")) {
			nomeCurso = "Direito";
		} else {
			nomeCurso = "Nutrição";
		}
		matriculaAluno = matricula.substring(8);
		anoAluno = matricula.substring(1, 5);

		System.out.printf("Aluno %s do curso de %s, matrícula do ano %s do %sº semestre%n", matriculaAluno, nomeCurso,
				anoAluno, semestre);

		// in.close();
	}
}