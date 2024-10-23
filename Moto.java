package Aula_14;

public class Moto extends Brinquedo{
	
	public Moto (String cor, String tipo, String nome,int velocidade) {
		super(cor, tipo, nome,velocidade, velocidade);

	}
	@Override
	public void Mover() {
		System.out.println("O Moto está se movendo a 15KM!");
	}


}
