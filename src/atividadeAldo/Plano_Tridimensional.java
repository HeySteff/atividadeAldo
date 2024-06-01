package atividadeAldo;

import java.util.Scanner;

public class Plano_Tridimensional {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double x, y, z, distanciaQuadrado, distancia;

		do {
			System.out.println("Informe o valor de X ");
			x = in.nextDouble();

			if (x == 0) {
				System.out.println("valor de X informado errado, digite novamente:");
			}

		} while (x <= 0);

		do {
			System.out.println("Informe o valor de Y ");
			y = in.nextDouble();

			if (y == 0) {
				System.out.println("valor de Y informado errado, digite novamente:");
			}

		} while (y <= 0);
		
		do {
			System.out.println("Informe o valor de Z ");
			z = in.nextDouble();

			if (z == 0) {
				System.out.println("valor de Z informado errado, digite novamente:");
			}

		} while (z <= 0);
		
		distanciaQuadrado = x * x * y * y * z * z;
		distancia = Math.sqrt(distanciaQuadrado);
		
		System.out.println(distancia);
		
	}
}