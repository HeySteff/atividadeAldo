package atividadeAldo;

import java.util.Scanner;

public class Potência_Elétrica {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double tensao, resistencia, potenciaEltrica;

		do {
			System.out.println("Informe a tensão (em Volts)");
			tensao = in.nextDouble();

			if (tensao <= 0) {
				System.out.println("Tensão informada errada, informe novamente");
			}

		} while (tensao <= 0);

		do {
			System.out.println("Informe a resistenciaa (em OHMS) ");
			resistencia = in.nextDouble();

			if (resistencia <= 0) {
				System.out.println("Resistencia informada errada, informe novamente");
			}

		} while (resistencia <= 0);
		
		potenciaEltrica = Math.pow(tensao, 2) / resistencia ;

		System.out.println("kksdk: " + potenciaEltrica);
	}
}