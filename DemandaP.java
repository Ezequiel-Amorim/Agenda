import java.util.Scanner;
import java.util.Random;

public class DemandaP {
    public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		Random sorteio = new Random();
		//Nome
		System.out.println("Cadastre um nome :");
		String name = sc.nextLine();
		//Gerando um CPF
		int cpf = sorteio.nextInt(1000000000); //os 9 números do cpf
        int dd = sorteio.nextInt(100);
		//UF
		System.out.println("Informe sua UF :");
		String uf = sc.nextLine();
		//telefone
		int cell = 11 + sorteio.nextInt(89);
		int pref = 90000 + sorteio.nextInt(10000);
		int suf  = sorteio.nextInt(10000);

		//Exibir
		System.out.println("\nInformações:");
		System.out.println("Nome :" + name);
		System.out.printf("CPF : %d-%d\n" , cpf , dd);
		System.out.println("UF :" + uf);
		System.out.printf("Telefone :(%d) %d-%04d\n" , cell , pref , suf );

		sc.close();
	}	
}
