package br.infnet.edu.testes;

import br.infnet.edu.dominio.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		
		try {
			Aluno al1 = new Aluno();
			al1.setNome(null);
			al1.setSobrenome("Barbosa");
			al1.setEmail("luis.barbosa@al.infnet.edu.br");
			al1.setNotaAv1(9);
			al1.setNotaAv2(7);
			
			
			Aluno al2 = new Aluno("Felipe", "Maciel", "Barbosa");
			al2.setEmail("felipe.maciel@al.infnet.edu.br");
			al2.setNotaAv1(4);
			al2.setNotaAv2(4);
			
			Aluno al3 = new Aluno("Vinicius", "Freitas", "Pires", "vinicius@al.infnet.edu.br", 2, 5);
			
			al1.consultarSituacao(1);
			al2.consultarSituacao(2);
			al3.consultarSituacao(3);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
