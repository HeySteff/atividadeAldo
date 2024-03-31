package atividadeAldo;

	import javax.swing.JOptionPane;

public class Quinzena {

	public static void main(String[] args) {

		int diames = 0;
		
		try {
			String input = JOptionPane.showInputDialog(null, "Informe o dia do mês");
			diames = Integer.parseInt(input);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Dia invalido!!");
			System.exit(0);
		}
		
		if(diames >= 1 && diames <= 15) {
			JOptionPane.showMessageDialog(null, "Primeira quinzena do mes!!");
		} else if (diames > 15 && diames <= 31) {
			JOptionPane.showMessageDialog(null, "Segunda quinzena do mes");
		} else {
			JOptionPane.showMessageDialog(null, "Esse dia não existe no mes");
		}
	}
}