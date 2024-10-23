package Aula_14;

public class Computador {

	private String modelo;
	private Processador processador;
	
	public Computador(String modelo, String processador) {
		this.modelo=modelo;
		this.processador= new Processador(processador);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getProcessador() {
		return processador.getMarca();
	}	

}

