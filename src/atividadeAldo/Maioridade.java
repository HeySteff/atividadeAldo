package atividadeAldo;

import javax.swing.JOptionPane;

public class Maioridade {

	public static void main(String[] args) {
		
		int idade = 0;
		
		try {
			String input = JOptionPane.showInputDialog(null, "Informe sua idade");
			idade = Integer.parseInt(input);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "idade informada está incorreta");
			System.exit(0);
		}
		
		if(idade >= 18 && idade <= 69) {
			JOptionPane.showMessageDialog(null, "Voce é de maior");
		} else {
			JOptionPane.showMessageDialog(null, "Você é de menor");
		}
	}
}