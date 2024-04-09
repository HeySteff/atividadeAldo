package atividadeAldo;

	import javax.swing.JOptionPane;

public class ContribuicaoSindical {

	public static void main(String[] args) {
			
		// Definir o salário mínimo
		final double SALARIO_MINIMO = 1412;

		// Obter o salário bruto do usuário
		double salarioBruto = 0.0;
		do {
		    String input = JOptionPane.showInputDialog(null, "Informe seu salário: ");
		    try {
		        salarioBruto = Double.parseDouble(input);
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Erro ao converter o valor do salário. Insira um valor numérico válido.");
		        System.exit(1);
		    }
		    if (salarioBruto < SALARIO_MINIMO) {
		        JOptionPane.showMessageDialog(null, "O salário não pode ser menor que o valor do salário mínimo!!");
		    }
		} while (salarioBruto < SALARIO_MINIMO);

		// Obter o tipo de contribuição sindical
		int tipoContribuicao = 0;
		do {
		    String input = JOptionPane.showInputDialog(null, "Digite o tipo de contribuição sindical: 0 Para Não contribuente 1 para contribuente");
		    try {
		        tipoContribuicao = Integer.parseInt(input);
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Erro ao converter o tipo de contribuição sindical. Insira um valor numérico válido (0 ou 1).");
		        System.exit(1);
		    }
		    if (tipoContribuicao != 0 && tipoContribuicao != 1) {
		        JOptionPane.showMessageDialog(null, "Valor inválido, informe novamente");
		    }
		} while (tipoContribuicao != 0 && tipoContribuicao != 1);

		// Calcular a contribuição sindical
		double valorContriSindical = 0.0;
		if (tipoContribuicao == 1) {
		    double taxaContribuicaoSindical = 0.01; // Insira a taxa de contribuição sindical correta para a categoria do funcionário
		    valorContriSindical = salarioBruto * taxaContribuicaoSindical;
		}
	}
}