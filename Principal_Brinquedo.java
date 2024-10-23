package Aula_14;

public class Principal_Brinquedo {
	
	public static void main(String[] args) {
	
	Carro carro = new Carro ("preto", "jeep","renegade",10);
	System.out.println("           Carro             ");
	System.out.println("Cor: " + carro.getCor());
	System.out.println("Tipo: " + carro.getTipo());
	System.out.println("Nome: " + carro.getNome());
	System.out.println("Velocidade: " + carro.getVelocidade());
	carro.Mover();
	
	System.out.println("                       ");
	
	Navio navio = new Navio ("branco", "ocean","ship",5);
	System.out.println("           Navio             ");
	System.out.println("Cor: " + navio.getCor());
	System.out.println("Tipo: " + navio.getTipo());
	System.out.println("Nome: " + navio.getNome());
	System.out.println("Velocidade: " + navio.getVelocidade());
	carro.Mover();
	
	System.out.println("                       ");
	
	Moto moto = new Moto ("preto", "honda","GV",15);
	System.out.println("           Moto             ");
	System.out.println("Cor: " + moto.getCor());
	System.out.println("Tipo: " + moto.getTipo());
	System.out.println("Nome: " + moto.getNome());
	System.out.println("Velocidade: " + moto.getVelocidade());
	carro.Mover();
}
}
