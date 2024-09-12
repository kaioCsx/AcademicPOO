package br.edu.ifs.academico;

public class Tecnico extends Pessoa {
	
	public Tecnico(String nome) {
		super(nome);
		
	}
	private String profissao;
	private String laboratorio;
	private String sala;
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	
}
