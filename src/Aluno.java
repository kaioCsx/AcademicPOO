package br.edu.ifs.academico;

public class Aluno extends Pessoa{
	public Aluno(String nome) {
		super(nome);
		
	}
	private String nota1;
	private String nota2;
	
	public String getNota1() {
		return nota1;
	}
	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}
	public String getNota2() {
		return nota2;
	}
	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}

}
