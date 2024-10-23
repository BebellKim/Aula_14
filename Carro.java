package Aula_14;

public class Carro extends Brinquedo{
	
	public Carro (String cor, String tipo, String nome,int velocidade) {
		super(cor, tipo, nome,velocidade, velocidade);

	}
	@Override
	public void Mover() {
		System.out.println("O Carro está se movendo a 10KM!");
	}
}

