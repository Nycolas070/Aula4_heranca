package entidade;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;
	
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void sacar(double saque ) {
		saldo = saldo - saque;
	}
	public void depositar(double deposito ) {
		saldo = saldo + deposito;
	}
	
	public String mostrar() {
		return " o nome é " + nome + " o saldo é " + saldo + " ";
	}
	
	
	
}
