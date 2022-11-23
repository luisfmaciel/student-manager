package br.infnet.edu.dominio;
import br.infnet.edu.exceptions.EmailIvalidoException;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String sobrenome, String ultimoNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ultimoNome = ultimoNome;
	}
	
	public Pessoa(String nome, String sobrenome, String ultimoNome, String email) {
		this(nome, sobrenome, ultimoNome);
		
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + ";" + sobrenome + ";" + ultimoNome + ";" + email;
	}
	
	public void consultarSituacao(int codigo) {
		System.out.println(codigo + " - " + nome + " " + sobrenome + " " + ultimoNome + " | E-mail: " + email);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailIvalidoException {
		if(!email.contains("@")) throw new EmailIvalidoException("E-mail inválido");
		
		this.email = email;
	}
	
}
