package atividadeAldo;

import java.util.Scanner;

public class ValorFrete {
	public static void main (String[]args) {

		Scanner in = new Scanner (System.in);
		final double VALORPESO= 3.00;
		final double VALORTAXALOCAL = 10.00;
		double taxaDeslocamento = 0.00;
		double pesoEncomenda,frete;
		char tipoTransporte= ' ';
		
		
		System.out.println("Informe o peso da encomenda:");
		pesoEncomenda = in.nextDouble();
//		in.nextLine();
		
		do {
		System.out.printf("Informe o tipo de deslocamento \n L - Local\n E - Estadual\n I - Interestadual\n");
		tipoTransporte = in.next().charAt(0);
		tipoTransporte = Character.toUpperCase(tipoTransporte);
		if (tipoTransporte == 'L' || tipoTransporte == ('E') || tipoTransporte == ('I')){
			break;
		}
		System.out.println("tipo incorreto");
		}while (true);
		
		if (tipoTransporte ==('L')) {
			taxaDeslocamento = VALORTAXALOCAL;
		} else if (tipoTransporte == ('E')) {
			taxaDeslocamento = 0.8 * VALORTAXALOCAL;
		} else if (tipoTransporte == ('I')) {
			taxaDeslocamento = 1.5 * VALORTAXALOCAL;
		}
	
		frete = VALORPESO * pesoEncomenda + taxaDeslocamento;
		
		System.out.println("O valor do frete ficou de: R$"+frete);
	}
}