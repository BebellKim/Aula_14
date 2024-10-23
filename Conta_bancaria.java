package Aula_14;

public class Conta_bancaria {
	
	private String numero;
	private double saldo;
	public Conta_bancaria(String numero,double saldo ) {
	this.numero = numero;
	this.saldo = saldo;
	}
	public String getNumero() {
	return numero;
	}
	public void setNumero(String numero) {
	this.numero = numero;
	}
	public double getSaldo() {
	return saldo;
	}
	public void setSaldo(double saldo) {
	this.saldo = saldo;
	}

}
