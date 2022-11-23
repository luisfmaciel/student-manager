package br.infnet.edu.dominio;

public class Professor extends Pessoa{
	
	private String disciplina;
	
	public Professor() {}
	
	public Professor(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	public Professor(String nome, String sobrenome, String email, String disciplina) {
		super(nome, sobrenome, email);
		this.setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
