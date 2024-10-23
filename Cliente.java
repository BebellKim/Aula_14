package Aula_14;

public class Cliente {
	
	private String nome;
	private Conta_bancaria conta_bancaria;
	public Cliente(String nome,Conta_bancaria conta_bancaria ) {
	this.nome = nome;
	this.conta_bancaria = conta_bancaria;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public Conta_bancaria getConta_bancaria() {
	return conta_bancaria;
	}
	public void setConta_bancaria(Conta_bancaria conta_bancaria) {
	this.conta_bancaria = conta_bancaria;
	}

}
