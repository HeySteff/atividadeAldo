package atividadeAldo;

	import java.util.Scanner;

public class Pares_X_Impares {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int numeros;
		int numPares = 0;
		int numImpares = 0;
		int i;
		
		for (i = 0; i <= 6; i++) {
			System.out.println("Informe o numero " + i);
			numeros = in.nextInt();
			
			if (numeros % 2 == 0) {
				numPares++;
			} else {
				numImpares++;
			}
		}
		in.close();
		
		if (numPares > numImpares) {
			System.out.println("Foram informados mais numeros pares");
		} else if (numPares < numImpares) {
			System.out.println("Foram informados mais numeros impares");
		}else {
			System.out.println("Foram informados a mesma quantidade de Impares e Pares");
		}
	}

}
