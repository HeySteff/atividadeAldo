package atividadeAldo;

import java.util.Scanner;

public class Consumo_de_energia {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Variaveis para contagem de imóveis
        int contaResidencial = 0;
        int contaComercial = 0;
        int contaIndustrial = 0;

        // Variaveis para totalização das contas
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;

        // Variaveis para cada imóvel
        String tipoImovel;
        double vlrAnterior;
        double vlrAtual;
        double consumoEnergia;
        double vlrConta;
        double vlrKWh = 0;

        // Looping para processar os 4 imóveis
        for (int i = 1; i <= 4; i++) {
            System.out.println("\n== Imóvel " + i + " ==");

            // Tipos do imoveis
            do {
                System.out.print("Tipo do imóvel (R para Residencial - C para Comercial - I para Industrial): ");
                tipoImovel = sc.nextLine().toUpperCase();
            } while (!tipoImovel.equals("R") && !tipoImovel.equals("C") && !tipoImovel.equals("I"));

            // Valor anterior do medidor
            do {
                System.out.print("Valor anterior do medidor: ");
                vlrAnterior = sc.nextDouble();
            } while (vlrAnterior <= 0);

            // Valor atual do medidor
            do {
                System.out.print("Valor atual do medidor: ");
                vlrAtual = sc.nextDouble();
            } while (vlrAtual <= vlrAnterior);

            // Cálculo do consumo de energia
            consumoEnergia = vlrAtual - vlrAnterior;

// 			   Cálculo do valor da conta de energia
//            switch (tipoImovel) {
//                case "R":
//                    vlrKWh = 0.50;
//                    break;
//                case "C":
//                	vlrKWh = 0.70;
//                    break;
//                case "I":
//                	vlrKWh = 0.40;
//                    break;
//                default:
//                	vlrKWh = 0; // Valor default para caso haja algum erro
//            }
            
            if (tipoImovel.equals("R")) {
            	vlrKWh = 0.50;
            } else if (tipoImovel.equals("C")) {
            	vlrKWh = 0.70;
            } else if (tipoImovel.equals("I")) {
            	vlrKWh = 0.40;
            } else {
                // Tratar erro caso o tipo de imóvel seja inválido
            }


            vlrConta = consumoEnergia * vlrKWh;

            // Exibir o resumo para o imóvel atual
            System.out.println("\nTipo do imóvel: " + tipoImovel);
            System.out.println("Consumo de energia: " + consumoEnergia + " kWh");
            System.out.println("Valor da conta: R$ " + String.format("%.2f", vlrConta));

            // Atualizar as Variaveis de contagem e totalização
            switch (tipoImovel) {
                case "R":
                    contaResidencial++;
                    totalResidencial += vlrConta;
                    break;
                case "C":
                    contaComercial++;
                    totalComercial += vlrConta;
                    break;
                case "I":
                    contaIndustrial++;
                    totalIndustrial += vlrConta;
                    break;
            }
//            if (tipoImovel == "R") {
//            	contaResidencial++;
//            	totalResidencial += vlrConta;
//            } else if (tipoImovel == "C") {
//            	contaComercial++;
//            	totalComercial += vlrConta;
//            } else if (tipoImovel == "I") {
//            	contaIndustrial++;
//            	totalIndustrial += vlrConta;
//            }
            }
        
        // Exibir o resumo final
        System.out.println("\n== Resumo Final ==");
        System.out.println("Residencial: " + contaResidencial + " imóveis - R$ " + String.format("%.2f", totalResidencial));
        System.out.println("Comercial: " + contaComercial + " imóveis - R$ " + String.format("%.2f", totalComercial));
        System.out.println("Industrial: " + contaIndustrial + " imóveis - R$ " + String.format("%.2f", totalIndustrial));
        System.out.println("Total: " + (contaResidencial + contaComercial + contaIndustrial) + " imóveis - R$ " +
                String.format("%.2f", totalResidencial + totalComercial + totalIndustrial));
	}
}