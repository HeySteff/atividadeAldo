package atividadeAldo;

	import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ContribuicaoSindical_JOptionPane {

	public static void main(String[] args) {
			
		// Definindo o salario
		final double SALARIO_MINIMO = 1412;

		// Obetendo salaario bruto do funcionario
		double salarioBruto = 0.0;
		do {
		    String input = JOptionPane.showInputDialog(null, "Informe seu salário: ");
		    try {
		        salarioBruto = Double.parseDouble(input);
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Erro ao converter o valor do salário. Insira um valor numérico válido.");
		    }
		    if (salarioBruto < SALARIO_MINIMO) {
		        JOptionPane.showMessageDialog(null, "O salário não pode ser menor que o valor do salário mínimo!!");
		    }
		} while (salarioBruto < SALARIO_MINIMO);

		// Adquirindo informação do tipo da contribuição sindical
		int tipoContribuicao = 0;
		do {
		    String input = JOptionPane.showInputDialog(null, "Digite o tipo de contribuição sindical: 0 Para Não contribuente 1 para contribuente");
		    try {
		        tipoContribuicao = Integer.parseInt(input);
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Erro ao converter o tipo de contribuição sindical. Insira um valor numérico válido (0 ou 1).");
		    }
		    if (tipoContribuicao != 0 && tipoContribuicao != 1) {
		        JOptionPane.showMessageDialog(null, "Valor inválido, informe novamente");
		    }
		} while (tipoContribuicao != 0 && tipoContribuicao != 1);

		// Calculando a contribuição sindical
		double valorContriSindical = 0.0;
		if (tipoContribuicao == 1) {
		    double taxaContribuicaoSindical = 30; // Informando a taxa de contribuição sindical correta para a categoria do funcionário
		    valorContriSindical = salarioBruto / taxaContribuicaoSindical;
		   } 
		
			double valorLiquido = salarioBruto - valorContriSindical;		   
			DecimalFormat formatador = new DecimalFormat("0.00");
		    String valorLiquido_Formatado = formatador.format(valorLiquido);
		    String valorSindical_Formatado = formatador.format(valorContriSindical);
		    
		    
		    JOptionPane.showMessageDialog(null,"A contribuição sindical é no valor de: R$ " + valorSindical_Formatado + " Reais"+ "\nSalário líquido: R$ " + valorLiquido_Formatado + " Reais");
	}
	
}