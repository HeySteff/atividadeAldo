package atividadeAldo;

	import javax.swing.JOptionPane;

public class Semaforo {

	public static void main(String[] args) {
		
		int semaforo = 0;
		
		try {
			String input = JOptionPane.showInputDialog(null, "Informe a cor do semaforo:\n 1 - Para Verde\n 2 - Para Amarelo\n 3 - Vermelho");
				semaforo = Integer.parseInt(input);
				
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor informado errado!!");
			System.exit(0);
		}
		
		if (semaforo == 2 || semaforo == 3) {
			JOptionPane.showMessageDialog(null, "Pare!!");
		}
	}
}