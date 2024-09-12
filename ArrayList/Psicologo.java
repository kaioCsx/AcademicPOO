package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
	public Psicologo(String nome) {
		super(nome);
		
	}
	private String crn;
	private String especialidade;
	private String alocacao;
	
	
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getAlocacao() {
		return alocacao;
	}
	public void setAlocacao(String alocacao) {
		this.alocacao = alocacao;
	}
	

}
