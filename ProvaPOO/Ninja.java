package prova.ifs;

public class Ninja extends Guerreiro {
	
	// Construtor de Guerreiro
	public Ninja(String nome, int vidas) {
		super(nome, vidas);
		
	// Metodos Getters and Setters.	
	}
	private int rapidez;
	private int aceleracao;
	
	public int getRapidez() {
		return rapidez;
	}
	public void setRapidez(int rapidez) {
		this.rapidez = rapidez;
	}
	public int getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}

}
