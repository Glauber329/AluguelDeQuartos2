package entities;

public class Aluguel {

	private int numeroQuarto;
	private Pessoa pessoa; // relacionamneto

	public Aluguel(int numeroQuarto, Pessoa pessoa) {
		this.numeroQuarto = numeroQuarto;
		this.pessoa = pessoa;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Locador [Numero Quarto=" + numeroQuarto + ", Locatorio=" + pessoa + "]";
	}

}
