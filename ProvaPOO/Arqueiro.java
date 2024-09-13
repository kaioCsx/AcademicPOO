package prova.ifs;

public class Arqueiro extends Guerreiro {
	
	// Construtor de Arqueiro.
	public Arqueiro(String nome, int vidas) {
		super(nome, vidas);
		
	// Metodos Getters and Setters.	
	}
	private int habilidadeArco;
	private int alcance;
	
	public int getHabilidadeArco() {
		return habilidadeArco;
	}
	public void setHabilidadeArco(int habilidadeArco) {
		this.habilidadeArco = habilidadeArco;
	}
	public int getAlcance() {
		return alcance;
	}
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
}
