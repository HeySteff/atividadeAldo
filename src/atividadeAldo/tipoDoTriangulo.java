package atividadeAldo;

	import javax.swing.JOptionPane;
	import java.lang.Integer;

public class tipoDoTriangulo {

	public static void main(String[] args) {

		String pergunta1 = JOptionPane.showInputDialog("Informe o lado 1:");
		int a = Integer.parseInt(pergunta1);

		String pergunta2 = JOptionPane.showInputDialog("Informe o lado 2:");
		int b = Integer.parseInt(pergunta1);
		
		String pergunta3 = JOptionPane.showInputDialog("Informe o lado 3:");
		int c = Integer.parseInt(pergunta1);
		
		if (a == b || b == c || c ==a ){
			JOptionPane.showMessageDialog(null, "Isoceles");
		} else if ( a == b && b == c) {
			JOptionPane.showMessageDialog(null, "Equilatero");
		} else {
			JOptionPane.showMessageDialog(null, "Escaleno");
		}		
	}

}