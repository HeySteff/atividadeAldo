package atividadeAldo;

	import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		int idade;
		
        System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("O voto é opcional para voce");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("O voto é obrigatório para voce");
        } else {
        	System.out.println("O voto é opcional para voce");
        }
        scanner.close();
	}
}