package prova.ifs;

public class Gladiador extends Guerreiro {
	
	// Construtor de Guerreiro
	public Gladiador(String nome, int vidas) {
		super(nome, vidas);
	
	// Metodos Getters and Setters.
	}
	private int defesa;
	private int escudo;
	
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getEscudo() {
		return escudo;
	}
	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
		
}
