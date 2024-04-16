package atividadeAldo;

	import java.util.Scanner;

public class MaiorPeso {

	public static void main(String[] args) {
		
		double peso;
		int indicePessoa = -1;
		double pessoaMaisPesada = 0;
		int i;
		
		try (Scanner input = new Scanner (System.in)){
			
			for (i = 1; i <= 4; i++) {
				System.out.printf("Infrome o pesso da pessoa %d: ",i );
				peso = input.nextDouble();
				
				while (peso <= 0) {
					System.out.println("Peso invalido, informe o pesso de novo:");
					peso = input.nextDouble();
				}	
				if (peso > pessoaMaisPesada) {
					pessoaMaisPesada = peso;
					indicePessoa = i;
				}
			}
			if(indicePessoa != -1) {
				System.out.printf("a pessoa com mais peso é %d com peso de %.2f",indicePessoa, pessoaMaisPesada);
			} 
		}
	}
}