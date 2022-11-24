package br.infnet.edu.dominio;

public class Professor extends Pessoa{
	
	private String disciplina;
	
	public Professor() {}
	
	public Professor(String email) {
		super(email);
	}
	
	public Professor(String email, String disciplina) {
		super(email);
		this.setDisciplina(disciplina);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()); 
		sb.append(";"); 
		sb.append(getDisciplina()); 
		
		return sb.toString();
//		return getNome() + ";" + getSobrenome() + ";" + getUltimoNome() + ";" + getEmail() + ";" + getDisciplina();
	}
	
	@Override
	public void consultarSituacao(int codigo) {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(codigo); 
			sb.append(" - "); 
			sb.append(getNome()); 
			sb.append("  | E-mail: "); 
			sb.append(getEmail()); 
			sb.append(" | Disciplina: "); 
			sb.append(getDisciplina()); 
			
			System.out.println(sb.toString());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
