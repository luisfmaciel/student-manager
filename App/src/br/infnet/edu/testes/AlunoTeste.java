package br.infnet.edu.testes;

import br.infnet.edu.dominio.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		
		try {
			Aluno al1 = new Aluno();
			al1.setNome("Luis Barbosa");
			al1.setEmail("luis.barbosa@al.infnet.edu.br");
			al1.setNotaAv1(9);
			al1.setNotaAv2(7);
			
			Aluno al2 = new Aluno("vinicius@al.infnet.edu.br", 2, 5);
			
			al1.consultarSituacao(1);
			al2.consultarSituacao(2);	
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}

}
