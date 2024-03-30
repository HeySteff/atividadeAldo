package atividadeAldo;

	import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		double altura = 0;
		double peso = 0;
		double imc;
		
		try {
			String input = JOptionPane.showInputDialog(null, "Informe sua altura:");
			altura = Double.parseDouble(input);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Altura esta errada!");
			System.exit(0);
		}
		
		try {
			String input = JOptionPane.showInputDialog(null, "Informe seu peso");
			peso = Double.parseDouble(input);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Peso está errado");
			System.exit(0);
		}
		
		imc = peso / (altura * altura);
		
		if (imc >= 30) {
			JOptionPane.showMessageDialog(null, "Procura um endocrinologista");
		} else {
            String mensagemIMC = String.format("Seu IMC é de: %.2f", imc);
			JOptionPane.showMessageDialog(null, mensagemIMC);
		}
	}
}