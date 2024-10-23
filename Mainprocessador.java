package Aula_14;

public class Mainprocessador {
	
	public static void main(String[] args) {
	
	Computador computador = new Computador("apple notebook macbook air","Intel Core i7");

	System.out.println(computador.getModelo() + " contém o seguinte processador: " + computador.getProcessador ());
}
}
