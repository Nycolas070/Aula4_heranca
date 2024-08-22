package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Corrente;
import entidade.Poupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> lista = new ArrayList<>();
		
		System.out.print("Bem-Vindo ao Banco do Seduc 1");
		
		System.out.println("Quantas contas você deseja cadastrar? ");
		
		int n = sc.nextInt();
		
		
		for(int i= 1 ; i<= n ; i++) {
			System.out.print("Digite C para Conta Corrente ou P para poupança ");
			String x = sc.next();
			
			if(x.equals("C")) {
				
				System.out.println("Digite o nome do dono da conta " + i);
				String nome = sc.next();
				System.out.println("Digite o numero");
				int numero = sc.nextInt();
				System.out.println("Digite o saldo");
				double saldo = sc.nextDouble();
				System.out.println("Digite o limite");
				double limite = sc.nextDouble();
				
				Conta conta = new Corrente(nome, numero, saldo, limite);
				
				lista.add(conta);
				
			}
			else {
				
				System.out.print("Digite o nome do dono da conta " + i + " " );
				String nome = sc.next();
				System.out.print("Digite o numero ");
				int numero = sc.nextInt();
				System.out.print("Digite o saldo ");
				double saldo = sc.nextDouble();
				
				
				lista.add(new Poupanca(nome, numero,saldo));
				
			}
			
			System.out.println(lista);
		}
			
			
			
		
	}

}
