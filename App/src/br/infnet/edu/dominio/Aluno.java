package br.infnet.edu.dominio;
//import  br.infnet.edu.auxiliar.Constante;

public class Aluno extends Pessoa {
	private float notaAv1;
	private float notaAv2;
	
	public Aluno() {}
	
	public Aluno(String nome, String sobrenome, String ultimoNome) {
		super(nome, sobrenome, ultimoNome);
	}
	
	public Aluno(String nome, String sobrenome, String ultimoNome, String email, float notaAv1, float notaAv2) {
		super(nome, sobrenome, ultimoNome, email);
		
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
		return getNome() + ";" + getSobrenome() + ";" + getUltimoNome() + ";" + getEmail() + ";" + getNotaAv1() + ";" + getNotaAv2() + ";" + calculaMediaDoAluno() + ";" + verificaSituacaoDoAluno();
	}

	@Override
	public void consultarSituacao(int codigo) {
		System.out.println(codigo + " - " + this.getNome() + " " + getSobrenome() + " " + getUltimoNome() + " | AV1: " + getNotaAv1() + " | AV2: "
				+ getNotaAv2() + " | MÉDIA: " + calculaMediaDoAluno() + " | SITUAÇÃO: " + verificaSituacaoDoAluno());

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
