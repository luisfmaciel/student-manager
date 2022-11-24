package br.infnet.edu.dominio;
import br.infnet.edu.exceptions.EmailIvalidoException;
import br.infnet.edu.exceptions.NomeInvalidoException;

public class Pessoa {
	private String nome;	
	private String sobrenome;	
	private String ultimoNome;	
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String email){
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(sobrenome);
		sb.append(";");
		sb.append(ultimoNome);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public void consultarSituacao(int codigo) {
		StringBuilder sb = new StringBuilder();
		sb.append(codigo);
		sb.append(" - ");
		sb.append(nome);
		sb.append(" ");
		sb.append(sobrenome);
		sb.append(" ");
		sb.append(ultimoNome);
		sb.append(" | E-mail: ");
		sb.append(email);
		
		System.out.println(sb.toString());
	}
	
	public String getNome() throws NomeInvalidoException {
		
		if(nome == null || sobrenome == null || ultimoNome == null) {
			throw new NomeInvalidoException("O preenchimento do campo 'nome' está incorreto");
		}

		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" ");
		sb.append(sobrenome);
		sb.append(" ");
		sb.append(ultimoNome);
				
		return sb.toString();
	}

	public void setNome(String nome) throws NomeInvalidoException {
		
		if(nome == null) throw new NomeInvalidoException("Campo nome inválido");
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
				 
		if(posInicial < 0 || posFinal < 0) throw new NomeInvalidoException("Campo nome inválido");
			
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailIvalidoException {
		if(!email.contains("@")) throw new EmailIvalidoException("E-mail inválido");
		
		this.email = email;
	}
	
}
