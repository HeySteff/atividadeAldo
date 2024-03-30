package atividadeAldo;

	import javax.swing.JOptionPane;

public class VotoObrigatorio {

	public static void main(String[] args) {
		/*Escreva um programa para receber a idade de uma pessoa. Informar quando a pessoa é obrigado a votar.

		Obs: Voto obrigatório de 18 a 69 anos*/
		int idade = 0;
		
		try {
			String input = JOptionPane.showInputDialog(null, "informe sua idade");
			idade = Integer.parseInt(input);
		} catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Idade informada errada");
			System.exit(0);
		}
		
		if (idade >= 18 && idade <= 69) {
			JOptionPane.showMessageDialog(null, "Já pode votar, vá votar!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Não precisa votar, grande dia.");
		}
}
}