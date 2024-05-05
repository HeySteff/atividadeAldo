package atividadeAldo;

import java.util.Scanner;

public class PersonagemVencedora {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int p1 = 10;
		int p2 = 10;
		int vencedor = 0;
		int numJogador;
		
		for (int i = 0; i < 3; i++ ) {
			System.out.printf("Informe o numero do jogador que aplicou o golpe: \n 1 - Para jogador 1 \n 2 - Para jogador 2 ");
			numJogador = in.nextInt();
			
			if(numJogador == 1) {
				p1++;
				p2 -= +2;
			}else if (numJogador == 2) {
				p2++;
				p1 -= +2;
			}
		}
		if (p1 > p2 ) {
			vencedor = 1;
		} else if (p2 > p1) {
			vencedor = 2;
		}
		
		System.out.println("O jogador vencedor foi o: " + vencedor);
		System.out.println("Total de pontos do jogador 1 é de :" + p1);
		System.out.println("Total de pontos do jogador 2 é de :" + p2);
	}
}