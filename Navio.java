package Aula_14;

public class Navio extends Brinquedo{
	
	public Navio (String cor, String tipo, String nome,int velocidade) {
		super(cor, tipo, nome,velocidade, velocidade);

	}
	@Override
	public void Mover() {
		System.out.println("O Navio está se movendo a 5KM!");
	}

}
