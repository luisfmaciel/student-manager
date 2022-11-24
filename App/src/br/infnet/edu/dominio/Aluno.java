package br.infnet.edu.dominio;

public class Aluno extends Pessoa {
	private float notaAv1;
	private float notaAv2;
	
	public Aluno() {}
	
	public Aluno(String email, float notaAv1, float notaAv2) {
		super(email);
		
		this.setNotaAv1(notaAv1);
		this.setNotaAv2(notaAv2);
	}
	
	private float calculaMediaDoAluno() {
		return (this.notaAv1 + this.notaAv2) / 2;
	}

	private String verificaSituacaoDoAluno() {
		if (calculaMediaDoAluno() >= 7) {
			return "Aprovado";
		} else if (calculaMediaDoAluno() < 4) {
			return "Reprovado";
		}

		return "Prova final";
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()); 
		sb.append(";"); 
		sb.append(getEmail()); 
		sb.append(";"); 
		sb.append(getNotaAv1()); 
		sb.append(";"); 
		sb.append(getNotaAv2()); 
		sb.append(";"); 
		sb.append(calculaMediaDoAluno()); 
		sb.append(";"); 
		sb.append(verificaSituacaoDoAluno()); 
		
		return sb.toString();
	}

	@Override
	public void consultarSituacao(int codigo) {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(codigo); 
			sb.append(" - "); 
			sb.append(getNome()); 
			sb.append(" | AV1: "); 
			sb.append(getNotaAv1()); 
			sb.append(" | AV2: "); 
			sb.append(getNotaAv2()); 
			sb.append(" | MÉDIA: "); 
			sb.append(calculaMediaDoAluno()); 
			sb.append(" | SITUAÇÃO: "); 
			sb.append(verificaSituacaoDoAluno()); 
			
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	public float getNotaAv1() {
		return notaAv1;
	}

	public void setNotaAv1(float notaAv1) {
		this.notaAv1 = notaAv1;
	}

	public float getNotaAv2() {
		return notaAv2;
	}

	public void setNotaAv2(float notaAv2) {
		this.notaAv2 = notaAv2;
	}
}
