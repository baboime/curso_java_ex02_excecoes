package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import excecoes.ValorExcecao;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Títular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular, saldoInicial, limiteSaque);
		
		System.out.println();
		System.out.print("Informe o valor para saque: ");
		double valorSaque = sc.nextDouble();
		try {
			conta.saque(valorSaque);
			System.out.println("Saldo atualizado: " + String.format("%.2f", conta.getSaldo()));
		} 
		catch (ValorExcecao e) {
			System.out.println("Erro ao efetuar o saque: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		sc.close();
	}

}
