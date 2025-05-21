import java.util.Random;
import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random sorteio = new Random();

		// Cadastro de nome
		System.out.print("Cadastro de nome: ");
		String name = sc.nextLine();

		// Gerando DDD (entre 11 e 99)
		int ddd = 11 + sorteio.nextInt(89);

		// Gerando número no formato 9XXXX-XXXX
		int prefixo = 90000 + sorteio.nextInt(10000); // Garante que começa com 9
		int sufixo = sorteio.nextInt(10000); // Últimos 4 dígitos

		// Exibição das informações cadastradas
		System.out.println("\nInformações:");
		System.out.println("Nome: " + name);
		System.out.printf("Número: (%d) %d-%04d\n", ddd, prefixo, sufixo);

		sc.close();
	}
}
