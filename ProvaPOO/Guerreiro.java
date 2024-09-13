package prova.ifs;

public class Guerreiro {
	private String nome;
	private int forca;
	private int vidas;
	
	// Construtor de Guerreiro
	public Guerreiro(String nome, int vidas) {
		super();
		this.setNome(nome);
		this.setVidas(vidas);
		
	// Metodos Getters and Setters.
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}	

}
