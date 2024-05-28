package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Agência !");
		int numero = Scanner.nextInt();
		
		System.out.println("Por favor, digite o nome da Agência !");
		String agencia = Scanner.next();
		
		System.out.println("Por favor, digite o nome do Cliente !");
		String nomeCliente = Scanner.next();
		
		System.out.println("Por favor, digite o saldo da conta !");
		float saldo = Scanner.nextFloat();
		
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
	

	}

}
