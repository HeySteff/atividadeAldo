package JPanel;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class JPanel {

	public static void main(String[] args) {

		        // Cria o painel
		        DadoDemo dadoDemo = new DadoDemo();

		        // Cria a janela
		        JFrame frame = new JFrame("Dado Demo");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(dadoDemo);
		        frame.pack();
		        frame.setVisible(true);
	}
}