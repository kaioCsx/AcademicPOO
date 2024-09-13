package prova.ifs;

public class Espadachim extends Guerreiro {
	
	// Construtor de Espadachim.
	public Espadachim(String nome, int vidas) {
		super(nome, vidas);
		
	// Metodos Getters and Setters.	
	}
	private int habilidadeEspada;
	private int velocidade;
	
	public int getHabilidadeEspada() {
		return habilidadeEspada;
	}
	public void setHabilidadeEspada(int habilidadeEspada) {
		this.habilidadeEspada = habilidadeEspada;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
