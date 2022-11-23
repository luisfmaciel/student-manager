package br.infnet.edu.dominio;

public class Professor extends Pessoa{
	
	private String disciplina;
	
	public Professor() {}
	
	public Professor(String nome, String sobrenome, String ultimoNome) {
		super(nome, sobrenome, ultimoNome);
	}
	
	public Professor(String nome, String sobrenome, String ultimoNome, String email, String disciplina) {
		super(nome, sobrenome, ultimoNome, email);
		this.setDisciplina(disciplina);
	}
	
	@Override
	public String toString() {
		return getNome() + ";" + getSobrenome() + ";" + getUltimoNome() + ";" + getEmail() + ";" + getDisciplina();
	}
	
	@Override
	public void consultarSituacao(int codigo) {
		System.out.println(codigo + " - " + this.getNome() + " " + getSobrenome() + " " + getUltimoNome() + " | E-mail: " + getEmail() + " | Disciplina: "
				+ getDisciplina());
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
