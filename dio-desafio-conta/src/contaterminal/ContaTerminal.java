package contaterminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nome;
		Double saldo;
		
		System.out.println("Por favor, digite o número da conta:");
		numero = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Por favor, digite o número da Agência:");
		agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do cliente:");
		nome = scanner.nextLine();
		
		System.out.println("Por favor, digite o saldo da conta:");
		saldo = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Olá " + nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque");
	}

}
