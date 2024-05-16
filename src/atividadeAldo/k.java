package atividadeAldo;

import java.util.Scanner;

public class k{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double ACRESCIMO = 100;
        final double VALOR_BASE = 1000;
        final int MAX_MORADORES = 6;
        char kitnet;
        int kitnetsOcupadas = 0;
		int qtdMoradores = 0;
        double valorTotalAluguel = 0;
        double aluguelMedio = 0;

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Informe qual Kitnet você deseja alugar: \n A - Kitnet A\n B - Kitnet B"
                        + "\n C - Kitnet C\n D - Kitnet D");
                kitnet = in.next().charAt(0);
                kitnet = Character.toUpperCase(kitnet);

            } while (kitnet != 'A' && kitnet != 'B' && kitnet != 'C' && kitnet != 'D');

            do {
                System.out.println(
                        "O valor do aluguel é de R$ 1000,00 para até 3 moradores por kitnet com limite máximo de 6 moradores");
                System.out.println("Informe a Quantidade de moradores na kitnet: " + kitnet);
                int moradores = in.nextInt();

                if (moradores == 0) {
                    System.out.println("Kitnet " + kitnet + " está desocupada");
                } else {
                    double aluguel = VALOR_BASE;

                    if (moradores > 3) {
                        int moradoresExcedentes = Math.min(moradores - 3, MAX_MORADORES - 3);
                        aluguel += moradoresExcedentes * ACRESCIMO;
                    }

                    System.out.println("------------------------");
                    System.out.println("\nKitnet: " + kitnet);
                    System.out.println("Quantidade de Moradores: " + moradores);
                    System.out.printf("Valor do Aluguel: R$ %.2f\n", aluguel);
                    System.out.println("------------------------");

                    valorTotalAluguel += aluguel;
                    kitnetsOcupadas++;
                }

            } while (qtdMoradores < 0 || qtdMoradores > MAX_MORADORES);
        }

        if (kitnetsOcupadas > 0) {
            aluguelMedio = valorTotalAluguel / kitnetsOcupadas;
        } else {
            aluguelMedio = 0;
        }

        System.out.printf("Valor total do Aluguel: R$ %.2f\n", valorTotalAluguel);
        System.out.printf("Valor médio do Aluguel: R$ %.2f\n", aluguelMedio);
    }
}
