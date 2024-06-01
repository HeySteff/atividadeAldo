package atividadeAldo;

import java.util.Scanner;

public class ÁreaLateral {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double raio, altura, areaLateral;

		do {
			System.out.println("Digite o raio da base do cilindro");
			raio = input.nextDouble();

			if (raio <= 0) {
				System.out.println("Erro: O raio deve ser positivo");
			}
		} while (raio <= 0);

		do {
			System.out.println("Digite a altura do cilindo");
			altura = input.nextDouble();

			if (altura <= 0) {
				System.out.println("Erro: A altura deve ser positivo");
			}

		} while (altura <= 0);

		if (raio > 0 && altura > 0) {
			areaLateral = 2 * Math.PI * raio * altura;
			System.out.printf("A área lateral do cilindro é: %.2f%n", areaLateral);
		}

		input.close();

	}
}