package Aula_14;

public class Principal_livro {
	
	public static void main(String[] args) {
		Livro livro = new Livro ("Alice no país das maravilhas", "Joey France");
		Biblioteca biblioteca = new Biblioteca ("Mundo dos livros", livro);
		System.out.println("O título do livro é: " + livro.getTitulo() + " e o autor do livro é: " + livro.getAutor() + "\nO nome da biblioteca é: " + biblioteca.getNome());
		}


}
