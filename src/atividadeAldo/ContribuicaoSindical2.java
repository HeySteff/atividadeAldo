package atividadeAldo;

	import java.util.Scanner;

public class ContribuicaoSindical2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        final double SALARIOMINIMO = 1412.00;

        double salarioBruto = 0.0;
        int tipoContribuicao = -1;

        do {
            System.out.print("Digite seu salário bruto: ");
            salarioBruto = scanner.nextDouble();
            if (salarioBruto < SALARIOMINIMO) {
                System.err.println("Salário bruto inválido! Deve ser igual ou superior ao salário mínimo (" + SALARIOMINIMO + ").");
            }
        } while (salarioBruto < SALARIOMINIMO);

        do {
            System.out.print("Digite o tipo de contribuição sindical (0 - não contribuinte, 1 - contribuinte): ");
            tipoContribuicao = scanner.nextInt();
            if (tipoContribuicao != 0 && tipoContribuicao != 1) {
                System.err.println("Tipo de contribuição sindical inválido! Deve ser 0 ou 1.");
            }
        } while (tipoContribuicao != 0 && tipoContribuicao != 1);

        double valorContribuicaoSindical = 0;
        if (tipoContribuicao == 1) {
            valorContribuicaoSindical = salarioBruto / 30.0;
        }

        double salarioLiquido = salarioBruto - valorContribuicaoSindical;

       
        System.out.println("Valor da contribuição sindical: R$" + String.format("%.2f", valorContribuicaoSindical));
        System.out.println("Salário líquido: R$" + String.format("%.2f", salarioLiquido));
        
        scanner.close();
    }
}