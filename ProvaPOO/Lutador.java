package prova.ifs;

public class Lutador extends Guerreiro {
	
	// Construtor de Guerreiro
	public Lutador(String nome, int vidas) {
		super(nome, vidas);
	
	// Metodos Getters and Setters.
	}
	private int forcaChute;
	private int forcaSoco;
	
	public int getForcaChute() {
		return forcaChute;
	}
	public void setForcaChute(int forcaChute) {
		this.forcaChute = forcaChute;
	}
	public int getForcaSoco() {
		return forcaSoco;
	}
	public void setForcaSoco(int forcaSoco) {
		this.forcaSoco = forcaSoco;
	}

}
