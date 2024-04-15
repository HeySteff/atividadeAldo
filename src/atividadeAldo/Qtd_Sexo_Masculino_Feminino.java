package atividadeAldo;

	import java.util.Scanner;

public class Qtd_Sexo_Masculino_Feminino {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			char sexos = ' ';
			int contadorMasculino = 0;
			int contadorFeminino = 0;
			int i;
			
			//Laço para receber o sexo de 7 pessoas
			for (i = 1; i <= 7; i++) {
				System.out.println(i+")" +"Informe 'M'para Masculino e 'F' para Feminino: ");
				sexos = input.nextLine().charAt(0);
				sexos = Character.toUpperCase(sexos);
				
				//Validando sexo: M ou F aapenas
				while (sexos != 'M' && sexos != 'F') {
					System.out.println("Sexo informado invalido. Informe 'M' para Masculino e 'F' para Feminino: ");
					sexos = input.nextLine().charAt(0);
					sexos = Character.toUpperCase(sexos);
				}
				//Contando a quantidade de cada sexo
				if (sexos == 'M') {
					contadorMasculino++;
				} else {
					contadorFeminino++;
				}
			}
			//Exibindo resultados
			System.out.println("Total de pessoas do sexo Masculino: " + contadorMasculino);
			System.out.println("Total de pessoas do sexo Femenino: " + contadorFeminino);
			
			input.close();
		}
	}
}
