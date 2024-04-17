package atividadeAldo;

	import java.util.Scanner;

public class Média_Segunda_Chamada {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int numeroAlunos;
		double notaAluno;
		double somaNotas = 0;
		double media = 0;
		int i;
		
		System.out.println("Informe a quantidade de alunos: ");
		numeroAlunos = in.nextInt();
		
		for (i = 1; i <= numeroAlunos; i++){
			System.out.println("Informe a nota do aluno " + i + " :");
			notaAluno = in.nextDouble();
			
			somaNotas += notaAluno;
		} in.close();
		
		if (numeroAlunos > 0) {
			media = somaNotas / numeroAlunos;
			System.out.println("A media geral das notas na segunda chamada é de:" + media);
		} else {
			System.out.println("Nenhum aluno precisara fazer a segunda chamada!!");
		}
	}
}